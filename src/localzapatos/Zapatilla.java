package localzapatos;

public class Zapatilla extends Calzado {

    private String tipoDeportiva;
    private boolean tieneAmortiguacion;

    public Zapatilla(String marca, double talle, double precioBase, String color,
                     String tipoDeportiva, boolean tieneAmortiguacion) {
        super(marca, talle, precioBase, color);
        this.tipoDeportiva = tipoDeportiva;
        this.tieneAmortiguacion = tieneAmortiguacion;
    }

    public String getTipoDeportiva() {
        return tipoDeportiva;
    }

    public boolean isTieneAmortiguacion() {
        return tieneAmortiguacion;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase();
        if (tieneAmortiguacion) {
            precio *= 1.12;
        }
        if (esMarcaPremium(getMarca())) {
            precio *= 1.08;
        }
        return precio;
    }

    private boolean esMarcaPremium(String marca) {
        return marca.equalsIgnoreCase("Nike") || marca.equalsIgnoreCase("Adidas");
    }
}


