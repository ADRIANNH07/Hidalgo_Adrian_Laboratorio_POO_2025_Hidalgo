package TiendaCalzado;

public class Sandalia extends Calzado {
    public Sandalia(String id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }


    public double getPrecioVenta() {
        return getPrecioBase();
    }
}