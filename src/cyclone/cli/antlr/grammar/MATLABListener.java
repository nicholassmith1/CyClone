// Generated from grammar/MATLAB.g4 by ANTLR 4.7.1
package cyclone.cli.antlr.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MATLABParser}.
 */
public interface MATLABListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MATLABParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MATLABParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MATLABParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#functionMFile}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMFile(MATLABParser.FunctionMFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#functionMFile}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMFile(MATLABParser.FunctionMFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_def_line}.
	 * @param ctx the parse tree
	 */
	void enterF_def_line(MATLABParser.F_def_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_def_line}.
	 * @param ctx the parse tree
	 */
	void exitF_def_line(MATLABParser.F_def_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_input}.
	 * @param ctx the parse tree
	 */
	void enterF_input(MATLABParser.F_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_input}.
	 * @param ctx the parse tree
	 */
	void exitF_input(MATLABParser.F_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterF_argument_list(MATLABParser.F_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitF_argument_list(MATLABParser.F_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#f_body}.
	 * @param ctx the parse tree
	 */
	void enterF_body(MATLABParser.F_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#f_body}.
	 * @param ctx the parse tree
	 */
	void exitF_body(MATLABParser.F_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#scriptMFile}.
	 * @param ctx the parse tree
	 */
	void enterScriptMFile(MATLABParser.ScriptMFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#scriptMFile}.
	 * @param ctx the parse tree
	 */
	void exitScriptMFile(MATLABParser.ScriptMFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MATLABParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MATLABParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MATLABParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MATLABParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(MATLABParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(MATLABParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MATLABParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MATLABParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#command_form}.
	 * @param ctx the parse tree
	 */
	void enterCommand_form(MATLABParser.Command_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#command_form}.
	 * @param ctx the parse tree
	 */
	void exitCommand_form(MATLABParser.Command_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#command_args}.
	 * @param ctx the parse tree
	 */
	void enterCommand_args(MATLABParser.Command_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#command_args}.
	 * @param ctx the parse tree
	 */
	void exitCommand_args(MATLABParser.Command_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#for_command}.
	 * @param ctx the parse tree
	 */
	void enterFor_command(MATLABParser.For_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#for_command}.
	 * @param ctx the parse tree
	 */
	void exitFor_command(MATLABParser.For_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#if_command}.
	 * @param ctx the parse tree
	 */
	void enterIf_command(MATLABParser.If_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#if_command}.
	 * @param ctx the parse tree
	 */
	void exitIf_command(MATLABParser.If_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#global_command}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_command(MATLABParser.Global_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#global_command}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_command(MATLABParser.Global_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#while_command}.
	 * @param ctx the parse tree
	 */
	void enterWhile_command(MATLABParser.While_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#while_command}.
	 * @param ctx the parse tree
	 */
	void exitWhile_command(MATLABParser.While_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#return_command}.
	 * @param ctx the parse tree
	 */
	void enterReturn_command(MATLABParser.Return_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#return_command}.
	 * @param ctx the parse tree
	 */
	void exitReturn_command(MATLABParser.Return_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MATLABParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MATLABParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MATLABParser.ExprContext ctx);
}