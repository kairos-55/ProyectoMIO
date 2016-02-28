package Modelo.Entidades;

/**
 *
 * Tarjeta_Bus
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Tarjeta_Bus {
    
    private int idTarjeta;
    private String placaBus;
    private String fecha;
    private String hora;    
        
    public Tarjeta_Bus(int idTarjeta, String placaBus, String fecha, String hora) {
        
        this.idTarjeta = idTarjeta;
        this.placaBus = placaBus;
        this.fecha = fecha;
        this.hora = hora;
        
    }   

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setPlacaBus(String placaBus) {
        this.placaBus = placaBus;
    }

    public String getPlacaBus() {
        return placaBus;
    }   
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }    

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }
    
}
