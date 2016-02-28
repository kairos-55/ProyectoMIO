package Modelo.Entidades;

/**
 *
 * Bus
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Bus {
    
    private String placa;
    private String modelo;
    private String marca;
    private int capacidad;
    private String tipo;     
    
    public Bus(String placa, String modelo, String marca, int capacidad, String tipo) {
        
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipo = tipo;
                        
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
        
}
