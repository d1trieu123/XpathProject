import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.antlr.runtime.tree.ParseTree;
import org.w3c.dom.Document;

public class MyVisitor extends ProjectBaseVisitor<List<Node>>{
    public String filename = "";
    Document doc = null;
    List<Node> root = new ArrayList<Node>();
    List<Node> availNodes = new ArrayList<Node>();
    Node contextNode = null;
    

    public List<Node> visitChildAP(ProjectParser.ChildAPContext ctx) {
        
        if(doc != null){
            
            List<Node> temp = new ArrayList<Node>();
            for (Node node : availNodes){
                temp.addAll(getChildren(node));
            }           
            availNodes = temp;
            List<Node> filtered = visit(ctx.rp());
            List<Node> last = new ArrayList<Node>();
            for(Node node : filtered){
                if(availNodes.contains(node)){
                    last.add(node);

                }
            }
            availNodes = last;
            return last;
        }   
        else{
            return visitChildren(ctx);
        }
    }
    @Override
    public List<Node> visitDescendAP(ProjectParser.DescendAPContext ctx){ //change nodes to all available element nodes
        if(doc !=null){
            List<Node> temp = new ArrayList<Node>();
            for( Node node : availNodes){
                temp.add(node);
                temp.addAll(getDescendants(node));
            }
            availNodes = temp;
            List<Node> filtered = visit(ctx.rp());
            List<Node> last = new ArrayList<Node>();
            for(Node node : filtered){
                if(availNodes.contains(node)){
                    last.add(node);

                }
            }
            availNodes = last;
            return last;
            
        }
        return visitChildren(ctx);

    }

    public List<Node> visitTagName(ProjectParser.TagNameContext ctx){
        if(doc != null){
            String tag = ctx.getText();
            List<Node> newAvailNodes = filterNodes(tag);
            
            return newAvailNodes;
        }
        return visitChildren(ctx);
    }
    
    public List<Node> visitChildrenRP(ProjectParser.ChildrenRPContext ctx){ //change nodes to only children nodes
        if(doc != null){
            List<Node> temp = new ArrayList<Node>();
            for(Node node : availNodes){
                temp.addAll(getChildren(node));
            }
            return temp;
        }
        return visitChildren(ctx);
    }


