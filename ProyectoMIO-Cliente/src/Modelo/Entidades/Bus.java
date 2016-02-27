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
public class Bus {
    
    private String placa;
    private String modelo;
    private String marca;
    private int capacidad;
    private String tipo;
    private int paradaRuta;
    private String nombreRuta;    
    
    public Bus(String placa, String modelo, String marca, int capacidad, String tipo, int paradaRuta, String nombreRuta) {
        
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.paradaRuta = paradaRuta;
        this.nombreRuta = nombreRuta;
                
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
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
