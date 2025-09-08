package Biblioteca;

public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

	@Override
	public void mostrarInfo() {
        System.out.println(" Libro: " + getTitulo() + 
                " | Autor: " + getAutor() + 
                " | Año: " + getAnioPublicacion() + 
                " | Paginas: " + numeroPaginas);
		
	}


}
