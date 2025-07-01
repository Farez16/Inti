package Modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class OTPService {
    private static final Map<String, String> codigos = new HashMap<>();

    public static String generarYEnviarCodigo(String correo) {
    String codigo = String.format("%06d", new Random().nextInt(1000000));
    codigos.put(correo, codigo);
    System.out.println("DEBUG: Código OTP para " + correo + ": " + codigo); 
    return codigo;
    }

    public static boolean validarCodigo(String correo, String codigoIngresado) {
        String codigoGuardado = codigos.get(correo);
        return codigoGuardado != null && codigoGuardado.equals(codigoIngresado);
    }

    public static void borrarCodigo(String correo) {
        codigos.remove(correo);
    }

    public static boolean codigoEnviado(String correo) {
        return codigos.containsKey(correo);
    }
}
