package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContrasenaNueva extends javax.swing.JPanel {

    private String correoUsuario;

    public ContrasenaNueva() {
        initComponents();
    }

    public ContrasenaNueva(String correoUsuario) {
        initComponents();
        this.correoUsuario = correoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public JLabel getLblCodigoRecibido() {
        return LblCodigoRecibido;
    }

    public JLabel getLblConfirmarContraseña() {
        return LblConfirmarContraseña;
    }

    public JLabel getLblLogo() {
        return LblLogo;
    }

    public JLabel getLblNombreProyecto() {
        return LblNombreProyecto;
    }

    public JLabel getLblNuevaContraseña() {
        return LblNuevaContraseña;
    }

    public JButton getjButton1GuardarContraseña() {
        return btnGuardarContraseña;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextField1ConfirmarContraseña() {
        return TextFieldConfirmarContraseña;
    }

    public JTextField getjTextField1IngresarCodigoRecibido() {
        return TextFieldIngresarCodigoRecibido;
    }

    public JTextField getjTextField1IngresarNuevaContraseña() {
        return TextFieldIngresarNuevaContraseña;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblLogo = new javax.swing.JLabel();
        LblNombreProyecto = new javax.swing.JLabel();
        LblCodigoRecibido = new javax.swing.JLabel();
        TextFieldIngresarCodigoRecibido = new javax.swing.JTextField();
        LblNuevaContraseña = new javax.swing.JLabel();
        TextFieldIngresarNuevaContraseña = new javax.swing.JTextField();
        LblConfirmarContraseña = new javax.swing.JLabel();
        TextFieldConfirmarContraseña = new javax.swing.JTextField();
        btnGuardarContraseña = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 770));

        LblLogo.setForeground(new java.awt.Color(255, 255, 255));
        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo 90 x90.png"))); // NOI18N

        LblNombreProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblNombreProyecto.setForeground(new java.awt.Color(255, 255, 255));
        LblNombreProyecto.setText("INTI");

        LblCodigoRecibido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblCodigoRecibido.setForeground(new java.awt.Color(255, 255, 255));
        LblCodigoRecibido.setText("Codigo Recibido");

        LblNuevaContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblNuevaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblNuevaContraseña.setText("Nueva Contraseña");

        LblConfirmarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblConfirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LblConfirmarContraseña.setText("Confirmar Contraseña");

        btnGuardarContraseña.setText("Guardar Contraseña");
        btnGuardarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(LblLogo)
                .addGap(18, 18, 18)
                .addComponent(LblNombreProyecto)
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(LblCodigoRecibido))
                        .addComponent(TextFieldIngresarCodigoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(LblNuevaContraseña))
                        .addComponent(TextFieldIngresarNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(LblConfirmarContraseña))
                        .addComponent(TextFieldConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btnGuardarContraseña)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(LblNombreProyecto)))
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(LblCodigoRecibido)
                    .addGap(12, 12, 12)
                    .addComponent(TextFieldIngresarCodigoRecibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(LblNuevaContraseña)
                    .addGap(12, 12, 12)
                    .addComponent(TextFieldIngresarNuevaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(LblConfirmarContraseña)
                    .addGap(12, 12, 12)
                    .addComponent(TextFieldConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)
                    .addComponent(btnGuardarContraseña)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarContraseñaActionPerformed

    }//GEN-LAST:event_btnGuardarContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblCodigoRecibido;
    public javax.swing.JLabel LblConfirmarContraseña;
    public javax.swing.JLabel LblLogo;
    public javax.swing.JLabel LblNombreProyecto;
    public javax.swing.JLabel LblNuevaContraseña;
    public javax.swing.JTextField TextFieldConfirmarContraseña;
    public javax.swing.JTextField TextFieldIngresarCodigoRecibido;
    public javax.swing.JTextField TextFieldIngresarNuevaContraseña;
    public javax.swing.JButton btnGuardarContraseña;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
