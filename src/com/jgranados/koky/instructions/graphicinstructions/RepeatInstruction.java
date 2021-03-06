package com.jgranados.koky.instructions.graphicinstructions;

import com.jgranados.koky.instructions.ExecutionDescribable;
import com.jgranados.koky.instructions.Instruction;
import com.jgranados.koky.instructions.varinstructions.Assignable;
import com.jgranados.koky.interpreter.expr.AmbitEnum;
import com.jgranados.koky.interpreter.expr.Expr;
import com.jgranados.koky.interpreter.token.Token;
import com.jgranados.koky.ui.KokyPointer;
import com.jgranados.koky.instructions.logic.Messages;
import java.awt.Graphics2D;
import java.util.List;

/**
 *
 * @author jose
 */
public class RepeatInstruction extends GraphicsInstruction implements ExecutionDescribable{

    private Expr loops;
    private List<Instruction> instructions;

    public RepeatInstruction(Expr loops, List<Instruction> instructions) {
        this.loops = loops;
        this.instructions = instructions;
    }

    @Override
    public Graphics2D execute(Graphics2D graphicsNoPointer, KokyPointer currentPointer) {
        for (int i = 0; i < loops.operate(); i++) {
            for (Instruction instruction : instructions) {
                if (instruction instanceof Graphicable) {
                    graphicsNoPointer = ((Graphicable) instruction).execute(graphicsNoPointer, currentPointer);
                } else if (instruction instanceof Assignable){
                    ((Assignable) instruction).assign();
                }
            }
        }
        return graphicsNoPointer;
    }

    @Override
    public void assignAmbitToExpresions() {
        if(this.getAmbit()!=null){
            loops.changeAmbit(this.getAmbit());
        }else{
            loops.changeAmbit(AmbitEnum.GLOBAL);
        }
    }

    @Override
    public void assignTableTokenValue(Token token) {
        loops.setTableToken(token);
        for (Instruction instruction : instructions) {
            instruction.setAmbit(this.getAmbit());
            instruction.assignAmbitToExpresions();
            instruction.assignTableTokenValue(token);
        }
    }
    @Override
    public String getExecutionDescription() {
     return Messages.repeatInstruction();
    }
   
}
