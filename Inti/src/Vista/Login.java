package Vista;

import Modelo.EmailSender;
import Modelo.OTPService;
import Modelo.Usuario;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    private String correoUsuario;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        TxtContraseña.setEnabled(false);
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public JLabel getLblContraseña() {
        return LblContraseña;
    }

    public JTextField getTxtContraseña() {
        return TxtContraseña;
    }

    public JTextField getTxtUsuario() {
        return TxtUsuario;
    }

    public JButton getBtnCodigo() {
        return btnCodigo;
    }

    public JButton getBtnInicar() {
        return btnInicar;
    }

    public JButton getBtnIniciarGoogle() {
        return btnIniciarGoogle;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getUsuario() {
        return usuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCodigo = new javax.swing.JButton();
        btnInicar = new javax.swing.JButton();
        LblContraseña = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JTextField();
        TxtUsuario = new javax.swing.JTextField();
        btnIniciarGoogle = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCodigo.setText("Recibir Codigo");
        btnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, -1, -1));

        btnInicar.setText("Iniciar");
        btnInicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, -1, -1));

        LblContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblContraseña.setText("Contraseña");
        getContentPane().add(LblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 80, -1));
        getContentPane().add(TxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 190, -1));
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 190, -1));

        btnIniciarGoogle.setText("Iniciar Google");
        btnIniciarGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarGoogleActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, 130, 20));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario.setText("Usuario");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 60, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarGoogleActionPerformed

    }//GEN-LAST:event_btnIniciarGoogleActionPerformed

    private void btnInicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarActionPerformed

    }//GEN-LAST:event_btnInicarActionPerformed

    private void btnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoActionPerformed

    }//GEN-LAST:event_btnCodigoActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblContraseña;
    public javax.swing.JTextField TxtContraseña;
    public javax.swing.JTextField TxtUsuario;
    public javax.swing.JButton btnCodigo;
    public javax.swing.JButton btnInicar;
    public javax.swing.JButton btnIniciarGoogle;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
