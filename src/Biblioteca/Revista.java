package Biblioteca;

public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public void mostrarInfo() {
        System.out.println("Revista: " + getTitulo() +
                " | Autor: " + getAutor() +
                " | Año: " + getAnioPublicacion() +
                " | Edición: " + numeroEdicion);
    }
}
