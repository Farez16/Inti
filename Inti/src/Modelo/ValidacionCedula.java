package Modelo;

public class ValidacionCedula {
    public static boolean validarCedulaEcuatoriana(String cedula) {
        if (cedula == null || cedula.length() != 10) {
            return false;
        }

        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int total = 0;
        for (int i = 0; i < coeficientes.length; i++) {
            int digito = Character.getNumericValue(cedula.charAt(i));
            int producto = digito * coeficientes[i];
            if (producto >= 10) {
                producto -= 9;
            }
            total += producto;
        }

        int ultimoDigito = Character.getNumericValue(cedula.charAt(9));
        int verificador = (total % 10 == 0) ? 0 : 10 - (total % 10);

        return verificador == ultimoDigito;
    }
}
