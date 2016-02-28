package Modelo.Entidades;

/**
 *
 * Usuario
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Usuario {
    
    private String cedula;
    private int idTarjeta;
    private String nombre;
    private String telefono;
    private String direccion;
        
    public Usuario(String cedula, int idTarjeta, String nombre, String telefono, String direccion) {
        
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

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdTarjeta() {
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
