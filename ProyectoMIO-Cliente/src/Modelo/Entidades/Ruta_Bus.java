package Modelo.Entidades;

/**
 *
 * Ruta_Bus
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Ruta_Bus {
    
    private String nombreRuta;
    private String placaBus;
    private String fecha;
    private int idTurno;    
    
    public Ruta_Bus(String nombreRuta, String placaBus, String fecha, int idTurno){
        
        this.nombreRuta = nombreRuta;
        this.placaBus = placaBus;
        this.fecha = fecha;
        this.idTurno = idTurno;
        
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
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

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public int getIdTurno() {
        return idTurno;
    }
        
}
