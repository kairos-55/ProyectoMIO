package Modelo.Entidades;

/**
 *
 * Recorrido
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Recorrido {
    
    private int id; 
    private String nombre;
    
    public Recorrido(int id, String nombre){
        
        this.id = id;
        this.nombre = nombre;
        
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
    
}
