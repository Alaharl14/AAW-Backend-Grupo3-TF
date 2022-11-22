package pe.edu.upc.backendaww.entities;

public class Respuesta {

    private String nombre_cuenta;
    private String cantidad;

    public Respuesta(String nombre_cuenta, String cantidad) {
        this.nombre_cuenta = nombre_cuenta;
        this.cantidad = cantidad;
    }

    public Respuesta() {
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}