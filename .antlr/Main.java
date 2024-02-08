
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import java.  io.File;
import java.io.IOException;




// Import statements...


public class Main {
    public static String axis = "";
    public static String fullFilter = "";
    public static void main(String[] args) throws Exception {
        //creates the parser and lexer and creates the parse tree
        String fname = args[0];
        ProjectLexer lexer = new ProjectLexer(CharStreams.fromFileName(fname));
        ProjectParser parser = new ProjectParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.ap();
        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);
        String xmlFileName = visitor.getFileName();


        System.out.println("Parsing " + xmlFileName + "with the following query: " + tree.toStringTree(parser)); 
        

        //parses the XML file
        parseXmlDocument(xmlFileName, tree);
    }

    private static void parseXmlDocument(String xmlFileName, ParseTree tree) { // parses the XML file from the given query
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(xmlFileName));
            //prints everything from this node down

            MyVisitor visitor = new MyVisitor();
            visitor.setDoc(document);
            visitor.visit(tree);
            visitor.printNodes();
            // visitor.visit(tree);
            // Your XML processing logic here...
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        catch(org.xml.sax.SAXException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
       }
    }

}
