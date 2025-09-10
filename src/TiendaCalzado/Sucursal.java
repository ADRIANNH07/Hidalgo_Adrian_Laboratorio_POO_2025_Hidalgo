package TiendaCalzado;


import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private double alquilerMensual;
    private List<Calzado> calzados = new ArrayList<>();

    public Sucursal(String nombre, double alquilerMensual) {
        this.nombre = nombre;
        this.alquilerMensual = alquilerMensual;
    }

    public void agregarCalzado(Calzado c) {
        calzados.add(c);
    }

    public double capitalSucursal() {
        double suma = 0.0;
        for (Calzado c : calzados) {
            suma += c.getPrecioVenta();
        }
        return suma - alquilerMensual;
    }

    public boolean tieneCalzadoBarato() {
        for (Calzado c : calzados) {
            if (c.getPrecioBase() < 15000) return true;
        }
        return false;
    }

    public List<Calzado> getCalzados() { return calzados; }
    public String getNombre() { return nombre; }
    public double getAlquilerMensual() { return alquilerMensual; }

    @Override
    public String toString() {
        return "Sucursal " + nombre + " (alquiler=" + alquilerMensual + ")";
    }
}