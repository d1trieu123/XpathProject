// Generated from c:/Users/trieu/XpathProject/.antlr/Project.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProjectParser#xpath}.
	 * @param ctx the parse tree
	 */
	void enterXpath(ProjectParser.XpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#xpath}.
	 * @param ctx the parse tree
	 */
	void exitXpath(ProjectParser.XpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void enterAbsolutePath(ProjectParser.AbsolutePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#absolutePath}.
	 * @param ctx the parse tree
	 */
	void exitAbsolutePath(ProjectParser.AbsolutePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void enterRelativePath(ProjectParser.RelativePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#relativePath}.
	 * @param ctx the parse tree
	 */
	void exitRelativePath(ProjectParser.RelativePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void enterPathFilter(ProjectParser.PathFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#pathFilter}.
	 * @param ctx the parse tree
	 */
	void exitPathFilter(ProjectParser.PathFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(ProjectParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(ProjectParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(ProjectParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(ProjectParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#is}.
	 * @param ctx the parse tree
	 */
	void enterIs(ProjectParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#is}.
	 * @param ctx the parse tree
	 */
	void exitIs(ProjectParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ProjectParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ProjectParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ProjectParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ProjectParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(ProjectParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(ProjectParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#comparisonString}.
	 * @param ctx the parse tree
	 */
	void enterComparisonString(ProjectParser.ComparisonStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#comparisonString}.
	 * @param ctx the parse tree
	 */
	void exitComparisonString(ProjectParser.ComparisonStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#comparisonNumber}.
	 * @param ctx the parse tree
	 */
	void enterComparisonNumber(ProjectParser.ComparisonNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#comparisonNumber}.
	 * @param ctx the parse tree
	 */
	void exitComparisonNumber(ProjectParser.ComparisonNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(ProjectParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(ProjectParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#axisSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAxisSpecifier(ProjectParser.AxisSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#axisSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAxisSpecifier(ProjectParser.AxisSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#descendOrSelf}.
	 * @param ctx the parse tree
	 */
	void enterDescendOrSelf(ProjectParser.DescendOrSelfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#descendOrSelf}.
	 * @param ctx the parse tree
	 */
	void exitDescendOrSelf(ProjectParser.DescendOrSelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#childNode}.
	 * @param ctx the parse tree
	 */
	void enterChildNode(ProjectParser.ChildNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#childNode}.
	 * @param ctx the parse tree
	 */
	void exitChildNode(ProjectParser.ChildNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(ProjectParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(ProjectParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#twoEquals}.
	 * @param ctx the parse tree
	 */
	void enterTwoEquals(ProjectParser.TwoEqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#twoEquals}.
	 * @param ctx the parse tree
	 */
	void exitTwoEquals(ProjectParser.TwoEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#all}.
	 * @param ctx the parse tree
	 */
	void enterAll(ProjectParser.AllContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#all}.
	 * @param ctx the parse tree
	 */
	void exitAll(ProjectParser.AllContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf(ProjectParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf(ProjectParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(ProjectParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(ProjectParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ProjectParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ProjectParser.TextContext ctx);
}