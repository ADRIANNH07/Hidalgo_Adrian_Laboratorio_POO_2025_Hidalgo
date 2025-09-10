package TiendaCalzado;

public abstract class Calzado {
    private String id;
    private int talle;
    private double precioBase;

    public Calzado(String id, int talle, double precioBase) {
        this.id = id;
        this.talle = talle;
        this.precioBase = precioBase;
    }

    public String getId() { return id; }
    public int getTalle() { return talle; }
    public double getPrecioBase() { return precioBase; }

    public abstract double getPrecioVenta();

   
    public String toString() {
        return String.format("%s[id=%s, talle=%d, base=%.2f, venta=%.2f]",
                this.getClass().getSimpleName(), id, talle, precioBase, getPrecioVenta());
    }
}