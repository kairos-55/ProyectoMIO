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
public class Ruta {
    
    private String nombre;
    private String[] lugar;
        
    public Ruta(String nombre, String[] lugar) {
        
        this.nombre = nombre;
        this.lugar = lugar;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setLugar(String[] lugar) {
        this.lugar = lugar;
    }

    public String[] getLugar() {
        return lugar;
    }    
    
}
