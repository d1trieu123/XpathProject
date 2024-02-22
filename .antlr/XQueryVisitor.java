// Generated from XQuery.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code strXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrXQ(XQueryParser.StrXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlwrXQ(XQueryParser.FlwrXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code slashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashXQ(XQueryParser.SlashXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagXQ(XQueryParser.TagXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApXQ(XQueryParser.ApXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenXQ(XQueryParser.ParenXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXQ(XQueryParser.LetXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleslashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleslashXQ(XQueryParser.DoubleslashXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaXQ(XQueryParser.CommaXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXQ(XQueryParser.VarXQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildAP(XQueryParser.ChildAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendAP(XQueryParser.DescendAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code docName}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrRP(XQueryParser.AttrRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildRP(XQueryParser.ChildRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterPath(XQueryParser.FilterPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRP(XQueryParser.TextRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentRP(XQueryParser.ParentRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfRP(XQueryParser.SelfRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commaRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaRP(XQueryParser.CommaRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenRP(XQueryParser.ChildrenRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagRP(XQueryParser.TagRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendRP(XQueryParser.DescendRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenRP(XQueryParser.ParenRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpPF(XQueryParser.RpPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsPF(XQueryParser.EqualsPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPF(XQueryParser.ParenPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code apPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApPF(XQueryParser.ApPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPF(XQueryParser.StringPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotPF(XQueryParser.NotPFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSamePF(XQueryParser.SamePFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPF(XQueryParser.OrPFContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalsCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsCond(XQueryParser.EqualsCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSameCond(XQueryParser.SameCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code someCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCond(XQueryParser.ParenCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCond(XQueryParser.AndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCond(XQueryParser.OrCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#someClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeClause(XQueryParser.SomeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#tagname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagname(XQueryParser.TagnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#strconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrconst(XQueryParser.StrconstContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
}