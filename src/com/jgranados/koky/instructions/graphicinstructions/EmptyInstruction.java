package com.jgranados.koky.instructions.graphicinstructions;

import com.jgranados.koky.interpreter.token.Token;
import com.jgranados.koky.instructions.ExecutionDescribable;
import com.jgranados.koky.instructions.logic.Messages;
import com.jgranados.koky.ui.KokyPointer;
import java.awt.Graphics2D;

/**
 *
 * @author jose
 */
public class EmptyInstruction extends GraphicsInstruction implements ExecutionDescribable {

    @Override
    public Graphics2D execute(Graphics2D graphicsNoPointer, KokyPointer currentPointer) {
        // Do nothing
        return graphicsNoPointer;
    }

    @Override
    public void assignAmbitToExpresions() {
        //Nothign this clas don't have Expr
    }

    @Override
    public void assignTableTokenValue(Token token) {
        //Nothing this class don't have Expresions
    }
    @Override
    public String getExecutionDescription() {
        return Messages.newVariable();
    }
    
}
