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

public class XpathVisitor extends XQueryBaseVisitor<LinkedList<Node>>{
    LinkedList<Node> availNodes = new LinkedList<>();
    String docName = "";
    LinkedList<Node> answer = new LinkedList<>();
    HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();
    Stack <HashMap<String, LinkedList<Node>>> contextStack = new Stack<>();

    //XQ LOGIC

    @Override
    public LinkedList<Node> visitFlwrXQ(XQueryParser.FlwrXQContext ctx){
        System.out.println("visit for xq " + ctx.getText());
        LinkedList<Node> results = new LinkedList<>();
        HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
        contextStack.push(old);
        FLWR(0, results, ctx);
        System.out.println(results);
        contextMap = contextStack.pop();
        return results;
    }

    // I create this FLWR helper so that I can recursively call it to handle nested for loops
    // I used a stack so that I can keep track of the context of the variables
    public void FLWR(int i, LinkedList<Node> results, XQueryParser.FlwrXQContext ctx){
        int forLoops = ctx.forClause().var().size(); 
        if(i == forLoops){ // if we are at the last for loop, we can start evaluating the rest of the FLWR
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
        else{  // if we are not at the last for loop, we need to keep going add more variable values to the context
            String var = ctx.forClause().var(i).getText();
            LinkedList<Node> values = visit(ctx.forClause().xq(i));
            for(Node value: values){
                HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
                contextStack.push(old);
                LinkedList<Node> temp = new LinkedList<>();
                temp.add(value);
                contextMap.put(var, temp);
                if(i+1 <= forLoops){   // if there are more for loops, keep going
                    FLWR(i+1, results, ctx);
                }
                contextMap = contextStack.pop();
            }

        }
    }

    @Override
    public LinkedList<Node> visitTagXQ(XQueryParser.TagXQContext ctx){         
        String tag = ctx.tagname(0).getText();
        System.out.println("VISIT TAG XQ " + tag);
        LinkedList<Node> nodes = visit(ctx.xq());     // get the nodes from the xq
        Node node = makeElem(tag,nodes);            // create the new element and return the new element with the children being the xq nodes
        LinkedList<Node> res = new LinkedList<>();
        res.add(node);                                          
        return res;

    }

    

    public Node makeElem(String tag, LinkedList<Node> nodes){    //TODO Allison implement this function
        Document doc = null;
        Node result = doc.createElement(tag);
        return result;
    }

    @Override
    public LinkedList<Node> visitApXQ(XQueryParser.ApXQContext ctx){        //just visit the xpath expression 
        System.out.println("VISIT AP XQ " + ctx.getText());
        return visit(ctx.ap());
    }

    @Override
    public LinkedList<Node> visitLetXQ(XQueryParser.LetXQContext ctx){      
        System.out.println("VISIT LET XQ " + ctx.getText());
        HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
        contextStack.push(old);                     // push the current context to the stack so you can hold the current variables
        LinkedList<Node> res = visitChildren(ctx);   // visit the children of the let clause
        contextMap = contextStack.pop();            // pop the context from the stack
        return res;
    }

    @Override
    public LinkedList<Node> visitCommaXQ(XQueryParser.CommaXQContext ctx){  //copied Xpath logic for comma
        System.out.println("COMMA XQ "  + ctx.xq(0).getText() + " " + ctx.xq(1).getText());
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> left = visit(ctx.xq(0));
        LinkedList<Node> right = visit(ctx.xq(1));
        res.addAll(left);
        res.addAll(right);
        return res;
    }

    @Override
    public LinkedList<Node> visitVarXQ(XQueryParser.VarXQContext ctx){  //return the current context's value of the variable
        System.out.println("VISIT VAR " + ctx.var().getText());
        String var = ctx.var().getText();
        return contextMap.get(var);
    }

    @Override
    public LinkedList<Node> visitStrXQ(XQueryParser.StrXQContext ctx){  //return the string as a node

        String str = ctx.strconst().getText();
        System.out.println("STRING XQ " + str);
        str = str.substring(1, str.length() - 1);
        Node node = makeText(str);
        LinkedList<Node> res = new LinkedList<>();
        res.add(node);
        return res;
    }

    public Node makeText(String str){       //TODO Allison implement this function
        Node temp = null;
        return temp;

    }

    @Override
    public LinkedList<Node> visitParenXQ(XQueryParser.ParenXQContext ctx){      //just visit the xq in the parenthesis
        return visit(ctx.xq());
    }

    @Override
    public LinkedList<Node> visitSlashXQ(XQueryParser.SlashXQContext ctx){
        System.out.println("CHILD XQ " + ctx.getText());
        availNodes = visit(ctx.xq());   //sets the avaliable nodes to the xq result
        LinkedList<Node> res = new LinkedList<>();  
        for(Node node: availNodes){
            LinkedList<Node> children = visit(ctx.rp());   //for each node, visit the rp
            res.addAll(children);
        }
        return res;


        
    }

    @Override 
    public LinkedList<Node> visitDoubleslashXQ(XQueryParser.DoubleslashXQContext ctx){
        System.out.println("DESCEND XQ " + ctx.getText());
        LinkedList<Node> tmp = visit(ctx.xq());
        tmp.addAll(getChildren(tmp.get(0)));        
        availNodes = tmp;  //set the available nodes to the result of the xq and then all descendants as well
        LinkedList<Node> res = new LinkedList<>();
        for(Node node: tmp){
            LinkedList<Node> children = visit(ctx.rp()); //for each node in avaliable nodes visit the rp
            res.addAll(children);
        }
        return res;
    }
//CLAUSE LOGIC
    @Override
    public LinkedList<Node> visitForClause(XQueryParser.ForClauseContext ctx){

        return null;        //I think this is handled in the FLWR helper so i dont think these needs further implemnetation 
    }

    @Override
    public LinkedList<Node> visitLetClause(XQueryParser.LetClauseContext ctx){
        for(int i =0 ; i<ctx.var().size(); i++){
            String var = ctx.var(i).getText();
            LinkedList<Node> value = visit(ctx.xq(i));      //for each variable, visit the xq and add the value to the context under that variable
            contextMap.put(var, value);
        }

        return null;
    }

    @Override
    public LinkedList<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx){
        return visit(ctx.condition());      //just visit the condition
    }   

