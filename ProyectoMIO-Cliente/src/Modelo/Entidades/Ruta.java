package Modelo.Entidades;

/**
 *
 * MainCliente
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Ruta {
    
    private String nombre;
    private int idRecorrido;
        
    public Ruta(String nombre, int idRecorrido) {
        
        this.nombre = nombre;
        this.idRecorrido = idRecorrido;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }   
    
}
