import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.io.File;
import java.io.FileOutputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XpathVisitor extends XQueryBaseVisitor<LinkedList<Node>> {

    LinkedList<Node> availNodes = new LinkedList<Node>();

    Document doc;
    String docName = "";
    Node docRootNode;

    LinkedList<Node> answer = new LinkedList<Node>();

    HashMap<String, LinkedList<Node>> contextMap = new HashMap<String, LinkedList<Node>>();

    Stack <HashMap<String, LinkedList<Node>>> contextStack = new Stack<HashMap<String, LinkedList<Node>>>();



/**************************************************
 * XQuery Helpers
**************************************************/
public Node makeElem(String tag, LinkedList<Node> nodes){
    Node result = doc.createElement(tag);

    for (Node elem : nodes) {
        result.appendChild(elem.cloneNode(true));
    }

    return result;
}

public Node makeText(String str){
    return doc.createTextNode(str);
}



/**************************************************
 * XQuery Expressions
**************************************************/
@Override
public LinkedList<Node> visitVarXQ(XQueryParser.VarXQContext ctx){
    System.out.println("VISIT VAR " + ctx.var().getText());
    String var = ctx.var().getText();
    return contextMap.get(var);
}

@Override
public LinkedList<Node> visitStrXQ(XQueryParser.StrXQContext ctx) {
    String str = ctx.strconst().getText();
    System.out.println("STRING XQ " + str);
    str = str.substring(1, str.length() - 1);
    Node node = makeText(str);
    LinkedList<Node> res = new LinkedList<Node>();
    res.add(node);
    return res;
}

@Override
public LinkedList<Node> visitApXQ(XQueryParser.ApXQContext ctx){
    System.out.println("VISIT AP XQ " + ctx.getText());
    return visit(ctx.ap());
}

@Override
public LinkedList<Node> visitParenXQ(XQueryParser.ParenXQContext ctx){
    return visit(ctx.xq());
}

@Override
public LinkedList<Node> visitCommaXQ(XQueryParser.CommaXQContext ctx){
    System.out.println("COMMA XQ "  + ctx.xq(0).getText() + " " + ctx.xq(1).getText());
    
    LinkedList<Node> res = new LinkedList<Node>();

    LinkedList<Node> left = visit(ctx.xq(0));
    LinkedList<Node> right = visit(ctx.xq(1));

    res.addAll(left);
    res.addAll(right);

    return res;
}

@Override
public LinkedList<Node> visitSlashXQ(XQueryParser.SlashXQContext ctx){
    System.out.println("CHILD XQ " + ctx.getText());
    availNodes = visit(ctx.xq());
    LinkedList<Node> res = new LinkedList<Node>();
    for(Node node: availNodes){
        LinkedList<Node> children = visit(ctx.rp());
        res.addAll(children);
    }
    return res;
}

@Override 
public LinkedList<Node> visitDoubleslashXQ(XQueryParser.DoubleslashXQContext ctx){
    System.out.println("DESCEND XQ " + ctx.getText());
    LinkedList<Node> tmp = visit(ctx.xq());
    tmp.addAll(getChildren(tmp.get(0)));
    availNodes = tmp;
    LinkedList<Node> res = new LinkedList<Node>();
    for(Node node: tmp){
        LinkedList<Node> children = visit(ctx.rp());
        res.addAll(children);
    }
    return res;
}

@Override
public LinkedList<Node> visitTagXQ(XQueryParser.TagXQContext ctx){
    String tag = ctx.tagname(0).getText();
    System.out.println("VISIT TAG XQ " + tag);

    LinkedList<Node> nodes = visit(ctx.xq());
    Node node = makeElem(tag, nodes);

    LinkedList<Node> res = new LinkedList<Node>();
    res.add(node);

    return res;

}


    @Override
    public LinkedList<Node> visitFlwrXQ(XQueryParser.FlwrXQContext ctx){
        System.out.println("visit for xq " + ctx.getText());

        //LinkedList<Node> results = new LinkedList<Node>();

        HashMap<String, LinkedList<Node>> old = new HashMap<String, LinkedList<Node>>(contextMap);
        contextStack.push(old);

        //FLWR(0, results, ctx);
        //ctx.
        visit(ctx.forClause());

        if (ctx.letClause() != null) {
            visit(ctx.letClause());
        }

        if (ctx.whereClause() != null) {
            visit(ctx.whereClause());
        }

        LinkedList<Node> results = visit(ctx.returnClause());
        System.out.println(results);

        contextMap = contextStack.pop();

        return results;
    }



    public void FLWR(int i, LinkedList<Node> results, XQueryParser.FlwrXQContext ctx){
        int forLoops = ctx.forClause().var().size();

        if(i == forLoops){
            if(ctx.letClause() != null){
                visit(ctx.letClause());
            }
            if(ctx.whereClause() != null){
                LinkedList<Node> whereResults = visit(ctx.whereClause());

                if (whereResults != null) {
                    if (whereResults.size() == 0) {
                        return;
                    }
                }
            }
            LinkedList<Node> returnNodes = visit(ctx.returnClause());
            results.addAll(returnNodes);
        }
        else{
            System.out.println("FOR LOOP " + (i+1));
            String var = ctx.forClause().var(i).getText();
            LinkedList<Node> values = visit(ctx.forClause().xq(i));
            for(Node value: values){
                HashMap<String, LinkedList<Node>> old = new HashMap<String, LinkedList<Node>>(contextMap);
                contextStack.push(old);

                LinkedList<Node> temp = new LinkedList<Node>();
                temp.add(value);
                contextMap.put(var, temp);

                if(i+1 <= forLoops){
                    FLWR(i+1, results, ctx);
                }
                contextMap = contextStack.pop();
            }
        }
    }

    @Override
    public LinkedList<Node> visitLetXQ(XQueryParser.LetXQContext ctx){
        System.out.println("VISIT LET XQ " + ctx.getText());

        HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
        contextStack.push(old);

        LinkedList<Node> res = visitChildren(ctx);
        contextMap = contextStack.pop();

        return res;
    }





/**************************************************
 * Clause Expressions
**************************************************/
    @Override
    public LinkedList<Node> visitForClause(XQueryParser.ForClauseContext ctx){

        if (ctx.var().size() != ctx.xq().size()) {
            return null;
        }

        LinkedList<Node> allVals = new LinkedList<Node>();

        // this HashMap should be added to 
        HashMap<String, LinkedList<Node>> forVars = new HashMap<String, LinkedList<Node>>();

        for (int i = 0; i < ctx.var().size(); i++) {
            String varName = ctx.var(i).WORD().toString();

            LinkedList<Node> xqResults = visit(ctx.xq(i));
            allVals.addAll(xqResults);

            forVars.put(varName, xqResults);
        }
        contextMap.putAll(forVars);

        return allVals;
    }

    @Override
    public LinkedList<Node> visitLetClause(XQueryParser.LetClauseContext ctx){
        /*/
        if (ctx.var().size() != ctx.xq().size()) {
            return null;
        }

        LinkedList<Node> result = new LinkedList<Node>();

        for (int i =0 ; i<ctx.var().size(); i++) {

            String var = ctx.var(i).WORD().toString();

            LinkedList<Node> value = visit(ctx.xq(i));

            // var known in parent scope, find intersection
            if (contextMap.keySet().contains(var)) {
                LinkedList<Node> valsFromParentScope = contextMap.get(var);

                for (int j = 0; j < valsFromParentScope.size(); j++) {
                    Node candidate = valsFromParentScope.get(j);

                    //if () {

                    //}
                }
            }
            else { // local var

            }

            //allVals.addAll(value);

            contextMap.put(var, value);
        }

        return result;*/
        return null;
    }

    @Override
    public LinkedList<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx){
        return visit(ctx.condition());
    }

    @Override
    public LinkedList<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx){
        return visit(ctx.xq());
    }

