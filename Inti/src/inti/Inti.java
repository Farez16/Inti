package inti;

import Controlador.ControladorInti;
import Controlador.ControladorLogin;
import Controlador.ControladorSaludo;
import Modelo.Saludo;
import Modelo.Usuario;
import Vista.Dashboard;
import Vista.Login;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import Conexion.Conexion;

public class Inti {

    public static void main(String[] args) {
        // Aplicar FlatLaf antes de mostrar la interfaz
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.err.println("No se pudo aplicar FlatLaf: " + ex);
        }

        // Ejecutar en el Event Dispatch Thread
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
// Crear la vista
        Login vistaLogin = new Login();

        // Crear el controlador con la vista
        ControladorLogin controlador = new ControladorLogin(vistaLogin);

        // Mostrar la vista
        vistaLogin.setVisible(true);
    }
            });
}
}







//                // 1. Crear el Modelo
//                Usuario modelo = new Saludo("Ariel Farez");
//
//                // 2. Crear la Vista
//                Dashboard vistaPrincipal = new Dashboard();
//
//                // 3. Crear los Controladores
//                ControladorSaludo controladorSaludo = new ControladorSaludo(vistaPrincipal, modelo);
//                ControladorInti controladorInti = new ControladorInti(vistaPrincipal);
//
//                // 4. Inicializar la vista (si es necesario)
//                controladorSaludo.inicializarVista();
//
//                // 5. Hacer visible la ventana
//                vistaPrincipal.setVisible(true);
//       
       
           
