// Generated from grammar/AltPython3.g4 by ANTLR 4.7.1
package cyclone.cli.antlr.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AltPython3Parser}.
 */
public interface AltPython3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(AltPython3Parser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(AltPython3Parser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(AltPython3Parser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(AltPython3Parser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(AltPython3Parser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(AltPython3Parser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AltPython3Parser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AltPython3Parser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(AltPython3Parser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(AltPython3Parser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(AltPython3Parser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(AltPython3Parser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(AltPython3Parser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(AltPython3Parser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AltPython3Parser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AltPython3Parser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(AltPython3Parser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(AltPython3Parser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(AltPython3Parser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(AltPython3Parser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(AltPython3Parser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(AltPython3Parser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(AltPython3Parser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(AltPython3Parser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(AltPython3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(AltPython3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(AltPython3Parser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(AltPython3Parser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(AltPython3Parser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(AltPython3Parser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(AltPython3Parser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(AltPython3Parser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(AltPython3Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(AltPython3Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(AltPython3Parser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(AltPython3Parser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(AltPython3Parser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(AltPython3Parser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(AltPython3Parser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(AltPython3Parser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(AltPython3Parser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(AltPython3Parser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(AltPython3Parser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(AltPython3Parser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(AltPython3Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(AltPython3Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(AltPython3Parser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(AltPython3Parser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(AltPython3Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(AltPython3Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(AltPython3Parser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(AltPython3Parser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(AltPython3Parser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(AltPython3Parser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(AltPython3Parser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(AltPython3Parser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(AltPython3Parser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(AltPython3Parser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(AltPython3Parser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(AltPython3Parser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(AltPython3Parser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(AltPython3Parser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(AltPython3Parser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(AltPython3Parser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(AltPython3Parser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(AltPython3Parser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(AltPython3Parser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(AltPython3Parser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(AltPython3Parser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(AltPython3Parser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(AltPython3Parser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(AltPython3Parser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(AltPython3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(AltPython3Parser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(AltPython3Parser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(AltPython3Parser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(AltPython3Parser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(AltPython3Parser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(AltPython3Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(AltPython3Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(AltPython3Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(AltPython3Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(AltPython3Parser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(AltPython3Parser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(AltPython3Parser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(AltPython3Parser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(AltPython3Parser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(AltPython3Parser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(AltPython3Parser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(AltPython3Parser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(AltPython3Parser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(AltPython3Parser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(AltPython3Parser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(AltPython3Parser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(AltPython3Parser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(AltPython3Parser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(AltPython3Parser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(AltPython3Parser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(AltPython3Parser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(AltPython3Parser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(AltPython3Parser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(AltPython3Parser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(AltPython3Parser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(AltPython3Parser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(AltPython3Parser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(AltPython3Parser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(AltPython3Parser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(AltPython3Parser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(AltPython3Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(AltPython3Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(AltPython3Parser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(AltPython3Parser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(AltPython3Parser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(AltPython3Parser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AltPython3Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AltPython3Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(AltPython3Parser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(AltPython3Parser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(AltPython3Parser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(AltPython3Parser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(AltPython3Parser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(AltPython3Parser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(AltPython3Parser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(AltPython3Parser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AltPython3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AltPython3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(AltPython3Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(AltPython3Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(AltPython3Parser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(AltPython3Parser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AltPython3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AltPython3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(AltPython3Parser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(AltPython3Parser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(AltPython3Parser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(AltPython3Parser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(AltPython3Parser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(AltPython3Parser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(AltPython3Parser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(AltPython3Parser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(AltPython3Parser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(AltPython3Parser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(AltPython3Parser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(AltPython3Parser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(AltPython3Parser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(AltPython3Parser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(AltPython3Parser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(AltPython3Parser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(AltPython3Parser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(AltPython3Parser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(AltPython3Parser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(AltPython3Parser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(AltPython3Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(AltPython3Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(AltPython3Parser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(AltPython3Parser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(AltPython3Parser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(AltPython3Parser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(AltPython3Parser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(AltPython3Parser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(AltPython3Parser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(AltPython3Parser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(AltPython3Parser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(AltPython3Parser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(AltPython3Parser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(AltPython3Parser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AltPython3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AltPython3Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link AltPython3Parser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(AltPython3Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AltPython3Parser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(AltPython3Parser.IntegerContext ctx);
}