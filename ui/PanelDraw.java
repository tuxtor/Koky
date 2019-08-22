/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.kok.ui;

import com.jgranados.kok.instructions.Instruction;
import com.jgranados.kok.instructions.graphicinstructions.Graphicable;
import com.jgranados.kok.instructions.graphicinstructions.GraphicsInstruction;
import com.jgranados.kok.instructions.varinstructions.Assignable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 *
 * @author jose
 */
public class PanelDraw extends javax.swing.JPanel {

    private KokPointer kokPointer;
    private BufferedImage imageWithPointer;
    private BufferedImage imageNoPointer;
    private Graphics2D graphicsWithPointer;
    private Graphics2D graphicsNoPointer;

    /**
     * Creates new form PanelDraw
     */
    public PanelDraw() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imageWithPointer == null) {
            kokPointer = new KokPointer(this.getWidth() / 2, this.getHeight() / 2, 0, this);
            initImages();
        }
        g.drawImage(imageWithPointer, 0, 0, null);
    }

    private void initImages() {
        imageWithPointer = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphicsWithPointer = initImageGraphic(imageWithPointer);
        imageNoPointer = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        graphicsNoPointer = initImageGraphic(imageNoPointer);
        
        kokPointer.drawPointer(graphicsWithPointer);
    }

    private Graphics2D initImageGraphic(BufferedImage image) {
        Graphics2D imgGraphic = image.createGraphics();
        imgGraphic.setBackground(Color.WHITE);
        imgGraphic.clearRect(0, 0, this.getWidth(), this.getHeight());
        return imgGraphic;
    }

    public void runInstruction(Instruction instruction) {
        if (instruction instanceof Graphicable) {
            drawInstruction((Graphicable) instruction);
        } else if (instruction instanceof Assignable) {
            ((Assignable) instruction).assign();
        }
    }
    
    private void drawInstruction(Graphicable instruction) {
        // using the no pointer graphic to draw the instruction
        //graphicsNoPointer.setColor(kokPointer.getPenColor());
        graphicsNoPointer = instruction.execute(graphicsNoPointer, kokPointer);
        // cleanning the graphics with the pointer
        graphicsWithPointer.clearRect(0, 0, this.getWidth(), this.getHeight());
        // redrawing the graphics without the pointer
        graphicsWithPointer.drawImage(imageNoPointer, 0, 0, null);
        // adding the pointer to the draw
        kokPointer.drawPointer(graphicsWithPointer);
        this.repaint();
    }

    public void runInstructions(List<Instruction> instructions) {
        instructions.forEach((instruction) -> {
            runInstruction(instruction);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 153));
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}