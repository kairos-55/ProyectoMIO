package Modelo.Entidades;

/**
 *
 * Parada_Recorrido
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Parada_Recorrido {
    
    private int idRecorrido;
    private int idParada;
    
    public Parada_Recorrido(int idRecorrido, int idParada){
        
        this.idRecorrido = idRecorrido;
        this.idParada = idParada;        
        
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdParada(int id_parada) {
        this.idParada = id_parada;
    }

    public int getIdParada() {
        return idParada;
    }   
    
}
