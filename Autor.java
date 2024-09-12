/**
 * Clase que representa los datos del autor de un libro
 * 
 * @author Yael
 * @version 11/09/2024
 */
public class Autor
{
    private int id;
    private String nombre;
    private String correoElectrónico;

    /**
     * Constructor
     */
    public Autor(int id, String nombre, String correoElectrónico)
    {
       this.id = id;
       this.nombre = nombre;
       this.correoElectrónico = correoElectrónico;
    }
    /**
     * Getters
     */
    public int getId(){
        return this.id;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getCorreoElectrónico(){
        return this.correoElectrónico;

    }
    
}
