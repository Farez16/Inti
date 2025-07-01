
import Modelo.OTPService;
import Modelo.Usuario;
import Vista.ContrasenaNueva;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ControladorContrasenaNueva {

    private ContrasenaNueva vista;
    private String correoUsuario;
    private JDialog dialog;

    public ControladorContrasenaNueva(ContrasenaNueva vista, String correoUsuario, JDialog dialog) {
        this.vista = vista;
        this.correoUsuario = correoUsuario;
        this.dialog = dialog;

        this.vista.getjButton1GuardarContraseña().addActionListener(e -> guardarContrasena());
    }

    private void guardarContrasena() {
        String codigoIngresado = vista.getjTextField1IngresarCodigoRecibido().getText().trim();
        String nuevaContrasena = vista.getjTextField1IngresarNuevaContraseña().getText().trim();
        String confirmarContrasena = vista.getjTextField1ConfirmarContraseña().getText().trim();

        if (codigoIngresado.isEmpty() || nuevaContrasena.isEmpty() || confirmarContrasena.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos.", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 🔴 AQUÍ EL CAMBIO CLAVE
        if (!OTPService.validarCodigo(correoUsuario, codigoIngresado)) {
            JOptionPane.showMessageDialog(vista, "El código ingresado no es correcto.", "Código incorrecto", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!nuevaContrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(vista, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean actualizada = Usuario.actualizarContrasena(correoUsuario, nuevaContrasena);
        if (actualizada) {
            OTPService.borrarCodigo(correoUsuario); // Limpieza del código
            JOptionPane.showMessageDialog(vista, "Contraseña actualizada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            dialog.dispose();  // Cierra el diálogo
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo actualizar la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
