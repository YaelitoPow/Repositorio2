import java.util.ArrayList;


/**
 * Clase que representa una biblioteca de libros
 *
 * @author Yael
 * @version 04/09/2024
 */
public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public ArrayList<Libro> obtenerTodosLosLibros() {
        return this.libros;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> obtenerLibrosPrestados() {
        ArrayList<Libro> prestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (libro.getPrestado()) {
                prestados.add(libro);
            }
        }
        return prestados;
    }

    public ArrayList<Libro> obtenerLibrosNoPrestados() {
        ArrayList<Libro> noPrestados = new ArrayList<>();
        for (Libro libro : this.libros) {
            if (!libro.getPrestado()) {
                noPrestados.add(libro);
            }
        }
        return noPrestados;
    }
}
