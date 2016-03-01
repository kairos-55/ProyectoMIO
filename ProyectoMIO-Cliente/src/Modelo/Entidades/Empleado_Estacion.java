package Modelo.Entidades;

/**
 *
 * Empleado_Estacion
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Empleado_Estacion {
    
    private String cedula;
    private int idEstacion;
    private String fecha;
    private int idTurno;
    
    public Empleado_Estacion(String cedula, int idEstacion, String fecha, int idTurno){
        
        this.cedula = cedula;
        this.idEstacion = idEstacion;
        this.fecha = fecha;
        this.idTurno = idTurno;
        
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public int getIdEstacion() {
        return idEstacion;
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
