import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.  io.File;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import java.io.IOException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.function.Predicate;



// Import statements...

@SuppressWarnings("deprecation")
public class Main {
    public static String axis = "";
    public static String fullFilter = "";
    public static void main(String[] args) throws Exception {
        //creates the parser and lexer and creates the parse tree
        String fname = args[0];
        ProjectLexer lexer = new ProjectLexer(CharStreams.fromFileName(fname));
        ProjectParser parser = new ProjectParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.xpath();

        //creates the listener and walks the tree
        ParseTreeWalker walker = new ParseTreeWalker();
        ProjectListenerImpl listener = new ProjectListenerImpl();
        walker.walk(listener, tree);

        //gets relevant information from the listener
        String xmlFileName = listener.getXmlFileName();
        axis = listener.getAxis();
        System.out.println("Axis: " + axis);

        Predicate<Element> filter = element ->{
            //NEEDS TO FINISH, process the Xpath expression and apply to the filter
            return true;

        };


        //parses the XML file
        // parseXmlDocument(xmlFileName, axis, filter);
    }

    private static void parseXmlDocument(String xmlFileName, String axis, Predicate<Element> filter ) { // parses the XML file from the given query
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(xmlFileName));
            //prints everything from this node down
            NodeList axes = document.getElementsByTagName(axis);
            for (int i = 0; i < axes.getLength(); i++) {
                prettyPrint((Element) axes.item(i), filter);
            }  
            // Get the root element
            // Element rootElement = document.getDocumentElement();
            // System.out.println("Root element: " + rootElement.getNodeName());

            // noFilters just print out the axis
            // if(fullFilter.equals("")){
            //     NodeList queryAnswer = rootElement.getElementsByTagName(axis);
            //     xmlResult(queryAnswer);
            // }
            // bfs(rootElement);


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


    private static void prettyPrint(Element startingNode, Predicate<Element> filter){ //creates a subdocument from each axis node and prints it out
        try{ 
            //creates a subdocument from the starting node
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document subdoc = builder.newDocument();
            Element copy = (Element) subdoc.importNode(startingNode, true);
            subdoc.appendChild(copy);
            
            //prints the subdocument if it passes the filter
            if(filter.test(copy)){
                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();
                transformer.setOutputProperty("indent", "yes");
                transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
                transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

                // Print the formatted XML to the console
                DOMSource source = new DOMSource(subdoc);
                StreamResult result = new StreamResult(System.out);
                transformer.transform(source, result);
            }
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
