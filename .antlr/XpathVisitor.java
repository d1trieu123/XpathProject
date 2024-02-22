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
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class XpathVisitor extends ProjectBaseVisitor<LinkedList<Node>>{
    LinkedList<Node> availNodes = new LinkedList<>();
    String docName = "";
    LinkedList<Node> answer = new LinkedList<>();
    HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();
    Stack <HashMap<String, LinkedList<Node>>> contextStack = new Stack<>();

    @Override
    public LinkedList<Node> visitForXQ(ProjectParser.ForXQContext ctx){
        System.out.println("visit for xq " + ctx.getText());
        LinkedList<Node> results = new LinkedList<>();
        HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
        contextStack.push(old);
        FLWR(0, results, ctx);
        System.out.println(results);
        contextMap = contextStack.pop();
        return results;
    }

    public void FLWR(int i, LinkedList<Node> results, ProjectParser.ForXQContext ctx){
        int forLoops = ctx.forClause().var().size();
        if(i == forLoops){
            if(ctx.letClause() != null){
                visit(ctx.letClause());
            }
            if(ctx.whereClause() != null){
                int where = visit(ctx.whereClause()).size();
                if(where == 0){
                    return;
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
                HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
                contextStack.push(old);
                LinkedList<Node> temp = new LinkedList<>();
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
    public LinkedList<Node> visitTagXQ(ProjectParser.TagXQContext ctx){
        String tag = ctx.startTag().tagName().getText();
        System.out.println("VISIT TAG XQ " + tag);
        LinkedList<Node> nodes = visit(ctx.xq());
        Node node = makeElem(tag,nodes);
        LinkedList<Node> res = new LinkedList<>();
        res.add(node);
        return res;

    }

    public Node makeElem(String tag, LinkedList<Node> nodes){
        Document doc = null;
        Node result = doc.createElement(tag);
        return result;
    }

    @Override
    public LinkedList<Node> visitApXQ(ProjectParser.ApXQContext ctx){
        System.out.println("VISIT AP XQ " + ctx.getText());
        return visit(ctx.ap());
    }

    @Override
    public LinkedList<Node> visitLetXQ(ProjectParser.LetXQContext ctx){
        System.out.println("VISIT LET XQ " + ctx.getText());
        HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
        contextStack.push(old);
        LinkedList<Node> res = visitChildren(ctx);
        contextMap = contextStack.pop();
        return res;
    }

    @Override
    public LinkedList<Node> visitCommaXQ(ProjectParser.CommaXQContext ctx){
        System.out.println("COMMA XQ "  + ctx.xq(0).getText() + " " + ctx.xq(1).getText());
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> left = visit(ctx.xq(0));
        LinkedList<Node> right = visit(ctx.xq(1));
        res.addAll(left);
        res.addAll(right);
        return res;
    }

    @Override
    public LinkedList<Node> visitVarXQ(ProjectParser.VarXQContext ctx){
        System.out.println("VISIT VAR " + ctx.var().getText());
        String var = ctx.var().getText();
        return contextMap.get(var);
    }

    @Override
    public LinkedList<Node> visitStringXQ(ProjectParser.StringXQContext ctx){

        String str = ctx.stringConstant().getText();
        System.out.println("STRING XQ " + str);
        str = str.substring(1, str.length() - 1);
        Node node = makeText(str);
        LinkedList<Node> res = new LinkedList<>();
        res.add(node);
        return res;
    }

    public Node makeText(String str){
        Node temp = null;
        return temp;

    }

    @Override
    public LinkedList<Node> visitParenXQ(ProjectParser.ParenXQContext ctx){
        return visit(ctx.xq());
    }

    @Override
    public LinkedList<Node> visitChildXQ(ProjectParser.ChildXQContext ctx){
        System.out.println("CHILD XQ " + ctx.getText());
        availNodes = visit(ctx.xq());
        LinkedList<Node> res = new LinkedList<>();
        for(Node node: availNodes){
            LinkedList<Node> children = visit(ctx.rp());
            res.addAll(children);
        }
        return res;


        
    }

    @Override 
    public LinkedList<Node> visitDescendXQ(ProjectParser.DescendXQContext ctx){
        System.out.println("DESCEND XQ " + ctx.getText());
        LinkedList<Node> tmp = visit(ctx.xq());
        tmp.addAll(getChildren(tmp.get(0)));
        availNodes = tmp;
        LinkedList<Node> res = new LinkedList<>();
        for(Node node: tmp){
            LinkedList<Node> children = visit(ctx.rp());
            res.addAll(children);
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitForClause(ProjectParser.ForClauseContext ctx){

        return null;
    }

    @Override
    public LinkedList<Node> visitLetClause(ProjectParser.LetClauseContext ctx){
        for(int i =0 ; i<ctx.var().size(); i++){
            String var = ctx.var(i).getText();
            LinkedList<Node> value = visit(ctx.xq(i));
            contextMap.put(var, value);
        }

        return null;
    }

    @Override
    public LinkedList<Node> visitWhereClause(ProjectParser.WhereClauseContext ctx){
        return visit(ctx.cond());
    }

    @Override
    public LinkedList<Node> visitReturnClause(ProjectParser.ReturnClauseContext ctx){
        return visit(ctx.rt());
    }

    @Override
    public LinkedList<Node> visitTagReturn(ProjectParser.TagReturnContext ctx){
        String tag = ctx.startTag().tagName().getText();
        LinkedList<Node> nodes = visit(ctx.rt());
        Node node = makeElem(tag,nodes);
        LinkedList<Node> res = new LinkedList<>();
        res.add(node);
        return res;
    }

    @Override
    public LinkedList<Node> visitCommaReturn(ProjectParser.CommaReturnContext ctx){
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> left = visit(ctx.rt(0));
        LinkedList<Node> right = visit(ctx.rt(1));
        res.addAll(left);
        res.addAll(right);
        return res;
    }

    @Override
    public LinkedList<Node> visitXqReturn(ProjectParser.XqReturnContext ctx){
        return visit(ctx.xq());
    }


    public LinkedList<Node> getChildren(Node node){
        LinkedList<Node> children = new LinkedList<>();
        Node child;
        NodeList childrenNodes = node.getChildNodes();
        for(int i = 0; i < childrenNodes.getLength(); i++){
            child = childrenNodes.item(i);
            children.add(child);
            children.addAll(getChildren(child));
        }
        return children;
    }
    public LinkedList<Node> visitDescendant(ProjectParser.RpContext ctx){
        System.out.println("visit descendant " + ctx.getText());
        LinkedList<Node> tmp = new LinkedList<>();
        for(Node node: this.availNodes){
            System.out.println(node);
            tmp.addAll(getChildren(node));
        }
        System.out.println("this is fine");
        for(Node node : tmp){
            if(!this.availNodes.contains(node)){
                this.availNodes.add(node);
            }
        }
        return visit(ctx);
    }

    @Override
    public LinkedList<Node> visitChildAP(ProjectParser.ChildAPContext ctx){
        this.availNodes = visit(ctx.doc());
        answer = visit(ctx.rp());
        return answer;
    }
    @Override
    public LinkedList<Node> visitDescendAP(ProjectParser.DescendAPContext ctx){
        this.availNodes = visit(ctx.doc());
        System.out.println("doc " + availNodes);
        answer = visitDescendant(ctx.rp());

        return answer;

    }

    @Override
    public LinkedList<Node> visitDocName(ProjectParser.DocNameContext ctx){
        String fileName = ctx.filename().getText();
        File xmlFile = new File(fileName);
        docName = fileName;
        LinkedList<Node> res = new LinkedList<>();
        DocumentBuilderFactory db = DocumentBuilderFactory.newInstance();
        db.setIgnoringElementContentWhitespace(true);
        try{
            DocumentBuilder dbuilder = db.newDocumentBuilder();
            Document doc = dbuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            res.add(doc);
        } catch (ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
        return res;


    }
    @Override 
    public LinkedList<Node> visitDescendRP(ProjectParser.DescendRPContext ctx){
       this.availNodes = visit(ctx.rp(0));
       return visitDescendant(ctx.rp(1));
    }

    @Override
    public LinkedList<Node> visitTextRP(ProjectParser.TextRPContext ctx){
        NodeList children;
        Node child;
        LinkedList<Node> res = new LinkedList<>();
        for(Node node: this.availNodes){
            children = node.getChildNodes();
            for(int i = 0; i < children.getLength(); i++){
                child = children.item(i);
                if(child.getNodeType() == Node.TEXT_NODE){
                    res.add(child);
                }
            }
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitAttrRP(ProjectParser.AttrRPContext ctx){
        LinkedList<Node> res = new LinkedList<>();

        NamedNodeMap attributes;

        for(Node node : this.availNodes){
            attributes = node.getAttributes();
            for(int i = 0; i<attributes.getLength(); i++){
                res.add(attributes.item(i));
            }
        }
        this.availNodes = res;
        return visit(ctx.attrName());
    }

    @Override
    public LinkedList<Node> visitAttrName(ProjectParser.AttrNameContext ctx) {
        LinkedList<Node> res = new LinkedList<>(); // result nodes
        for(Node node: this.availNodes){
            if(node.getNodeName().equals(ctx.getText())){
                res.add(node);
            }
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitParentRP(ProjectParser.ParentRPContext ctx){
        LinkedList<Node> res = new LinkedList<>();
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
    public LinkedList<Node> visitSelfRP(ProjectParser.SelfRPContext ctx){
        return this.availNodes;
    }
    @Override 
    public LinkedList<Node> visitFilterPath(ProjectParser.FilterPathContext ctx){
        System.out.println("filter path " + ctx.getText());
        this.availNodes = visit(ctx.rp());
        System.out.println(availNodes);
        return visit(ctx.pf());
    }

    @Override
    public LinkedList<Node> visitUnionRP(ProjectParser.UnionRPContext ctx){
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
    public LinkedList<Node> visitParenRP(ProjectParser.ParenRPContext ctx){
        return visit(ctx.rp());
    }

    @Override
    public LinkedList<Node> visitChildrenRP(ProjectParser.ChildrenRPContext ctx){
       LinkedList<Node> res = new LinkedList<>();
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
    public LinkedList<Node> visitTagRP(ProjectParser.TagRPContext ctx){
        LinkedList<Node> tmp = new LinkedList<>();
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
        return visit(ctx.tagName());
    }

    @Override
    public LinkedList<Node> visitTagName(ProjectParser.TagNameContext ctx) {
        LinkedList<Node> res = new LinkedList<>(); // result nodes

        for (Node node: this.availNodes){
            
            if (node.getNodeName().equals(ctx.getText())){

                res.add(node);
            }
                
        }
        return res;
    }

    @Override
    public LinkedList<Node> visitChildRP(ProjectParser.ChildRPContext ctx){
        
        
        this.availNodes = visit(ctx.rp(0));
        System.out.println("avail nodes " + availNodes);
        return visit(ctx.rp(1));
        
    }

    @Override
    public LinkedList<Node> visitEqualsPF(ProjectParser.EqualsPFContext ctx) {

        LinkedList<Node> tmp = this.availNodes;
        LinkedList<Node> res = new LinkedList<>();

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
            evalNode.add(node);

            this.availNodes = evalNode;
            LinkedList<Node> l = visit(ctx.rp(0)); // left nodes

            this.availNodes = evalNode;
            LinkedList<Node> r = visit(ctx.rp(1)); // right nodes

            // Why not break the loop after finding the first equal node?
            for (Node ln: l)
                for (Node rn: r)
                    if (ln.isEqualNode(rn) && !res.contains(node))
                        res.add(node);
        }

        this.availNodes = res;
        return res;
    }

    @Override
    public LinkedList<Node> visitSamePF(ProjectParser.SamePFContext ctx) {
        LinkedList<Node> tmp = this.availNodes;
        LinkedList<Node> res = new LinkedList<>();

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
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
    public LinkedList<Node> visitRpPF(ProjectParser.RpPFContext ctx) {
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> tmp = this.availNodes;

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
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
    public LinkedList<Node> visitParenPF(ProjectParser.ParenPFContext ctx) {
        return visit(ctx.pf());
    }

    @Override
    public LinkedList<Node> visitAndPF(ProjectParser.AndPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<>(visit(ctx.pf(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.pf(1)));

        ls.retainAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitOrPF(ProjectParser.OrPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<>(visit(ctx.pf(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.pf(1)));

        ls.addAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitNotPF(ProjectParser.NotPFContext ctx) {
        LinkedList<Node> res;
        HashSet<Node> frontier = new HashSet<>(this.availNodes);
        HashSet<Node> remover = new HashSet<>(visit(ctx.pf()));

        frontier.removeAll(remover);
        res = new LinkedList<>(frontier);


        return res;
    }

    @Override
    public LinkedList<Node> visitStringPF(ProjectParser.StringPFContext ctx) {
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> temp = this.availNodes;
        String str = ctx.comparisonString().getText();
        str = str.substring(1, str.length() - 1);
        System.out.println(str);


        for(Node node: temp){

            LinkedList<Node> comparisons = new LinkedList<>();
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

    public String getFileName(){
        return docName;
    }
}