    @Override
    public LinkedList<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx){
        return visit(ctx.xq());             //just visit the xq
    }

//CONDITIONS LOGIC
    @Override
    public LinkedList<Node> visitParenCond(XQueryParser.ParenCondContext ctx){
        return visit(ctx.condition());          //just visit the condition
    }

    @Override 
    public LinkedList<Node> visitSomeCond(XQueryParser.SomeCondContext ctx){
        return visit(ctx.someClause());
    }
    // Since conditions return true or false, I'm making a LinkedList of 1 node true = true statement while false = empty list
    // this way you can check if the condition is true or false by checking if the list is empty or not
    @Override
    public LinkedList<Node> visitSomeClause(XQueryParser.SomeClauseContext ctx){ 
        LinkedList<Node> res = new LinkedList<>();
        if(evalCond(0, ctx)){  //someClause returns true (LinkedList of Node true) if the condition is true
            Node node = makeText("true");
            res.add(node);
        }
        return res;
    }

    public boolean evalCond(int index, XQueryParser.SomeClauseContext ctx){
        int numCond = ctx.var().size(); //check how many conditions there are
        // I think you just do the same thing as the FLWR helper, but instead of adding the values to the context, you just check if the condition is true
        if(index == numCond){
            if(visit(ctx.condition()).size() != 0)  //after assigning all the variables, check the condition from the context map.
                return true;
            }
        else{
            String var = ctx.var(index).getText(); //similar to the FLWR helper, get the variable and its values and add to the context map
            LinkedList<Node> values = visit(ctx.xq(index));
            for(Node value: values){
                HashMap<String, LinkedList<Node>> old = new HashMap<>(contextMap);
                contextStack.push(old);
                LinkedList<Node> temp = new LinkedList<>();
                temp.add(value);
                contextMap.put(var, temp);
                if(index+1 <= numCond){
                    if(evalCond(index+1, ctx)){
                        contextMap = contextStack.pop();
                        return true;
                    }
                }
                contextMap = contextStack.pop();
            }
        }
        return false;
        
    }


    //TODO implement the rest of the conditions
    

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
    public LinkedList<Node> visitDescendant(XQueryParser.RpContext ctx){
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
    public LinkedList<Node> visitChildAP(XQueryParser.ChildAPContext ctx){
        this.availNodes = visit(ctx.doc());
        answer = visit(ctx.rp());
        return answer;
    }
    @Override
    public LinkedList<Node> visitDescendAP(XQueryParser.DescendAPContext ctx){
        this.availNodes = visit(ctx.doc());
        System.out.println("doc " + availNodes);
        answer = visitDescendant(ctx.rp());

        return answer;

    }

    @Override
    public LinkedList<Node> visitDocName(XQueryParser.DocNameContext ctx){
        String fileName = ctx.filename().getText();
        fileName = fileName.substring(1, fileName.length() - 1);
        System.out.println("FILENAME " + fileName);
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
    public LinkedList<Node> visitDescendRP(XQueryParser.DescendRPContext ctx){
       this.availNodes = visit(ctx.rp(0));
       return visitDescendant(ctx.rp(1));
    }

    @Override
    public LinkedList<Node> visitTextRP(XQueryParser.TextRPContext ctx){
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
    public LinkedList<Node> visitAttrRP(XQueryParser.AttrRPContext ctx){
        LinkedList<Node> res = new LinkedList<>();

        NamedNodeMap attributes;

        for(Node node : this.availNodes){
            attributes = node.getAttributes();
            for(int i = 0; i<attributes.getLength(); i++){
                res.add(attributes.item(i));
            }
        }
        this.availNodes = res;
        String attr = ctx.WORD().getText();
        LinkedList<Node> res2 = new LinkedList<>();
        for(Node node: this.availNodes){
            if(node.getNodeName().equals(attr)){
                res2.add(node);
            }
        }
        return res2;
    }

    @Override
    public LinkedList<Node> visitParentRP(XQueryParser.ParentRPContext ctx){
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
    public LinkedList<Node> visitTagRP(XQueryParser.TagRPContext ctx){
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
        return visit(ctx.tagname());
    }

    @Override
    public LinkedList<Node> visitTagname(XQueryParser.TagnameContext ctx) {
        LinkedList<Node> res = new LinkedList<>(); // result nodes

        for (Node node: this.availNodes){
            
            if (node.getNodeName().equals(ctx.getText())){

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

    @Override
    public LinkedList<Node> visitEqualsPF(XQueryParser.EqualsPFContext ctx) {

        LinkedList<Node> tmp = this.availNodes;
        LinkedList<Node> res = new LinkedList<>();

        for (Node node: tmp) {
            LinkedList<Node> evalNode = new LinkedList<>();
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
    public LinkedList<Node> visitRpPF(XQueryParser.RpPFContext ctx) {
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
    public LinkedList<Node> visitParenPF(XQueryParser.ParenPFContext ctx) {
        return visit(ctx.filter());
    }

    @Override
    public LinkedList<Node> visitApPF(XQueryParser.ApPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<>(visit(ctx.filter(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.filter(1)));

        ls.retainAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitOrPF(XQueryParser.OrPFContext ctx) {
        LinkedList<Node> res;
        LinkedList<Node> tmp = this.availNodes;

        HashSet<Node> ls = new HashSet<>(visit(ctx.filter(0)));

        this.availNodes = tmp;
        HashSet<Node> rs = new HashSet<>(visit(ctx.filter(1)));

        ls.addAll(rs);
        res = new LinkedList<>(ls);

        return res;
    }

    @Override
    public LinkedList<Node> visitNotPF(XQueryParser.NotPFContext ctx) {
        LinkedList<Node> res;
        HashSet<Node> frontier = new HashSet<>(this.availNodes);
        HashSet<Node> remover = new HashSet<>(visit(ctx.filter()));

        frontier.removeAll(remover);
        res = new LinkedList<>(frontier);


        return res;
    }

    @Override
    public LinkedList<Node> visitStringPF(XQueryParser.StringPFContext ctx) {
        LinkedList<Node> res = new LinkedList<>();
        LinkedList<Node> temp = this.availNodes;
        String str = ctx.strconst().getText();
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