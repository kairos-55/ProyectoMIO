package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Entidades.Bus;
import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * ControlBus
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class ControlBus extends Control {
    
    public void crearBus(String[] informacion) throws MiExcepcion {
                
        Bus bus = new Bus(informacion[0], informacion[1], informacion[2], Integer.parseInt(informacion[3]), informacion[4]);
        sqlStatement = "INSERT INTO bus VALUES ('"
                + bus.getPlaca() + "', '"
                + bus.getModelo() + "', '"
                + bus.getMarca() + "', '"
                + bus.getCapacidad() + "', '"
                + bus.getTipo() + "', TRUE);";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con éxito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al registrar el bus " + bus + ":\n" + ex.getMessage());
        }
    }
    
    
    public Bus buscarBus(String placa) throws MiExcepcion {
        sqlStatement = "SELECT * FROM bus WHERE "
                + "placa_bus = '" + placa + "';";
        try {
            Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(6);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
            Object[] bus = ((ArrayList<Object[]>) ok.getPayload()).get(0);
            Bus bus_ = new Bus((String) bus[0], (String) bus[1], (String) bus[2], Integer.parseInt((String) bus[3]), (String) bus[4]);
            return bus_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al obtener el bus con la placa N° " + placa + ":\n" + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            throw new MiExcepcion("El bus con la placa N° " + placa + " no se encuentra registrado.");
        }
    }
    
    public void modificarBus(String[] informacion) throws MiExcepcion {
        Bus bus = new Bus((String) informacion[0], (String) informacion[1], (String) informacion[2], Integer.parseInt((String) informacion[3]), (String) informacion[4]);
        sqlStatement = "UPDATE bus SET "
                + "modelo = '" + bus.getModelo() + "', "
                + "marca = '" + bus.getMarca() + "', "
                + "capacidad = " + bus.getCapacidad() + ", "
                + "tipo = '" + bus.getTipo() + "' "
                + "WHERE placa_bus = '" + bus.getPlaca() + "';";
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al modificar los datos del bus con la placa N° " + bus.getPlaca() + ":\n" + ex.getMessage());
        }
    }
    
    public void eliminarBus(String placa) throws MiExcepcion {
        sqlStatement = "UPDATE bus SET "
                + "estado_bus = FALSE " 
                + "WHERE placa_bus = '" + placa + "';";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al momento de eliminar el bus con la placa N° " + placa + ":\n" + ex.getMessage());
        }
    }
    
    public Bus[] listarBuses() throws MiExcepcion {
        sqlStatement = "SELECT * FROM bus WHERE estado_bus = TRUE;";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(6);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> buses = (ArrayList<Object[]>)ok.getPayload();
            Bus[] bus_ = new Bus[buses.size()];
            for (int i = 0; i < buses.size(); i++) {
                Object[] row = buses.get(i);
                Bus bus = new Bus(
                        (String)row[0], 
                        (String)row[1],
                        (String)row[2],
                        Integer.parseInt((String)row[3]),
                        (String)row[4]
                );
                bus_[i] = bus;
            }
            return bus_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar los buses:\n" + ex.getMessage());
        }
    }
    
}
