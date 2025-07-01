package Controlador;

import Modelo.Saludo;
import Vista.Dashboard;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorSaludo {

//    private Dashboard vista;
//    private Saludo modelo;
//    private boolean mostrandoBienvenido = true; // Controla qué mensaje se muestra actualmente
//
//    public ControladorSaludo(Dashboard vista, Saludo modelo) {
//        this.vista = vista;
//        this.modelo = modelo;
//        iniciarTimerSaludo(); // Inicia el temporizador cuando el controlador se crea
//    }
//
//    private void iniciarTimerSaludo() {
//        // Configura el Timer para que se dispare cada 2 minutos (120,000 milisegundos)
//        Timer timer = new Timer(10000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Lógica para alternar el mensaje
//                if (mostrandoBienvenido) {
//                    modelo.setMensaje("Bienvenido");
//                    mostrandoBienvenido = false;
//                } else {
//                    modelo.setMensaje("Alli Shamushka");
//                    mostrandoBienvenido = true;
//                }
//                // Le pide a la vista que actualice su JLabel con el nuevo mensaje del modelo
//                vista.actualizarSaludo(modelo.getMensaje());
//            }
//        });
//        timer.start(); // Comienza el temporizador
//    }
//
//    public void inicializarVista() {
//        // Asegura que la vista muestre el estado inicial del modelo
//        vista.actualizarSaludo(modelo.getMensaje());
//    }
}
