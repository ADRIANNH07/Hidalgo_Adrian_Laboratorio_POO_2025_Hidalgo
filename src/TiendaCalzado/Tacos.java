package TiendaCalzado;

public class Tacos extends Calzado {
    public Tacos(String id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    public double getPrecioVenta() {
        return getPrecioBase() * 1.30;
    }
}