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
    private int punto_venta;
    private String empleado_vendedor;
        
    public Tarjeta(String id, double saldo, int punto_venta, String empleado_vendedor) {
        
        this.id = id;
        this.saldo = saldo;
        this.punto_venta = punto_venta;
        this.empleado_vendedor = empleado_vendedor;
        
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

    public void setPunto_venta(int punto_venta) {
        this.punto_venta = punto_venta;
    }

    public int getPunto_venta() {
        return punto_venta;
    }

    public void setEmpleado_vendedor(String empleado_vendedor) {
        this.empleado_vendedor = empleado_vendedor;
    }

    public String getEmpleado_vendedor() {
        return empleado_vendedor;
    }      

}
