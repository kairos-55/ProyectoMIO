package Modelo.Entidades;

/**
 *
 * Turno
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Turno {
    
    private int id;
    private String horaInicio;
    private String horaFin;
    
    public Turno(int id, String horaInicio, String horaFin){
        
        this.id = id;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }   
        
}
