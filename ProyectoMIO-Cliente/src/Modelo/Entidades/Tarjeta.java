package Modelo.Entidades;

/**
 *
 * Tarjeta
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Tarjeta {
    
    private String id;
    private double saldo;
    private String cedulaEmpleado;
    private String fechaVenta;
    private String horaVenta;
            
    public Tarjeta(String id, double saldo, String cedulaEmpleado, String fechaVenta, String horaVenta) {
        
        this.id = id;
        this.saldo = saldo;
        this.cedulaEmpleado = cedulaEmpleado;
        this.fechaVenta = fechaVenta;
        this.horaVenta = horaVenta;
        
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

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setHoraVenta(String horaVenta) {
        this.horaVenta = horaVenta;
    }

    public String getHoraVenta() {
        return horaVenta;
    }    

}
