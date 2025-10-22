package localzapatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tienda {

    private String nombre;
    private List<Calzado> stock;
    private List<Calzado> ventas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.stock = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public void agregarAlStock(Calzado calzado) {
        stock.add(calzado);
    }

    public boolean vender(Calzado calzado) {
        boolean vendido = stock.remove(calzado);
        if (vendido) {
            ventas.add(calzado);
        }
        return vendido;
    }

    public List<Calzado> buscarPorMarca(String marca) {
        List<Calzado> encontrados = new ArrayList<>();
        for (Calzado c : stock) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                encontrados.add(c);
            }
        }
        return encontrados;
    }

    public double calcularFacturacionTotal() {
        double total = 0;
        for (Calzado c : ventas) {
            total += c.calcularPrecioFinal();
        }
        return total;
    }

    public List<Calzado> obtenerStock() {
        return Collections.unmodifiableList(stock);
    }

    public String getNombre() {
        return nombre;
    }
}
