package localzapatos;

public class Botin extends Calzado {

    private double alturaCano;
    private boolean impermeable;

    public Botin(String marca, double talle, double precioBase, String color,
                 double alturaCano, boolean impermeable) {
        super(marca, talle, precioBase, color);
        this.alturaCano = alturaCano;
        this.impermeable = impermeable;
    }

    public double getAlturaCano() {
        return alturaCano;
    }

    public boolean isImpermeable() {
        return impermeable;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase();
        if (impermeable) {
            precio *= 1.10;
        }
        if (alturaCano > 20) {
            precio *= 1.07;
        }
        return precio;
    }
}
