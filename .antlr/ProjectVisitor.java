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
	 * Visit a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildAP(ProjectParser.ChildAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendAP(ProjectParser.DescendAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code docName}
	 * labeled alternative in {@link ProjectParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocName(ProjectParser.DocNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrRP(ProjectParser.AttrRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildRP(ProjectParser.ChildRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterPath(ProjectParser.FilterPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRP(ProjectParser.TextRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentRP(ProjectParser.ParentRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionRP(ProjectParser.UnionRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfRP(ProjectParser.SelfRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenRP(ProjectParser.ChildrenRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagRP(ProjectParser.TagRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendRP(ProjectParser.DescendRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenRP(ProjectParser.ParenRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpPF(ProjectParser.RpPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsPF(ProjectParser.EqualsPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPF(ProjectParser.ParenPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndPF(ProjectParser.AndPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPF(ProjectParser.StringPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamePF(ProjectParser.SamePFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPF(ProjectParser.NotPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualPF(ProjectParser.EqualPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPF(ProjectParser.OrPFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(ProjectParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#attrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrName(ProjectParser.AttrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(ProjectParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#comparisonString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonString(ProjectParser.ComparisonStringContext ctx);
}