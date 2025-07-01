package Modelo;

public class Saludo {
    private String mensaje;
    private String nombre;

    public Saludo(String nombre) {
        this.nombre = nombre;
        this.mensaje = "Alli Shamushka, " + nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje + ", " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
}