
/**
 * Clase que representa a un Libro
 *
 * @author Yael
 * @version 04/09/2024
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;
    private boolean prestado;

    /**
     * Constructor para los objetos de la clase Libro
     **/
    public Libro(String titulo, String autor, int añoPublicacion, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.prestado = prestado;
    }

    // Getters
    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public boolean getPrestado() {
        return this.prestado;
    }
}
