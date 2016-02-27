/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tablas;

/**
 *
 * @author jesusaro
 */
public class Pqrs {
    
    private String cedulaEmpleado;
    private String nombreEstacion;
    private String estado;
    private String fecha;
    private String motivo;
    private String cedulaUsuario;
    private String descripcion;
        
    public Pqrs(String cedulaEmpleado, String nombreEstacion, String estado, String fecha, String motivo, String cedulaUsuario, String descripcion) {
        
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEstacion = nombreEstacion;
        this.estado = estado;
        this.fecha = fecha;
        this.motivo = motivo;
        this.cedulaUsuario = cedulaUsuario;
        this.descripcion = descripcion;
                
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }   

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
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

}
