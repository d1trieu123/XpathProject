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
	 * Visit a parse tree produced by the {@code descendXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendXQ(ProjectParser.DescendXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagXQ(ProjectParser.TagXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForXQ(ProjectParser.ForXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApXQ(ProjectParser.ApXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenXQ(ProjectParser.ParenXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXQ(ProjectParser.LetXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringXQ(ProjectParser.StringXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaXQ(ProjectParser.CommaXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXQ(ProjectParser.VarXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildXQ(ProjectParser.ChildXQContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(ProjectParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(ProjectParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ProjectParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(ProjectParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagReturn(ProjectParser.TagReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xqReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqReturn(ProjectParser.XqReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaReturn(ProjectParser.CommaReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualCond(ProjectParser.EqualCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCond(ProjectParser.OrCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code satisfyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatisfyCond(ProjectParser.SatisfyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(ProjectParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameCond(ProjectParser.SameCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCond(ProjectParser.AndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCond(ProjectParser.ParenCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(ProjectParser.NotCondContext ctx);
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
	 * Visit a parse tree produced by {@link ProjectParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(ProjectParser.StringConstantContext ctx);
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
	 * Visit a parse tree produced by {@link ProjectParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(ProjectParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(ProjectParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(ProjectParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ProjectParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProjectParser#comparisonString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonString(ProjectParser.ComparisonStringContext ctx);
}