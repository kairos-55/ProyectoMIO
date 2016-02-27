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
public class Conduce {
    
    private String cedulaEmpleado;
    private String placaBus;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
        
    public Conduce(String cedulaEmpleado, String placaBus, String fecha, String horaEntrada, String horaSalida) {
        
        this.cedulaEmpleado = cedulaEmpleado;
        this.placaBus = placaBus;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        
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

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }   
    
}
