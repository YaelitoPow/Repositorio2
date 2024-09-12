/**
 * Clase Main para probar las funcionalidades de las clases Libro y Biblioteca
 *
 * @author Yael
 * @version 04/09/2024
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        //Crear libros
        Libro libro1 = new Libro("El Principito", 
        "Antoine de Saint-Exupéry", 
        1943, 
        "978-0156012195", 
        true);

        Libro libro2 = new Libro("Hábitos atómicos", 
        "James Clear", 
        2018, 
        "978-8550807577", 
        false);

        Libro libro3 = new Libro("El Almanaque de Naval Ravikant", 
        "Eric Jorgenson", 
        1974, 
        "978-6555605518", 
        true);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Mostrar todos los libros en la biblioteca:");
        java.util.ArrayList<Libro> todosLosLibros = biblioteca.obtenerTodosLosLibros();
        for (Libro libro : todosLosLibros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Prestado: " + (libro.getPrestado() ? "Sí" : "No"));
            System.out.println();
        }

        //Buscar un libro por título
        String tituloBuscado = "Hábitos atómicos";
        Libro libroEncontrado = biblioteca.buscarLibroPorTitulo(tituloBuscado);

        //Mostrar libros prestados
        System.out.println("Libros prestados:");
        java.util.ArrayList<Libro> librosPrestados = biblioteca.obtenerLibrosPrestados();
        for (Libro libro : librosPrestados) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Prestado: Sí");
            System.out.println();
        }

        //Mostrar libros no prestados
        System.out.println("Libros no prestados:");
        java.util.ArrayList<Libro> librosNoPrestados = biblioteca.obtenerLibrosNoPrestados();
        for (Libro libro : librosNoPrestados) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Año de Publicación: " + libro.getAñoPublicacion());
            System.out.println("ISBN: " + libro.getIsbn());
            System.out.println("Prestado: No");
            System.out.println();
        }

        //Mostrar la información del libro encontrado por el título
        if (libroEncontrado != null) {
            System.out.println("\nInformación del libro encontrado por su título:");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("Año de Publicación: " + libroEncontrado.getAñoPublicacion());
            System.out.println("ISBN: " + libroEncontrado.getIsbn());
            System.out.println("Prestado: " + (libroEncontrado.getPrestado() ? "Sí" : "No"));
        } else {
            System.out.println("\nNo se encontró un libro con el título: " + tituloBuscado);
        }
    }
}
