package jminusminus;

/**
 * Created by roman on 1.5.17.
 */

/**
 * The AST node for an double literal.
 */
public class JLiteralDouble extends JExpression {

    /** String representation of the double.*/
    private String text;

    /**
     * Construct an AST node for an double literal given its line number and string
     * representation.
     *
     * @param line
     *            line in which the literal occurs in the source file.
     * @param text
     *            string representation of the literal.
     */

    public JLiteralDouble(int line, int column, String text){
        super(line, column);
        this.text = text;
    }

    /**
     * Analyzing an double literal is trivial.
     *
     * @param context
     *            context in which names are resolved (ignored here).
     * @return the analyzed (and possibly rewritten) AST subtree.
     */

    @Override
    public JExpression analyze(Context context) {
        type = Type.DOUBLE;
        return this;
    }

    /**
     * Generating code for an double literal means generating code to push it onto
     * the stack.
     *
     * @param output
     *            the code emitter (basically an abstraction for producing the
     *            .class file).
     */

    @Override
    public void codegen(CLEmitter output) {

    }

    /**
     * @inheritDoc
     */

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JLiteralDouble line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
    }
}
