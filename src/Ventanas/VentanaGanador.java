/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

/**
 *
 * @author Camilo
 */
public class VentanaGanador extends javax.swing.JDialog {
    private String usuario;

    public VentanaGanador(java.awt.Frame parent, boolean modal, String usuario) {
        super(parent, modal);
        this.usuario = usuario;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaFelicitaciones = new javax.swing.JLabel();
        etiquetaGanaste = new javax.swing.JLabel();
        botonJugarDeNuevo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        gifGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaFelicitaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        etiquetaFelicitaciones.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaFelicitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaFelicitaciones.setText("¡Felicitaciones! "+usuario);
        panel.add(etiquetaFelicitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 70));

        etiquetaGanaste.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        etiquetaGanaste.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaGanaste.setText("¡Ganaste!");
        panel.add(etiquetaGanaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        botonJugarDeNuevo.setBackground(new java.awt.Color(0, 204, 204));
        botonJugarDeNuevo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonJugarDeNuevo.setText("Jugar de nuevo");
        botonJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarDeNuevoActionPerformed(evt);
            }
        });
        panel.add(botonJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 160, 30));

        botonSalir.setBackground(new java.awt.Color(0, 204, 204));
        botonSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panel.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 70, 30));

        gifGanador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ganador.gif"))); // NOI18N
        panel.add(gifGanador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarDeNuevoActionPerformed
        dispose();
    }//GEN-LAST:event_botonJugarDeNuevoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGanador dialog = new VentanaGanador(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJugarDeNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaFelicitaciones;
    private javax.swing.JLabel etiquetaGanaste;
    private javax.swing.JLabel gifGanador;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
