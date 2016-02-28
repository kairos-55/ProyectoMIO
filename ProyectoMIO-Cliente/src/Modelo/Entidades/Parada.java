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
 
    private int idParada;
    private int idEstacion;
    
    public Parada(int idParada, int idEstacion){
        
        this.idParada = idParada;
        this.idEstacion = idEstacion;
        
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public int getIdParada() {
        return idParada;
    }    
    
    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public int getIdEstacion() {
        return idEstacion;
    }   
        
}