    public List<Node> visitSelfRP(ProjectParser.SelfRPContext ctx){ //do nothing to filters
        if(doc != null){
            return availNodes;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitParentRP(ProjectParser.ParentRPContext ctx){ //change nodes to only parent nodes
        if(doc != null){
            List<Node> temp = new ArrayList<Node>();
            for(Node node : availNodes){
                if(node.getParentNode() != null && !temp.contains(node.getParentNode()))
                temp.add(node.getParentNode());
            }
            availNodes = temp;
            return temp;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitTextRP(ProjectParser.TextRPContext ctx){ //change nodes to only text nodes
        if(doc != null){
            List<Node> temp = new ArrayList<Node>();
            for(Node node : availNodes){
                if(node.getNodeType() == Node.TEXT_NODE){
                    temp.add(node);
                }
            }
            return temp;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitAttrRP(ProjectParser.AttrRPContext ctx){ //change nodes to only attribute nodes
        if(doc != null){
            List<Node> temp = new ArrayList<Node>();
            for(Node node : availNodes){
                if(node.getNodeType() == Node.ATTRIBUTE_NODE){
                    temp.add(node);
                }
            }
            return temp;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitParenRP(ProjectParser.ParenRPContext ctx){ //change nodes to only parent nodes
        if(doc != null){
            return visit(ctx.rp());
        }
        return visitChildren(ctx);
    }

    public List<Node> visitChildRP(ProjectParser.ChildRPContext ctx){
        if(doc!=null){

            ProjectParser.RpContext rp = ctx.rp(0);
            
            ProjectParser.RpContext rp2 = ctx.rp(1);
            List<Node> firstRP = visit(rp);
            List<Node> temp = new ArrayList<Node>();
            for(Node node : firstRP){
                temp.addAll(getChildren(node));
            }
            availNodes = temp;
            List<Node> temp2 = new ArrayList<Node>();
            List<Node> secondRP = visit(rp2);
            for(Node node : secondRP){
                if(availNodes.contains(node)){
                    temp2.add(node);
                }
            }
            return temp2;
            
        }else{
            return visitChildren(ctx);
        }
    }

    public List<Node> visitDescendRP(ProjectParser.DescendRPContext ctx){
        if(doc!=null){

            ProjectParser.RpContext rp = ctx.rp(0);
            
            ProjectParser.RpContext rp2 = ctx.rp(1);
            List<Node> firstRP = visit(rp);
            List<Node> temp = new ArrayList<Node>();
            for(Node node : firstRP){
                temp.addAll(getDescendants(node));
            }
            availNodes = temp;

            List<Node> temp2 = new ArrayList<Node>();
            List<Node> secondRP = visit(rp2);
            for(Node node : secondRP){
                if(availNodes.contains(node)){
                    temp2.add(node);
                }
            }
            return temp2;
            
        }else{
            return visitChildren(ctx);
        }
    }

    public List<Node> visitFilterPath(ProjectParser.FilterPathContext ctx){
        if(doc != null){
            
            List<Node> temp = availNodes;
            List<Node> rp1 = visit(ctx.rp());
          
            List<Node> filtered = visit(ctx.pf());

            
            List<Node> last = new ArrayList<Node>();
            for(Node node : rp1){
                if(hasFilteredDescendant(node, filtered)){
                    last.add(node);
                }
            }
            availNodes = temp;
            return last;

        }
        return visitChildren(ctx);
    }

    public List<Node> visitAndPF(ProjectParser.AndPFContext ctx) {
        if (doc != null) {
           
            List<Node> temp = availNodes;
            availNodes = getAllChildren(availNodes);
            List<Node> pf1 = visit(ctx.pf(0));
           
            availNodes = getAllChildren(temp);
            
            List<Node> pf2 = visit(ctx.pf(1));
            
            List<Node> together = new ArrayList<>();
            availNodes = temp;
            for (Node node :availNodes){
                if((hasFilteredDescendant(node, pf1) && hasFilteredDescendant(node, pf2)) && !together.contains(node)){
                    together.add(node);
                }
            }
            return together;
        }
        return visitChildren(ctx);
    }
    public boolean hasFilteredDescendant(Node node, List<Node> filteredNodes) { //checks if a node has a descendant
        // Base case: If the current node satisfies the filter, return true
        if (filteredNodes.contains(node)) {
            return true;
        }
    
        // Recursive case: Check each descendant of the current node
        List<Node> descendants = getDescendants(node);
        for (Node descendant : descendants) {
            if (hasFilteredDescendant(descendant, filteredNodes)) {
                return true;
            }
        }
    
        // If no filtered descendant is found, return false
        return false;
    }
    

    public List<Node> visitUnionRP(ProjectParser.UnionRPContext ctx){
        if(doc != null){
            
            ProjectParser.RpContext rp = ctx.rp(0);
            ProjectParser.RpContext rp2 = ctx.rp(1);
            List<Node> firstRP = visit(rp);
            List<Node> secondRP = visit(rp2);
            firstRP.addAll(secondRP);
            
            return firstRP;
        
        }else{
            return visitChildren(ctx);
        }
    }

    public List<Node> visitRpPF(ProjectParser.RpPFContext ctx){
        if(doc != null){
            visit(ctx.rp());
        }
        return visitChildren(ctx);
    }

    public List<Node> vistequalsPF(ProjectParser.EqualsPFContext ctx) {
        if (doc != null) {
            List<Node> rp1 = visit(ctx.rp(0));
            List<Node> rp2 = visit(ctx.rp(1));
            if (rp1.size() == rp2.size()) {
                for (int i = 0; i < rp1.size(); i++) {
                    Node node1 = rp1.get(i);
                    Node node2 = rp2.get(i);
                    if (node1.getNodeName().equals(node2.getNodeName())) {
                        if (node1.getTextContent().equals(node2.getTextContent())) {
                            // Check if number of children is the same
                            if (node1.getChildNodes().getLength() == node2.getChildNodes().getLength()) {
                                // Check value-based equality for each child
                                NodeList children1 = node1.getChildNodes();
                                NodeList children2 = node2.getChildNodes();
                                for (int j = 0; j < children1.getLength(); j++) {
                                    Node child1 = children1.item(j);
                                    Node child2 = children2.item(j);
                                    if (!valueEqual(child1, child2)) {
                                        // If any child is not value-equal, break and return null or handle accordingly
                                        return null;
                                    }
                                }
                            } else {

                                return null;
                            }
                        } else {
                            return null;
                        }
                    } else {
                        return null;
                    }
                }
                return rp1; 
            }
        }
        return  visitChildren(ctx);
    }
    
    // Helper method to check value-based equality for nodes
    private boolean valueEqual(Node node1, Node node2) {
       if(node1.getNodeType() == Node.TEXT_NODE && node2.getNodeType() == Node.TEXT_NODE) {
           return node1.getTextContent().equals(node2.getTextContent());
       }
         return false;
    }
    

    public List<Node> visitSamePF(ProjectParser.SamePFContext ctx) {
        if (doc != null) {
            List<Node> rp1 = visit(ctx.rp(0));
            List<Node> rp2 = visit(ctx.rp(1));
            List<Node> temp = new ArrayList<>();
            if (rp1.size() == rp2.size()) {
                for (int i = 0; i < rp1.size(); i++) {
                    Node node1 = rp1.get(i);
                    Node node2 = rp2.get(i);
                    if (node1 == node2) {
                        temp.add(node1); 
                    } else {
                        
                        return null;
                    }
                }
                return temp;
            }
        }
        return  visitChildren(ctx);
    }

    public List<Node> visitStringPF(ProjectParser.StringPFContext ctx) {
        if (doc != null) {
            List<Node> rp = visit(ctx.rp());
            List<Node> string = visit(ctx.comparisonString());
            List<Node> temp = new ArrayList<>();
            for (Node node : rp) {
                if (node.getTextContent().equals(string.get(0).getNodeName())) {
                    temp.add(node);
                }
            }
            return temp;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitComparisonString(ProjectParser.ComparisonStringContext ctx) {
        if (doc != null) {
            List<Node> temp = new ArrayList<>();
            String string = ctx.getText();
            String noquotes = string.replaceAll("\"","");
            Element tempElement = doc.createElement(noquotes);
            temp.add((Node) tempElement);
            return temp;

        }
        return visitChildren(ctx);
    }

    public List<Node> visitParenPF(ProjectParser.ParenPFContext ctx) {
        if (doc != null) {
            return visit(ctx.pf());
        }
        return visitChildren(ctx);
    }



    public List<Node> visitOrPF(ProjectParser.OrPFContext ctx) {
        if (doc != null) {

            List<Node> temp = availNodes;
            availNodes = getAllChildren(availNodes);
            List<Node> pf1 = visit(ctx.pf(0));

            availNodes = getAllChildren(temp);

            List<Node> pf2 = visit(ctx.pf(1));
            List<Node> together = new ArrayList<>();
            availNodes = temp;
            for (Node node :availNodes){
                if((hasFilteredDescendant(node, pf1) || hasFilteredDescendant(node, pf2)) && !together.contains(node)){
                    together.add(node);
                }
            }
            return together;
        }
        return visitChildren(ctx);
    }

    public List<Node> visitNotPF(ProjectParser.NotPFContext ctx) {
        if (doc != null) {
            List<Node> pf = visit(ctx.pf());
            List<Node> temp = new ArrayList<>();
            for (Node node : availNodes) {
                if (!hasFilteredDescendant(node, pf) && !pf.contains(node)) {
                    temp.add(node);
                }
            }
            return temp;
        }
        return visitChildren(ctx);
    }
    
    
    

    public List<Node> getAllChildren(List<Node> inputNodes) {
        List<Node> allChildren = new ArrayList<>();

        for (Node parentNode : inputNodes) {
            List<Node> children = getChildren(parentNode);
            allChildren.addAll(children);
        }

        return allChildren;
    }



   

    
    public List<Node> visitDocName(ProjectParser.DocNameContext ctx){
        return visitChildren(ctx);
    }

    public List<Node> visitFilename(ProjectParser.FilenameContext ctx){
        filename = ctx.getText();
        return visitChildren(ctx);
    }

 



 


    //helper functions
    public String getFileName(){
        return filename;
    }
    public void setDoc(Document doc){

        this.doc = doc;
        Element temp = doc.createElement("DUMMY");
        temp.appendChild(doc.getDocumentElement());
        root.add((Node) temp);
        availNodes.add(root.get(0));
    }
    
    public void printNodes(){
        prettyPrintToFile(availNodes,"answer.txt");
    }
    
    public List<Node> getChildren(Node node){ //returns the all children of a node
        List<Node> children = new ArrayList<Node>();
        NodeList nodeList = node.getChildNodes();
        for(int i = 0; i < nodeList.getLength(); i++){
            children.add(nodeList.item(i));
        }
        return children;
    }
    
    public List<Node> getDescendants(Node node){ //returns all descendants of a node
        List<Node> descendants = new ArrayList<Node>();
        List<Node> children = getChildren(node);
        for(Node child : children){
            descendants.add(child);
            descendants.addAll(getDescendants(child));
        }
        return descendants;
    }


    public Node getRoot(){
        return root.get(0);
    }
    public List<Node> getNodes(){
        return availNodes;
    }
    public List<Node> filterNodes(String name){
        List<Node> filteredNodes = new ArrayList<Node>();
        for(Node node : availNodes){
            if(node.getNodeName().equals(name)){
                filteredNodes.add(node);
            }
        }
        return filteredNodes;
    }
    public static void prettyPrintToFile(List<Node> nodeList, String filePath) {
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
}
