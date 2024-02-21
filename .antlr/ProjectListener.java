// Generated from Project.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProjectParser}.
 */
public interface ProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code descendXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterDescendXQ(ProjectParser.DescendXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitDescendXQ(ProjectParser.DescendXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagXQ(ProjectParser.TagXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagXQ(ProjectParser.TagXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterForXQ(ProjectParser.ForXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitForXQ(ProjectParser.ForXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXQ(ProjectParser.ApXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code apXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXQ(ProjectParser.ApXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterParenXQ(ProjectParser.ParenXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitParenXQ(ProjectParser.ParenXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXQ(ProjectParser.LetXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXQ(ProjectParser.LetXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStringXQ(ProjectParser.StringXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStringXQ(ProjectParser.StringXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterCommaXQ(ProjectParser.CommaXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitCommaXQ(ProjectParser.CommaXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXQ(ProjectParser.VarXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXQ(ProjectParser.VarXQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterChildXQ(ProjectParser.ChildXQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childXQ}
	 * labeled alternative in {@link ProjectParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitChildXQ(ProjectParser.ChildXQContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(ProjectParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(ProjectParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(ProjectParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(ProjectParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ProjectParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ProjectParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(ProjectParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(ProjectParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterTagReturn(ProjectParser.TagReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitTagReturn(ProjectParser.TagReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xqReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterXqReturn(ProjectParser.XqReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xqReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitXqReturn(ProjectParser.XqReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commaReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void enterCommaReturn(ProjectParser.CommaReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commaReturn}
	 * labeled alternative in {@link ProjectParser#rt}.
	 * @param ctx the parse tree
	 */
	void exitCommaReturn(ProjectParser.CommaReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEqualCond(ProjectParser.EqualCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEqualCond(ProjectParser.EqualCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(ProjectParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(ProjectParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code satisfyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSatisfyCond(ProjectParser.SatisfyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code satisfyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSatisfyCond(ProjectParser.SatisfyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(ProjectParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(ProjectParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSameCond(ProjectParser.SameCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sameCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSameCond(ProjectParser.SameCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(ProjectParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(ProjectParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParenCond(ProjectParser.ParenCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParenCond(ProjectParser.ParenCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(ProjectParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCond}
	 * labeled alternative in {@link ProjectParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(ProjectParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterChildAP(ProjectParser.ChildAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitChildAP(ProjectParser.ChildAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDescendAP(ProjectParser.DescendAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendAP}
	 * labeled alternative in {@link ProjectParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDescendAP(ProjectParser.DescendAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code docName}
	 * labeled alternative in {@link ProjectParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDocName(ProjectParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code docName}
	 * labeled alternative in {@link ProjectParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDocName(ProjectParser.DocNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrRP(ProjectParser.AttrRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attrRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrRP(ProjectParser.AttrRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildRP(ProjectParser.ChildRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildRP(ProjectParser.ChildRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterPath(ProjectParser.FilterPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filterPath}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterPath(ProjectParser.FilterPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextRP(ProjectParser.TextRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextRP(ProjectParser.TextRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentRP(ProjectParser.ParentRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentRP(ProjectParser.ParentRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnionRP(ProjectParser.UnionRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnionRP(ProjectParser.UnionRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfRP(ProjectParser.SelfRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfRP(ProjectParser.SelfRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterChildrenRP(ProjectParser.ChildrenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code childrenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitChildrenRP(ProjectParser.ChildrenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagRP(ProjectParser.TagRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tagRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagRP(ProjectParser.TagRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDescendRP(ProjectParser.DescendRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descendRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDescendRP(ProjectParser.DescendRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParenRP(ProjectParser.ParenRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenRP}
	 * labeled alternative in {@link ProjectParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParenRP(ProjectParser.ParenRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterRpPF(ProjectParser.RpPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rpPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitRpPF(ProjectParser.RpPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterEqualsPF(ProjectParser.EqualsPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitEqualsPF(ProjectParser.EqualsPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterParenPF(ProjectParser.ParenPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitParenPF(ProjectParser.ParenPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterAndPF(ProjectParser.AndPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitAndPF(ProjectParser.AndPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterStringPF(ProjectParser.StringPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitStringPF(ProjectParser.StringPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterSamePF(ProjectParser.SamePFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code samePF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitSamePF(ProjectParser.SamePFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterNotPF(ProjectParser.NotPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitNotPF(ProjectParser.NotPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterEqualPF(ProjectParser.EqualPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitEqualPF(ProjectParser.EqualPFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void enterOrPF(ProjectParser.OrPFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orPF}
	 * labeled alternative in {@link ProjectParser#pf}.
	 * @param ctx the parse tree
	 */
	void exitOrPF(ProjectParser.OrPFContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(ProjectParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(ProjectParser.StringConstantContext ctx);
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
	 * Enter a parse tree produced by {@link ProjectParser#attrName}.
	 * @param ctx the parse tree
	 */
	void enterAttrName(ProjectParser.AttrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#attrName}.
	 * @param ctx the parse tree
	 */
	void exitAttrName(ProjectParser.AttrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(ProjectParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(ProjectParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(ProjectParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(ProjectParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(ProjectParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(ProjectParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProjectParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ProjectParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProjectParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ProjectParser.VarContext ctx);
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
}