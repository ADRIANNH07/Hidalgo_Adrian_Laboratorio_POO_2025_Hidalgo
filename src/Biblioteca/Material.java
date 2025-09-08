package Biblioteca;

public abstract class Material {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnioPublicacion() { return añoPublicacion; }
    public void setAnioPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }

    public abstract void mostrarInfo();
}

