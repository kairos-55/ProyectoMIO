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
public class Usa {
    
    private int id;
    private String idTarjeta;
    private int paradaRuta;
    private String nombreRuta;
    private String fecha;
        
    public Usa(int id, String idTarjeta, int paradaRuta, String nombreRuta, String fecha) {
        
        this.id = id;
        this.idTarjeta = idTarjeta;
        this.paradaRuta = paradaRuta;
        this.nombreRuta = nombreRuta;
        this.fecha = fecha;
        
    }   

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getIdTarjeta() {
        return idTarjeta;
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }    

}
