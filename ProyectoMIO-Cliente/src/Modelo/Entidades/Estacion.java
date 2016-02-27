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
public class Estacion {
    
    private String nombre;
    private String direccion;
    private String cedulaDirector;
    private int paradaRuta;
    private String nombreRuta;
        
    public Estacion(String nombre, String direccion, String cedulaDirector, int paradaRuta, String nombreRuta) {
     
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedulaDirector = cedulaDirector;
        this.paradaRuta = paradaRuta;
        this.nombreRuta = nombreRuta;
                
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setCedulaDirector(String cedulaDirector) {
        this.cedulaDirector = cedulaDirector;
    }

    public String getCedulaDirector() {
        return cedulaDirector;
    }

    public void setParadaRuta(int paradaRuta) {
        this.paradaRuta = paradaRuta;
    }

    public int getParadaRuta() {
        return paradaRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }   

}
