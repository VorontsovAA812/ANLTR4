// Generated from test4.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link test4Parser}.
 */
public interface test4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link test4Parser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(test4Parser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(test4Parser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(test4Parser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(test4Parser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(test4Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(test4Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#comand}.
	 * @param ctx the parse tree
	 */
	void enterComand(test4Parser.ComandContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#comand}.
	 * @param ctx the parse tree
	 */
	void exitComand(test4Parser.ComandContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(test4Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(test4Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(test4Parser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(test4Parser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(test4Parser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(test4Parser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#xchg}.
	 * @param ctx the parse tree
	 */
	void enterXchg(test4Parser.XchgContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#xchg}.
	 * @param ctx the parse tree
	 */
	void exitXchg(test4Parser.XchgContext ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#operand1}.
	 * @param ctx the parse tree
	 */
	void enterOperand1(test4Parser.Operand1Context ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#operand1}.
	 * @param ctx the parse tree
	 */
	void exitOperand1(test4Parser.Operand1Context ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#operand2}.
	 * @param ctx the parse tree
	 */
	void enterOperand2(test4Parser.Operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#operand2}.
	 * @param ctx the parse tree
	 */
	void exitOperand2(test4Parser.Operand2Context ctx);
	/**
	 * Enter a parse tree produced by {@link test4Parser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(test4Parser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link test4Parser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(test4Parser.RegisterContext ctx);
}