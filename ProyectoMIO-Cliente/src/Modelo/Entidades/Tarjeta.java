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
public class Tarjeta {
    
    private String id;
    private double saldo;
    private String estado;
    private String puntoVenta;
        
    public Tarjeta(String id, double saldo, String estado, String puntoVenta) {
        
        this.id = id;
        this.saldo = saldo;
        this.estado = estado;
        this.puntoVenta = puntoVenta;
        
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setPuntoVenta(String puntoVenta) {
        this.puntoVenta = puntoVenta;
    }

    public String getPuntoVenta() {
        return puntoVenta;
    }   

}
