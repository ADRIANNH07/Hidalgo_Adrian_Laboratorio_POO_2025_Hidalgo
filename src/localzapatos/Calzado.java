package localzapatos;

public abstract class Calzado {

    private String marca;
    private double talle;
    private double precioBase;
    private String color;

    public Calzado(String marca, double talle, double precioBase, String color) {
        this.marca = marca;
        this.talle = talle;
        this.precioBase = precioBase;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public double getTalle() {
        return talle;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public String toString() {
        return "Calzado{" +
                "marca='" + marca + '\'' +
                ", talle=" + talle +
                ", precioBase=" + precioBase +
                ", color='" + color + '\'' +
                '}';
    }
}
