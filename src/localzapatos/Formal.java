package localzapatos;

public class Formal extends Calzado {

    private String material;
    private boolean esCorteAlto;

    public Formal(String marca, double talle, double precioBase, String color,
                  String material, boolean esCorteAlto) {
        super(marca, talle, precioBase, color);
        this.material = material;
        this.esCorteAlto = esCorteAlto;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isEsCorteAlto() {
        return esCorteAlto;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase();
        if (material.equalsIgnoreCase("cuero")) {
            precio *= 1.15;
        }
        if (esCorteAlto) {
            precio *= 1.05;
        }
        return precio;
    }
}

