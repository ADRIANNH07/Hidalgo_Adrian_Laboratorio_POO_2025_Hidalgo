package localzapatos;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Zapatos Adrian");

        // Crear los calzados
        Zapatilla z1 = new Zapatilla("Nike", 42, 100000, "Negro", "Running", true);
        Zapatilla z2 = new Zapatilla("Topper", 41, 60000, "Blanco", "Casual", false);
        Formal f1 = new Formal("Guido", 43, 85000, "Marrón", "Cuero", true);
        Botin b1 = new Botin("Caterpillar", 44, 120000, "Arena", 25, true);

        // Agregar al stock
        tienda.agregarAlStock(z1);
        tienda.agregarAlStock(z2);
        tienda.agregarAlStock(f1);
        tienda.agregarAlStock(b1);

        // Mostrar el stock inicial
        System.out.println("===== STOCK INICIAL =====");
        for (Calzado c : tienda.obtenerStock()) {
            System.out.println(c + " | Precio final: $" + c.calcularPrecioFinal());
        }

        // Realizar algunas ventas
        tienda.vender(z1);
        tienda.vender(f1);

        // Mostrar stock restante
        System.out.println("\n===== STOCK RESTANTE =====");
        for (Calzado c : tienda.obtenerStock()) {
            System.out.println(c);
        }

        // La facturacion total
        System.out.println("\n===== FACTURACIÓN TOTAL =====");
        System.out.println("$" + tienda.calcularFacturacionTotal());
    }
}