/*    @Override
    public LinkedList<Node> visitSomeClause(XQueryParser.someClause ctx) {
        HashMap<String, LinkedList<Node>> someVars = new HashMap<String, LinkedList<Node>>();

        LinkedList<String> variables = new LinkedList<String>();

        for (int i = 0; i < ctx.var().size(); i++) {
            String varName = ctx.var(i).WORD().toString();

            LinkedList<Node> vals = visit(ctx.xq(i));

            someVars.put(varName, vals);
            variables.add(varName);
        }

        LinkedList<Node> condSatisfyingNodes = visit(ctx.condition());

        LinkedList<Node> results = new LinkedList<Node>();

        for (int i = 0; i < variables.size(); i++) {
            LinkedList<Node> currentNodes = someVars.get(variables.get(i));

            for (int j = 0; j < currentNodes.size(); j++) {
                Node candidate = currentNodes.get(j);

                if (condSatisfyingNodes.contains(candidate)) {
                    results.add(candidate);
                }
            }
        }

        return results;
    }*/






/**************************************************
 * Condition Expressions
**************************************************/
    @Override
    public LinkedList<Node> visitValueEqualityCond(XQueryParser.ValueEqualityCondContext ctx) {
        LinkedList<Node> xq1 = visit(ctx.xq(0));
        LinkedList<Node> xq2 = visit(ctx.xq(1));

        LinkedList<Node> result = new LinkedList<Node>();

        for(int i = 0; i < xq1.size(); i++) {
            Node nodeA = xq1.get(i);

            for (int j = 0; j < xq2.size(); j++) {
                Node nodeB = xq2.get(j);

                // this function uses a stricter definition of node equality than the grammar spec
                if ( nodeA.isEqualNode(nodeB) ) {
                    result.add(nodeB);
                    break;
                }
            }
        }

        return result;
    }


    @Override
    public LinkedList<Node> visitIdEqualityCond(XQueryParser.IdEqualityCondContext ctx) {
        LinkedList<Node> xq1 = visit(ctx.xq(0));
        LinkedList<Node> xq2 = visit(ctx.xq(1));

        LinkedList<Node> result = new LinkedList<Node>();

        for(int i = 0; i < xq1.size(); i++) {
            Node nodeA = xq1.get(i);

            for (int j = 0; j < xq2.size(); j++) {
                Node nodeB = xq2.get(j);

                if ( nodeA.isSameNode(nodeB) ) {
                    result.add(nodeB);
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public LinkedList<Node> visitEmptyCond(XQueryParser.EmptyCondContext ctx) {
        LinkedList<Node> xq = visit(ctx.xq());
        // ????
        return null;
    }

    @Override
    public LinkedList<Node> visitSomeCond(XQueryParser.SomeCondContext ctx) {
        return visit(ctx.someClause());
    }

    @Override
    public LinkedList<Node> visitParenCond(XQueryParser.ParenCondContext ctx) {
        return visit(ctx.xq());
    }

    //Intersection
    @Override
    public LinkedList<Node> visitAndCond(XQueryParser.AndCondContext ctx) {
        LinkedList<Node> xq1 = visit(ctx.xq(0));
        LinkedList<Node> xq2 = visit(ctx.xq(1));

        LinkedList<Node> result = new LinkedList<Node>();

        for(int i = 0; i < xq1.size(); i++) {
            Node nodeA = xq1.get(i);

            for (int j = 0; j < xq2.size(); j++) {
                Node nodeB = xq2.get(j);

                if (nodeA.isEqualNode(nodeB)) {
                    result.add(nodeB);
                    break;
                }
            }
        }

        return result;
    }

    // Union
    @Override
    public LinkedList<Node> visitOrCond(XQueryParser.OrCondContext ctx) {
        LinkedList<Node> xq1 = visit(ctx.xq(0));
        LinkedList<Node> xq2 = visit(ctx.xq(1));

        LinkedList<Node> result = new LinkedList<Node>();

        result.addAll(xq1);

        for (int i = 0; i < xq2.size(); i++) {
            Node curr = xq2.get(i);

            if ( !result.contains(curr) ) {
                result.add(curr);
            }
        }

        return result;
    }

    @Override
    public LinkedList<Node> visitNotCond(XQueryParser.NotCondContext ctx) {
        return null;
    }





/**************************************************
 * Abspath Helpers
**************************************************/
    public LinkedList<Node> getChildren(Node node){
        LinkedList<Node> children = new LinkedList<Node>();
        Node child;
        NodeList childrenNodes = node.getChildNodes();

        for (int i = 0; i < childrenNodes.getLength(); i++) {
            child = childrenNodes.item(i);
            children.add(child);
            children.addAll(getChildren(child));
        }
        return children;
    }

    public LinkedList<Node> visitDescendant(XQueryParser.RpContext ctx){
        System.out.println("visit descendant " + ctx.getText());

        LinkedList<Node> tmp = new LinkedList<Node>();

        for (Node node: this.availNodes) {
            System.out.println(node);
            tmp.addAll(getChildren(node));
        }

        System.out.println("this is fine");

        for (Node node : tmp) {
            if(!this.availNodes.contains(node)){
                this.availNodes.add(node);
            }
        }
        return visit(ctx);
    }


/**************************************************
 * Abspath Expressions
**************************************************/
    @Override
    public LinkedList<Node> visitChildAP(XQueryParser.ChildAPContext ctx){
        this.availNodes = visit(ctx.doc());
        answer = visit(ctx.rp());
        return answer;
    }
    @Override
    public LinkedList<Node> visitDescendAP(XQueryParser.DescendAPContext ctx){
        //this.availNodes = 
        visit(ctx.doc());
        this.availNodes.add(docRootNode);
        System.out.println("doc " + availNodes);
        answer = visitDescendant(ctx.rp());

        return answer;

    }

    @Override
    public LinkedList<Node> visitDocName(XQueryParser.DocNameContext ctx) {
        String fileName = ctx.filename().getText().replace("\"", "");
        //fileName = fileName.substring(1, fileName.length() - 1);
        fileName = "test/data/" + fileName;
        System.out.println("FILENAME " + fileName);

        File xmlFile = new File(fileName);
        docName = fileName;

        LinkedList<Node> res = new LinkedList<Node>();
        DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
        db.setIgnoringElementContentWhitespace(true);

        try{
            DocumentBuilder dbuilder = db.newDocumentBuilder();
            //Document 
            doc = dbuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            docRootNode = doc.getDocumentElement();
            System.out.println(docRootNode.toString());
            res.add(docRootNode);
        } 
        catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("WEE WOO WEE WOO");
            e.printStackTrace();
        }

        return res;
    }





/**************************************************
 * Relpath Expressions
**************************************************/
    @Override 
    public LinkedList<Node> visitDescendRP(XQueryParser.DescendRPContext ctx){
       this.availNodes = visit(ctx.rp(0));
       return visitDescendant(ctx.rp(1));
    }

    @Override
    public LinkedList<Node> visitTextRP(XQueryParser.TextRPContext ctx){
        NodeList children;
        Node child;
        LinkedList<Node> res = new LinkedList<Node>();

        for(Node node: this.availNodes){
            children = node.getChildNodes();

            for(int i = 0; i < children.getLength(); i++) {
                child = children.item(i);
                if(child.getNodeType() == Node.TEXT_NODE) {
                    res.add(child);
                }
            }
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitAttrRP(XQueryParser.AttrRPContext ctx){
        LinkedList<Node> res = new LinkedList<Node>();

        NamedNodeMap attributes;

        for(Node node : this.availNodes){
            attributes = node.getAttributes();
            for(int i = 0; i<attributes.getLength(); i++){
                res.add(attributes.item(i));
            }
        }
        this.availNodes = res;
        String attr = ctx.WORD().getText();
        LinkedList<Node> res2 = new LinkedList<Node>();
        for(Node node: this.availNodes){
            if(node.getNodeName().equals(attr)){
                res2.add(node);
            }
        }
        return res2;
    }

    @Override
    public LinkedList<Node> visitParentRP(XQueryParser.ParentRPContext ctx){
        LinkedList<Node> res = new LinkedList<Node>();
        Node parentNode;
        for(Node node: this.availNodes){
            parentNode = node.getParentNode();
            if(!res.contains(parentNode)){
                res.add(parentNode);
            
            }
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitSelfRP(XQueryParser.SelfRPContext ctx){
        return this.availNodes;
    }
    @Override 
    public LinkedList<Node> visitFilterPath(XQueryParser.FilterPathContext ctx){
        System.out.println("filter path " + ctx.getText());

        this.availNodes = visit(ctx.rp());
        System.out.println(availNodes);

        return visit(ctx.filter());
    }

    @Override
    public LinkedList<Node> visitCommaRP(XQueryParser.CommaRPContext ctx){
        LinkedList<Node> res1 = visit(ctx.rp(0));
        LinkedList<Node> res2 = visit(ctx.rp(1));

        for(Node node: res2){
            if(!res1.contains(node)){
                res1.add(node);
            }
        }
        return res1;
    }

    @Override
    public LinkedList<Node> visitParenRP(XQueryParser.ParenRPContext ctx){
        return visit(ctx.rp());
    }

    @Override
    public LinkedList<Node> visitChildrenRP(XQueryParser.ChildrenRPContext ctx){
       LinkedList<Node> res = new LinkedList<Node>();
       NodeList children;

       for(Node node: this.availNodes){
           children = node.getChildNodes();
           for(int i = 0; i < children.getLength(); i++){
               res.add(children.item(i));
           }
       }
       return res;
    }

    @Override
    public LinkedList<Node> visitTagRP(XQueryParser.TagRPContext ctx){
        LinkedList<Node> tmp = new LinkedList<Node>();
        NodeList children;
        Node child;

        for (Node node : this.availNodes) {
            children = node.getChildNodes();
            // iterate the children to find the nodes with the right tag
            for (int i = 0; i < children.getLength(); i++) {
                child = children.item(i);
                // Only element nodes have tag names.
                if (child.getNodeType() == Node.ELEMENT_NODE) {
                    tmp.add(child);
                }
            }
        }
        this.availNodes = tmp;
        return visit(ctx.tagname());
    }

    @Override
    public LinkedList<Node> visitTagname(XQueryParser.TagnameContext ctx) {
        LinkedList<Node> res = new LinkedList<Node>(); // result nodes

        for (Node node: this.availNodes) {
            if (node.getNodeName().equals(ctx.getText())) {
                res.add(node);
            }
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitChildRP(XQueryParser.ChildRPContext ctx){
        
        
        this.availNodes = visit(ctx.rp(0));
        System.out.println("avail nodes " + availNodes);
        return visit(ctx.rp(1));
        
    }




/**************************************************
 * Filter Expressions
**************************************************/
    @Override
    public LinkedList<Node> visitEqualsPF(XQueryParser.EqualsPFContext ctx) {

        LinkedList<Node> tmp = this.availNodes;
        LinkedList<Node> res = new LinkedList<Node>();

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<Node>();
            evalNode.add(node);

            this.availNodes = evalNode;
            LinkedList<Node> l = visit(ctx.rp(0)); // left nodes

            this.availNodes = evalNode;
            LinkedList<Node> r = visit(ctx.rp(1)); // right nodes

            for (Node ln: l)
                for (Node rn: r)
                    if (ln.isEqualNode(rn) && !res.contains(node))
                        res.add(node);
        }

        this.availNodes = res;
        return res;
    }

    @Override
    public LinkedList<Node> visitSamePF(XQueryParser.SamePFContext ctx) {
        LinkedList<Node> tmp = this.availNodes;
        LinkedList<Node> res = new LinkedList<Node>();

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<Node>();
            evalNode.add(node);

            this.availNodes = evalNode;
            LinkedList<Node> l = visit(ctx.rp(0));

            this.availNodes = evalNode;
            LinkedList<Node> r = visit(ctx.rp(1));

            // Why not break the loop after finding the first equal node?
            for (Node ln: l)
                for (Node rn: r)
                    if (ln.isSameNode(rn) && !res.contains(node))
                        res.add(node);
        }

        this.availNodes = res;
        return res;
    }

    @Override
    public LinkedList<Node> visitRpPF(XQueryParser.RpPFContext ctx) {
        LinkedList<Node> res = new LinkedList<Node>();
        LinkedList<Node> tmp = this.availNodes;

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<Node>();
            evalNode.add(node);
            this.availNodes = evalNode;
            System.out.println(node);
            if (visit(ctx.rp()).size() != 0)
                
                res.add(node);
        }

        this.availNodes = res;
        return res;
    }

    @Override
    public LinkedList<Node> visitParenPF(XQueryParser.ParenPFContext ctx) {
        return visit(ctx.filter());
    }

    @Override
    public LinkedList<Node> visitApPF(XQueryParser.ApPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<Node>(visit(ctx.filter(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<Node>(visit(ctx.filter(1)));

        ls.retainAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitOrPF(XQueryParser.OrPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<Node>(visit(ctx.filter(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<Node>(visit(ctx.filter(1)));

        ls.addAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitNotPF(XQueryParser.NotPFContext ctx) {
        LinkedList<Node> res;
        HashSet<Node> frontier = new HashSet<Node>(this.availNodes);
        HashSet<Node> remover = new HashSet<Node>(visit(ctx.filter()));

        frontier.removeAll(remover);
        res = new LinkedList<>(frontier);


        return res;
    }

    @Override
    public LinkedList<Node> visitStringPF(XQueryParser.StringPFContext ctx) {
        LinkedList<Node> res = new LinkedList<Node>();

        LinkedList<Node> temp = new LinkedList<Node>();
        temp.addAll(this.availNodes);

        String str = ctx.strconst().getText();
        //str = str.substring(1, str.length() - 1);
        str = str.replace("\"", "");
        System.out.println(str);


        for(Node node: temp){

            LinkedList<Node> comparisons = new LinkedList<Node>();
            comparisons.add(node);
            this.availNodes = comparisons;
            LinkedList<Node> check = visit(ctx.rp());
            
            for(Node node2 : check){
                String str2 = node2.getNodeValue();
                String noquotes = str2.replaceAll("\\s", "");
                if(noquotes.equals(str) && !res.contains(node)){
                    res.add(node);
                }
            }
        }
        this.availNodes = res;
        return res;
    }

   




/*
    public static void prettyPrintToFile(LinkedList<Node> nodeList, String filePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
    
            // Create a new document for pretty printing
            Document subdoc = builder.newDocument();
            Element tempRootElement = subdoc.createElement("result"); // Create a temporary root element
    
            for (Node node : nodeList) {
                // Import the node into the subdocument
                Node copy = subdoc.importNode(node, true);
    
                // Append the imported node to the temporary root element
                tempRootElement.appendChild(copy);
            }
    
            // Append the temporary root element to the subdocument
            subdoc.appendChild(tempRootElement);
    
            // Prepare the output file
            File outputFile = new File(filePath);
            OutputStream outStream = new FileOutputStream(outputFile);
    
            // Print the formatted XML to the file
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty("indent", "yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
    
            DOMSource source = new DOMSource(tempRootElement);
            StreamResult result = new StreamResult(outStream);
            transformer.transform(source, result);
    
            // Close the output stream
            outStream.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printNodes(){
        prettyPrintToFile(answer,"answer.txt");
    }
    */

    public String getFileName(){
        return docName;
    }
}
