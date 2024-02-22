
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;




// Import statements...


public class Main {
    public static String axis = "";
    public static String fullFilter = "";
    public static void main(String[] args) throws Exception {
        //creates the parser and lexer and creates the parse tree
        String fname = args[0];
        XQueryLexer lexer = new XQueryLexer(CharStreams.fromFileName(fname));
        XQueryParser parser = new XQueryParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.xq();
        XpathVisitor visitor = new XpathVisitor();
        visitor.visit(tree);
        String xmlFileName = visitor.getFileName();
        visitor.printNodes();


        System.out.println("Parsing " + xmlFileName + "with the following query: " + tree.toStringTree(parser)); 
    }


}
