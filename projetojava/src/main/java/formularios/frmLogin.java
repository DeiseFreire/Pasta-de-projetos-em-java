/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import Classes.Dados;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author deise
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
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
        txtUsuario1 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        cmdLogin = new javax.swing.JToggleButton();
        cmdSair = new javax.swing.JToggleButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        setForeground(java.awt.Color.blue);
        setResizable(false);

        txtUsuario1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtUsuario1.setForeground(new java.awt.Color(0, 0, 204));
        txtUsuario1.setText("Usuário:");

        txtSenha1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txtSenha1.setForeground(new java.awt.Color(0, 0, 204));
        txtSenha1.setText("Senha:");

        jTextField1.setText("txtUsuario");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        cmdLogin.setText("Login");
        cmdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLoginActionPerformed(evt);
            }
        });

        cmdSair.setText("Sair");
        cmdSair.setMaximumSize(new java.awt.Dimension(57, 23));
        cmdSair.setMinimumSize(new java.awt.Dimension(57, 23));
        cmdSair.setPreferredSize(new java.awt.Dimension(57, 23));
        cmdSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cmdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(cmdSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdLogin)
                    .addComponent(cmdSair, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLoginActionPerformed
        // Código do botão login
        Dados clsdados = new Dados();
        if (!clsdados.validarUsuarios(txtusuario.getText(), txtsenha.getPassword())) {
            Object cmdsair = null;
            JOptionPane.showMessageDialog(rootPane, "URUÁRIO E SENHA INCORRETAS");
            txtusuario.setText("");
            txtsenha.setText("");
            txtusuario.requestFocusinWindow();
            return;
        } else {
        }
        frmMenu frmmenu = new frmMenu();
        this.setVisible(false);
        frmmenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frmmenu.setVisible(true);
    }//GEN-LAST:event_cmdLoginActionPerformed

    private void cmdSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSairActionPerformed
        // Este é o código do botão sair
        this.dispose();
    }//GEN-LAST:event_cmdSairActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cmdLogin;
    private javax.swing.JToggleButton cmdSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel txtSenha1;
    private javax.swing.JLabel txtUsuario1;
    // End of variables declaration//GEN-END:variables

    public void setlocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
