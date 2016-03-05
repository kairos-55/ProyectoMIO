/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Entidades.Tarjeta;
import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControlTarjeta extends Control {
    
    public void crearTarjeta(String[] informacion) throws MiExcepcion {
        
        Tarjeta tarjeta = new Tarjeta(Integer.parseInt((String) informacion[0]), Double.parseDouble(informacion[1]), (String) informacion[2], "", "");
        sqlStatement = "INSERT INTO tarjeta (id_tarjeta, saldo, cedula_empleado, estado_tarjeta) VALUES ("
                + tarjeta.getId() + ", "
                + tarjeta.getSaldo() + ", '"
                + tarjeta.getCedulaEmpleado() + "', 'ACTIVA');";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al vender la tarjeta " + tarjeta + ":\n" + ex.getMessage());
        }
    }
    
    public Tarjeta[] yaExisteVenta(String cedulaEmpleado) throws MiExcepcion {
        sqlStatement = "SELECT * FROM tarjeta "
                + "WHERE estado_tarjeta = 'ACTIVA' AND "
                + "id_tarjeta = " + cedulaEmpleado + ";";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(6);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
               
            ArrayList<Object[]> tarjetas = (ArrayList<Object[]>)ok.getPayload();
            Tarjeta[] tarjeta_ = new Tarjeta[tarjetas.size()];
            for (int i = 0; i < tarjetas.size(); i++) {
                Object[] row = tarjetas.get(i);
                Tarjeta tarjeta = new Tarjeta(
                        Integer.parseInt((String)row[0]), 
                        Double.parseDouble((String)row[1]),
                        (String)row[2],
                        (String)row[3],
                        (String)row[4]                        
                );
                tarjeta_[i] = tarjeta;
            }
            return tarjeta_;
                        
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al buscar venta de tarjeta existente:\n" + ex.getMessage());
        }
    }
    
    public Tarjeta[] listarTarjetaes() throws MiExcepcion {
        sqlStatement = "SELECT * FROM tarjeta WHERE estado_tarjeta = 'ACTIVA';";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(5);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> tarjetaes = (ArrayList<Object[]>)ok.getPayload();
            Tarjeta[] tarjeta_ = new Tarjeta[tarjetaes.size()];
            for (int i = 0; i < tarjetaes.size(); i++) {
                Object[] row = tarjetaes.get(i);
                Tarjeta tarjeta = new Tarjeta(
                        Integer.parseInt((String)row[0]), 
                        (String)row[1],
                        (String)row[2],
                        (String)row[3]                        
                );
                tarjeta_[i] = tarjeta;
            }
            return tarjeta_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar las tarjetaes:\n" + ex.getMessage());
        }
    }
    
    
}
