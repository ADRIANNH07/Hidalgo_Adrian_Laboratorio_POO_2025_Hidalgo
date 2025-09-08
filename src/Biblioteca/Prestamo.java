package Biblioteca;

public class Prestamo {
    private Usuario usuario;
    private Material material;
    private int diasPrestamo;

    public Prestamo(Usuario usuario, Material material, int diasPrestamo) {
        this.usuario = usuario;
        this.material = material;
        this.diasPrestamo = diasPrestamo;
    }

    public double calcularMulta(int diasRetraso) {
        if (diasRetraso > 0) {
            return diasRetraso * 10.0;
        }
        return 0.0;
    }

    public void mostrarDetalle() {
        System.out.println("Prestamo:");
        System.out.println("Usuario: " + usuario.getNombre() + " | DNI: " + usuario.getDni());
        material.mostrarInfo();
        System.out.println("Dias de prestamo: " + diasPrestamo);
    }
}

