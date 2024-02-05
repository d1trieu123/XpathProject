// Generated from Project.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProjectParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProjectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProjectParser#xpath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXpath(ProjectParser.XpathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#absolutePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsolutePath(ProjectParser.AbsolutePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#relativePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelativePath(ProjectParser.RelativePathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#pathFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathFilter(ProjectParser.PathFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(ProjectParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(ProjectParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#is}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(ProjectParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ProjectParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ProjectParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(ProjectParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#comparisonString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonString(ProjectParser.ComparisonStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#comparisonNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonNumber(ProjectParser.ComparisonNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#attributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeName(ProjectParser.AttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#axisSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxisSpecifier(ProjectParser.AxisSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#descendOrSelf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendOrSelf(ProjectParser.DescendOrSelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#childNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildNode(ProjectParser.ChildNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(ProjectParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#twoEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoEquals(ProjectParser.TwoEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll(ProjectParser.AllContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#self}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(ProjectParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#parent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(ProjectParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ProjectParser.TextContext ctx);
}