package Modelo.Entidades;

/**
 *
 * Parada
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Parada {
 
    private int idRecorrido;
    private int idEstacion;
    
    public Parada(int idRecorrido, int idEstacion){
        
        this.idRecorrido = idRecorrido;
        this.idEstacion = idEstacion;
        
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }    
    
    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public int getIdEstacion() {
        return idEstacion;
    }   
        
}
