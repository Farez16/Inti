package Vista;

import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JPanel {
    
private String correoUsuario;

    public Dashboard() {
        initComponents();
    }
     public Dashboard(String correoUsuario) {
        initComponents();
        this.correoUsuario = correoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public JLabel getLblFondo4() {
        return LblFondo4;
    }

    public JLabel getLblFondoU1() {
        return LblFondoU1;
    }

    public JLabel getLblFondoU2() {
        return LblFondoU2;
    }

    public JLabel getLblFondoU3() {
        return LblFondoU3;
    }

    public JLabel getLblLogo() {
        return LblLogo;
    }

    public JLabel getLblNombreProyecto() {
        return LblNombreProyecto;
    }

    public JLabel getLblPanelSuperior() {
        return LblPanelSuperior;
    }

    public JLabel getLblRol() {
        return LblRol;
    }

    public JLabel getLblSaludo() {
        return LblSaludo;
    }

    public JLabel getLblUnidad1() {
        return LblUnidad1;
    }

    public JLabel getLblUnidad2() {
        return LblUnidad2;
    }

    public JLabel getLblUnidad3() {
        return LblUnidad3;
    }

    public JLabel getLblUnidad4() {
        return LblUnidad4;
    }

    public JLabel getLblimagen() {
        return Lblimagen;
    }

    public JLabel getLblimagenU1() {
        return LblimagenU1;
    }

    public JLabel getLblimagenU2() {
        return LblimagenU2;
    }

    public JLabel getLblimagenU3() {
        return LblimagenU3;
    }

    public JLabel getLblimagenU4() {
        return LblimagenU4;
    }

    public JPanel getPanelMenu() {
        return PanelMenu;
    }

    public JPanel getPanelVistas() {
        return PanelVistas;
    }

    public JButton getBtnCertificado() {
        return btnCertificado;
    }

    public JButton getBtnCuenta() {
        return btnCuenta;
    }

    public JButton getBtnDashboard() {
        return btnDashboard;
    }

    public JButton getBtnJuegos() {
        return btnJuegos;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnU1() {
        return btnU1;
    }

    public JButton getBtnU2() {
        return btnU2;
    }

    public JButton getBtnU3() {
        return btnU3;
    }

    public JButton getBtnU4() {
        return btnU4;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        LblNombreProyecto = new javax.swing.JLabel();
        LblLogo = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnCuenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCertificado = new javax.swing.JButton();
        btnJuegos = new javax.swing.JButton();
        PanelVistas = new javax.swing.JPanel();
        LblimagenU1 = new javax.swing.JLabel();
        LblimagenU2 = new javax.swing.JLabel();
        LblimagenU3 = new javax.swing.JLabel();
        LblimagenU4 = new javax.swing.JLabel();
        LblUnidad1 = new javax.swing.JLabel();
        LblUnidad2 = new javax.swing.JLabel();
        LblUnidad3 = new javax.swing.JLabel();
        LblUnidad4 = new javax.swing.JLabel();
        btnU1 = new javax.swing.JButton();
        btnU2 = new javax.swing.JButton();
        btnU3 = new javax.swing.JButton();
        btnU4 = new javax.swing.JButton();
        LblFondoU1 = new javax.swing.JLabel();
        LblFondoU2 = new javax.swing.JLabel();
        LblFondo4 = new javax.swing.JLabel();
        LblFondoU3 = new javax.swing.JLabel();
        Lblimagen = new javax.swing.JLabel();
        LblSaludo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        LblRol = new javax.swing.JLabel();
        LblPanelSuperior = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(102, 102, 102));

        LblNombreProyecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblNombreProyecto.setForeground(new java.awt.Color(255, 255, 255));
        LblNombreProyecto.setText("INTI");

        LblLogo.setForeground(new java.awt.Color(255, 255, 255));
        LblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo 90 x90.png"))); // NOI18N

        btnDashboard.setBackground(new java.awt.Color(102, 102, 102));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        btnDashboard.setText("  Dashboard");
        btnDashboard.setBorder(null);
        btnDashboard.setOpaque(true);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnCuenta.setBackground(new java.awt.Color(102, 102, 102));
        btnCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono-usuario.png"))); // NOI18N
        btnCuenta.setText("  Cuenta");
        btnCuenta.setBorder(null);
        btnCuenta.setOpaque(true);

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cierre-de-sesión.png"))); // NOI18N
        btnSalir.setText("  Salir");
        btnSalir.setBorder(null);
        btnSalir.setOpaque(true);

        btnCertificado.setBackground(new java.awt.Color(102, 102, 102));
        btnCertificado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCertificado.setForeground(new java.awt.Color(255, 255, 255));
        btnCertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/certificado.png"))); // NOI18N
        btnCertificado.setText("  Certificado");
        btnCertificado.setBorder(null);
        btnCertificado.setOpaque(true);

        btnJuegos.setBackground(new java.awt.Color(102, 102, 102));
        btnJuegos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnJuegos.setForeground(new java.awt.Color(255, 255, 255));
        btnJuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        btnJuegos.setText("  Interactivo");
        btnJuegos.setBorder(null);
        btnJuegos.setOpaque(true);

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelMenuLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(LblNombreProyecto))
                        .addGroup(PanelMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LblNombreProyecto)))
                .addGap(36, 36, 36)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 770));

        PanelVistas.setBackground(new java.awt.Color(255, 255, 255));
        PanelVistas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblimagenU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/U1.png"))); // NOI18N
        PanelVistas.add(LblimagenU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 210, 140));

        LblimagenU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/U2.png"))); // NOI18N
        LblimagenU2.setPreferredSize(new java.awt.Dimension(264, 176));
        PanelVistas.add(LblimagenU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 210, 140));

        LblimagenU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/U3.png"))); // NOI18N
        PanelVistas.add(LblimagenU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 210, 140));

        LblimagenU4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/U4.png"))); // NOI18N
        PanelVistas.add(LblimagenU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 210, 140));

        LblUnidad1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LblUnidad1.setText("<html>\n    <span style=\"font-size:14px;\"><b>UNIDAD 1</b></span><br></span><br>\n    <span style=\"font-size:12px;\"><b>Expresión oral y escrita</b></span><br>\n    <span style=\"font-size:12px;\">1.1 Saludos</span><br>\n    <span style=\"font-size:12px;\">1.2 Fonologia</span><br>\n    <span style=\"font-size:12px;\">1.3 Pronombres</span>\n</html>");
        PanelVistas.add(LblUnidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, -1));

        LblUnidad2.setText("<html>\n    <span style=\"font-size:14px;\"><b>UNIDAD 2</b></span><br></span><br>\n    <span style=\"font-size:12px;\"><b>Números y Animales</b></span><br>\n    <span style=\"font-size:12px;\">2.1 Números del 1 al 100</span><br>\n    <span style=\"font-size:12px;\">2.1.1 Signos y operaciones básicas</span><br>\n    <span style=\"font-size:12px;\">2.1.2 Número ordinales</span><br>\n   <span style=\"font-size:12px;\">2.2 Animales domesticos</span><br>\n   <span style=\"font-size:12px;\">2.2.1 Animales silvestres</span><br>\n <span style=\"font-size:12px;\">2.2.2 Clasificación de animales femenino - masculino </span>\n</html>");
        PanelVistas.add(LblUnidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 250, -1));

        LblUnidad3.setText("<html>\n    <span style=\"font-size:14px;\"><b>UNIDAD 3</b></span><br></span><br>\n    <span style=\"font-size:12px;\"><b>La familia, sus estucturas e Identidad Cultural</b></span><br>\n    <span style=\"font-size:12px;\">3.1 La familia</span><br>\n    <span style=\"font-size:12px;\">3.1.1 La estructura de la familia</span><br>\n   <span style=\"font-size:12px;\">3.2 Vestimente Hombre y Mujer </span>\n</html>");
        PanelVistas.add(LblUnidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 230, -1));

        LblUnidad4.setText("<html>\n    <span style=\"font-size:14px;\"><b>UNIDAD 4</b></span><br></span><br>\n    <span style=\"font-size:12px;\"><b>Colores y el Cuerpo humanos</b></span><br>\n    <span style=\"font-size:12px;\">4.1 Los colores primario</span><br>\n    <span style=\"font-size:12px;\">4.1.1 Colores secundarios</span><br>\n    <span style=\"font-size:12px;\">4.2 Las partes del cuerpo humano</span><br>\n   <span style=\"font-size:12px;\">4.2.1 Funciones del cuerpo humano</span>\n</html>");
        PanelVistas.add(LblUnidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 240, -1));

        btnU1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnU1.setText("Iniciar");
        btnU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU1ActionPerformed(evt);
            }
        });
        PanelVistas.add(btnU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, 30));

        btnU2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnU2.setText("Iniciar");
        PanelVistas.add(btnU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        btnU3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnU3.setText("Iniciar");
        PanelVistas.add(btnU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, -1, -1));

        btnU4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnU4.setText("Iniciar");
        PanelVistas.add(btnU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 510, -1, -1));

        LblFondoU1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RectanguloUnidades.jpeg"))); // NOI18N
        PanelVistas.add(LblFondoU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 114, -1, -1));

        LblFondoU2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RectanguloUnidades.jpeg"))); // NOI18N
        PanelVistas.add(LblFondoU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 114, -1, -1));

        LblFondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RectanguloUnidades.jpeg"))); // NOI18N
        PanelVistas.add(LblFondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 114, -1, -1));

        LblFondoU3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RectanguloUnidades.jpeg"))); // NOI18N
        PanelVistas.add(LblFondoU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 114, -1, -1));

        jPanel1.add(PanelVistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 1190, 660));

        Lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Users.png"))); // NOI18N
        jPanel1.add(Lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 90, 90));

        LblSaludo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblSaludo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(LblSaludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 219, 24));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Ariel Farez");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 40, -1, -1));

        LblRol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LblRol.setForeground(new java.awt.Color(255, 255, 255));
        LblRol.setText("Estudiante");
        jPanel1.add(LblRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, -1, -1));

        LblPanelSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PanelSuperior.jpeg"))); // NOI18N
        jPanel1.add(LblPanelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1190, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnU1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel LblFondo4;
    public javax.swing.JLabel LblFondoU1;
    public javax.swing.JLabel LblFondoU2;
    public javax.swing.JLabel LblFondoU3;
    public javax.swing.JLabel LblLogo;
    public javax.swing.JLabel LblNombreProyecto;
    public javax.swing.JLabel LblPanelSuperior;
    public javax.swing.JLabel LblRol;
    public javax.swing.JLabel LblSaludo;
    public javax.swing.JLabel LblUnidad1;
    public javax.swing.JLabel LblUnidad2;
    public javax.swing.JLabel LblUnidad3;
    public javax.swing.JLabel LblUnidad4;
    public javax.swing.JLabel Lblimagen;
    public javax.swing.JLabel LblimagenU1;
    public javax.swing.JLabel LblimagenU2;
    public javax.swing.JLabel LblimagenU3;
    public javax.swing.JLabel LblimagenU4;
    public javax.swing.JPanel PanelMenu;
    public javax.swing.JPanel PanelVistas;
    public javax.swing.JButton btnCertificado;
    public javax.swing.JButton btnCuenta;
    public javax.swing.JButton btnDashboard;
    public javax.swing.JButton btnJuegos;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnU1;
    public javax.swing.JButton btnU2;
    public javax.swing.JButton btnU3;
    public javax.swing.JButton btnU4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
