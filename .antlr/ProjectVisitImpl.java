import org.antlr.v4.runtime.tree.TerminalNode;
import org.w3c.dom.Element;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.function.Predicate;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class ProjectVisitImpl extends ProjectBaseVisitor<Predicate<Element>> {


    public static Predicate<Element> createXPathPredicate(String xpathExpression) {
        ProjectLexer lexer = new ProjectLexer(CharStreams.fromString(xpathExpression));
        ProjectParser parser = new ProjectParser(new CommonTokenStream(lexer));
        ProjectParser.XpathContext tree = parser.xpath();

        ProjectVisitImpl visitor = new ProjectVisitImpl();
        return visitor.visit(tree);
    }

    @Override
    public Predicate<Element> visitXpath(ProjectParser.XpathContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Predicate<Element> visitAbsolutePath(ProjectParser.AbsolutePathContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Predicate<Element> visitTagName(ProjectParser.TagNameContext ctx) {
        String tagName = ctx.getText();
        return element -> element.getTagName().equals(tagName);
    }

    @Override
    public Predicate<Element> visitDescendOrSelf(ProjectParser.DescendOrSelfContext ctx) {
        if (ctx.getText().equals("//")) {
            return element -> true;
        }
        return element -> element.getParentNode() == element.getOwnerDocument();
    }

    @Override
    public Predicate<Element> visitEquals(ProjectParser.EqualsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Predicate<Element> visitComparisonString(ProjectParser.ComparisonStringContext ctx) {
        TerminalNode quote = ctx.QUOTE(0);
        String expectedValue = quote.getText();
        return element -> element.getTextContent().equals(expectedValue);
    }

    // Add other visit methods for relevant grammar rules

    @Override
    public Predicate<Element> visitTerminal(TerminalNode node) {
        return element -> true; // Default behavior for terminals
    }
}
