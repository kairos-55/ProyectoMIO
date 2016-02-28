package Modelo.Entidades;

/**
 *
 * Estacion
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Estacion {
    
    private int id;
    private String nombre;
    private String direccion;
    private String cedulaDirector;
           
    public Estacion(int id, String nombre, String direccion, String cedulaDirector) {
     
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedulaDirector = cedulaDirector;
                        
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
      
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCedulaDirector(String cedulaDirector) {
        this.cedulaDirector = cedulaDirector;
    }

    public String getCedulaDirector() {
        return cedulaDirector;
    }   

}
