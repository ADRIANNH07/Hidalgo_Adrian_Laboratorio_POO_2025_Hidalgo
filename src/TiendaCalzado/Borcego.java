package TiendaCalzado;

public class Borcego extends Calzado {
    public Borcego(String id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return getPrecioBase() * 1.20;
    }
}
