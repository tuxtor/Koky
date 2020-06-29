package com.jgranados.koky.ui;

/**
 *
 * @author jose
 */
public class AboutDialog extends javax.swing.JDialog {

    /**
     * Creates new form AboutDialog
     */
    public AboutDialog(java.awt.Frame parent) {
        super(parent);
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(153, 51, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de...");
        setBackground(new java.awt.Color(153, 51, 0));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<html><p>Variante del lenguaje LOGO para enseñar conceptos básicos de programación a niños de 6to primaria en adelante.</p><p><center>Organización de Lenguajes y Compiladores 2<br>CUNOC USAC<br>2019-09-01<br>Versión 1.0.2</center><p>Desarrolladores:</p><br>Ingeniero José Moisés Granados Guevara<br>Augusto Ricardo Méndez Pum <br>Juan Pablo Orizábal Gil<br>Jesfrin Jesser González Fuentes<br>Juan Pablo Valiente González<br>Jonathan Bryant Daniel Chiroy Rivera<br>Jose Daniel Mazariegos Antón<br>Iván Fabricio Racancoj García<br>Bryan Misael Monzon Fuentes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 451, 369));
        jLabel1.getAccessibleContext().setAccessibleName("<html><p>Variante del lenguaje LOGO para enseñar conceptos básicos de programación a niños de 6to primaria en adelante.</p><p><center>Organización de Lenguajes y Compiladores 2<br>CUNOC USAC<br>2019-09-01<br>Versión 1.0.1</center><p>Desarrolladores:</p><br>Ingeniero José Moisés Granados Guevara<br>Augusto Ricardo Méndez Pum <br>Juan Pablo Orizábal Gil<br>Jesfrin Jesser González Fuentes<br>Juan Pablo Valiente González<br>Jonathan Bryant Daniel Chiroy Rivera<br>Jose Daniel Mazariegos Antón<br>Iván Fabricio Racancoj García<br>Bryan Misael Monzon Fuentes");

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setForeground(new java.awt.Color(0, 153, 0));
        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 399, 100, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jgranados/koky/ui/images/inglogo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 210, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
