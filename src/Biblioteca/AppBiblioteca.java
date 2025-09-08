package Biblioteca;

public class AppBiblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, 120);
        Revista revista = new Revista("National Geographic", "Varios", 2023, 50);

        libro.mostrarInfo();
        revista.mostrarInfo();

        Usuario usuario = new Usuario("Juan Carlos Bodoque", "12345678");

        Prestamo prestamo = new Prestamo(usuario, libro, 7);
        prestamo.mostrarDetalle();

        int diasRetraso = 5;
        double multa = prestamo.calcularMulta(diasRetraso);
        System.out.println(" Dias de retraso: " + diasRetraso + " | Multa: $" + multa);
    }
}

