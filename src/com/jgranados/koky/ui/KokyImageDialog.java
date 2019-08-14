/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jgranados.koky.ui;

import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jesfrin
 */
public class KokyImageDialog extends javax.swing.JDialog {

    private final LinkedList<String> SMALL_IMAGES;
    private final LinkedList<String> BIG_IMAGES;
    private String imgUrl;
    private PanelDraw panel;

    /**
     * Creates new form KokyImageDialog
     */
    public KokyImageDialog(java.awt.Frame parent, boolean modal, PanelDraw panel) {
        super(parent, modal);
        initComponents();
        this.panel = panel;
        BIG_IMAGES = loadLargeAddress();
        SMALL_IMAGES = loadSmallAddress();
        imgUrl = "/com/jgranados/koky/ui/images/kok_pointer_32.png";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagenLabel = new javax.swing.JLabel();
        siguienteButton = new javax.swing.JButton();
        anteriorButton = new javax.swing.JButton();
        AceptarButton = new javax.swing.JButton();
        aleatorioButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setForeground(new java.awt.Color(51, 255, 51));

        imagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jgranados/koky/ui/images/kok_pointer_32.png"))); // NOI18N

        siguienteButton.setBackground(new java.awt.Color(255, 255, 255));
        siguienteButton.setForeground(new java.awt.Color(0, 153, 0));
        siguienteButton.setText("Siguiente");
        siguienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteButtonActionPerformed(evt);
            }
        });

        anteriorButton.setBackground(new java.awt.Color(255, 255, 255));
        anteriorButton.setForeground(new java.awt.Color(0, 153, 0));
        anteriorButton.setText("Anterior");
        anteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorButtonActionPerformed(evt);
            }
        });

        AceptarButton.setBackground(new java.awt.Color(255, 255, 255));
        AceptarButton.setForeground(new java.awt.Color(0, 153, 0));
        AceptarButton.setText("Aceptar");
        AceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarButtonActionPerformed(evt);
            }
        });

        aleatorioButton.setBackground(new java.awt.Color(255, 255, 255));
        aleatorioButton.setForeground(new java.awt.Color(0, 153, 0));
        aleatorioButton.setText("Aleatorio");
        aleatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleatorioButtonActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelarButton.setForeground(new java.awt.Color(0, 153, 0));
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(anteriorButton)
                        .addGap(18, 18, 18)
                        .addComponent(siguienteButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aleatorioButton)
                    .addComponent(AceptarButton)
                    .addComponent(cancelarButton))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anteriorButton)
                            .addComponent(siguienteButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(AceptarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aleatorioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorButtonActionPerformed
        verImagenAnterior();
    }//GEN-LAST:event_anteriorButtonActionPerformed

    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteButtonActionPerformed
        verImagenSiguiente();
    }//GEN-LAST:event_siguienteButtonActionPerformed

    private void AceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarButtonActionPerformed
        int imagePosition = BIG_IMAGES.indexOf(imgUrl);
        try {
            this.panel.changeImage(SMALL_IMAGES.get(imagePosition));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
            Logger.getLogger(KokyImageDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_AceptarButtonActionPerformed

    private void aleatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleatorioButtonActionPerformed
        int numero = (int) (Math.random() * 6);
        try {
            this.panel.changeImage(SMALL_IMAGES.get(numero));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
            Logger.getLogger(KokyImageDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_aleatorioButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarButton;
    private javax.swing.JButton aleatorioButton;
    private javax.swing.JButton anteriorButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton siguienteButton;
    // End of variables declaration//GEN-END:variables

    private void verImagenAnterior() {
        int imagePosition = BIG_IMAGES.indexOf(imgUrl);
        if (imagePosition == 0) {//Primer elemento,por lo que se mueve al ultiumo
            imagePosition = BIG_IMAGES.size() - 1;
        } else {
            imagePosition--;
        }
        this.imgUrl = BIG_IMAGES.get(imagePosition);
        this.imagenLabel.setIcon(new ImageIcon(getClass().getResource(BIG_IMAGES.get(imagePosition))));
    }

    private void verImagenSiguiente() {
        int imagePosition = BIG_IMAGES.indexOf(imgUrl);
        if (imagePosition == (BIG_IMAGES.size() - 1)) {//Ultimo elemento
            imagePosition = 0;
        } else {
            imagePosition++;
        }
        this.imgUrl = BIG_IMAGES.get(imagePosition);
        this.imagenLabel.setIcon(new ImageIcon(getClass().getResource(BIG_IMAGES.get(imagePosition))));
    }

    private LinkedList loadLargeAddress() {
        LinkedList<String> addresses = new LinkedList<>();
        addresses.add("/com/jgranados/koky/ui/images/kok_pointer_32.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga1G.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga2G.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga3G.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga4G.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga5G.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga6G.png");
        return addresses;
    }

    private LinkedList loadSmallAddress() {
        LinkedList<String> addresses = new LinkedList<>();
        addresses.add("/com/jgranados/koky/ui/images/kok_pointer_32.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga1.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga2.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga3.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga4.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga5.png");
        addresses.add("/com/jgranados/koky/ui/images/tortuga6.png");
        return addresses;
    }

}
