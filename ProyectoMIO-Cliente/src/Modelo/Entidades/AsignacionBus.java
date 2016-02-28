package Modelo.Entidades;

/**
 *
 * AsignacionBus
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class AsignacionBus {
    
    private String cedulaEmpleado;
    private String placaBus;
    private String fecha;
    private int idTurno;
            
    public AsignacionBus(String cedulaEmpleado, String placaBus, String fecha, int idTurno) {
        
        this.cedulaEmpleado = cedulaEmpleado;
        this.placaBus = placaBus;
        this.fecha = fecha;
        this.idTurno = idTurno;
        
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
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
