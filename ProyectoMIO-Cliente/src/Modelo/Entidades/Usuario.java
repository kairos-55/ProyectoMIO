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
public class Usuario {
    
    private String cedula;
    private String idTarjeta;
    private String nombre;
    private String telefono;
    private String direccion;
        
    public Usuario(String cedula, String idTarjeta, String nombre, String telefono, String direccion) {
        
        this.cedula = cedula;
        this.idTarjeta = idTarjeta;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
           
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }    

}
