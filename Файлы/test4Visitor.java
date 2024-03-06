// Generated from test4.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link test4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface test4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link test4Parser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(test4Parser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(test4Parser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(test4Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#comand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComand(test4Parser.ComandContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(test4Parser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(test4Parser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(test4Parser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#xchg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXchg(test4Parser.XchgContext ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#operand1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand1(test4Parser.Operand1Context ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand2(test4Parser.Operand2Context ctx);
	/**
	 * Visit a parse tree produced by {@link test4Parser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(test4Parser.RegisterContext ctx);
}