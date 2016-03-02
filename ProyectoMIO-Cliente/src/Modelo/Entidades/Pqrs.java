package Modelo.Entidades;

/**
 *
 * Pqrs
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Pqrs {
    
    private int idEstacion;    
    private String fecha;
    private String motivo;
    private String cedulaUsuario;
    private String descripcion;
    private String estado;
        
    public Pqrs(int idEstacion, String fecha, String motivo, String cedulaUsuario, String descripcion, String estado) {
        
        this.idEstacion = idEstacion;        
        this.fecha = fecha;
        this.motivo = motivo;
        this.cedulaUsuario = cedulaUsuario;
        this.descripcion = descripcion;
        this.estado = estado;
                
    }

    public void setidEstacion(int nombreEstacion) {
        this.idEstacion = nombreEstacion;
    }   

    public int getidEstacion() {
        return idEstacion;
    }    

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }  
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

}
