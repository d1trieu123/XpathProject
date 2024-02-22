// Generated from XQuery.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code strXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStrXQ(XQueryParser.StrXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStrXQ(XQueryParser.StrXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFlwrXQ(XQueryParser.FlwrXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flwrXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFlwrXQ(XQueryParser.FlwrXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code slashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterSlashXQ(XQueryParser.SlashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code slashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitSlashXQ(XQueryParser.SlashXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagXQ(XQueryParser.TagXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagXQ(XQueryParser.TagXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXQ(XQueryParser.ApXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXQ(XQueryParser.ApXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterParenXQ(XQueryParser.ParenXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitParenXQ(XQueryParser.ParenXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXQ(XQueryParser.LetXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXQ(XQueryParser.LetXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleslashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterDoubleslashXQ(XQueryParser.DoubleslashXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleslashXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitDoubleslashXQ(XQueryParser.DoubleslashXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterCommaXQ(XQueryParser.CommaXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitCommaXQ(XQueryParser.CommaXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXQ(XQueryParser.VarXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXQ(XQueryParser.VarXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterChildAP(XQueryParser.ChildAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitChildAP(XQueryParser.ChildAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDescendAP(XQueryParser.DescendAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDescendAP(XQueryParser.DescendAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code docName}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code docName}
	 * labeled alternative in {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocName(XQueryParser.DocNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(XQueryParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrRP(XQueryParser.AttrRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrRP(XQueryParser.AttrRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildRP(XQueryParser.ChildRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildRP(XQueryParser.ChildRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterPath(XQueryParser.FilterPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterPath(XQueryParser.FilterPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextRP(XQueryParser.TextRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextRP(XQueryParser.TextRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentRP(XQueryParser.ParentRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentRP(XQueryParser.ParentRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfRP(XQueryParser.SelfRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfRP(XQueryParser.SelfRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCommaRP(XQueryParser.CommaRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCommaRP(XQueryParser.CommaRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildrenRP(XQueryParser.ChildrenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildrenRP(XQueryParser.ChildrenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagRP(XQueryParser.TagRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagRP(XQueryParser.TagRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDescendRP(XQueryParser.DescendRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDescendRP(XQueryParser.DescendRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParenRP(XQueryParser.ParenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParenRP(XQueryParser.ParenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterRpPF(XQueryParser.RpPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitRpPF(XQueryParser.RpPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterEqualsPF(XQueryParser.EqualsPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitEqualsPF(XQueryParser.EqualsPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterParenPF(XQueryParser.ParenPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitParenPF(XQueryParser.ParenPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterApPF(XQueryParser.ApPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitApPF(XQueryParser.ApPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterStringPF(XQueryParser.StringPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitStringPF(XQueryParser.StringPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterNotPF(XQueryParser.NotPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitNotPF(XQueryParser.NotPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterSamePF(XQueryParser.SamePFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitSamePF(XQueryParser.SamePFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterOrPF(XQueryParser.OrPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitOrPF(XQueryParser.OrPFContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualsCond(XQueryParser.EqualsCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualsCond(XQueryParser.EqualsCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSameCond(XQueryParser.SameCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSameCond(XQueryParser.SameCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(XQueryParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code someCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code someCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSomeCond(XQueryParser.SomeCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenCond(XQueryParser.ParenCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenCond(XQueryParser.ParenCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(XQueryParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(XQueryParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(XQueryParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(XQueryParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link XQueryParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(XQueryParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#someClause}.
	 * @param ctx the parse tree
	 */
	void enterSomeClause(XQueryParser.SomeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#someClause}.
	 * @param ctx the parse tree
	 */
	void exitSomeClause(XQueryParser.SomeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#strconst}.
	 * @param ctx the parse tree
	 */
	void enterStrconst(XQueryParser.StrconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#strconst}.
	 * @param ctx the parse tree
	 */
	void exitStrconst(XQueryParser.StrconstContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#tagname}.
	 * @param ctx the parse tree
	 */
	void enterTagname(XQueryParser.TagnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#tagname}.
	 * @param ctx the parse tree
	 */
	void exitTagname(XQueryParser.TagnameContext ctx);
}