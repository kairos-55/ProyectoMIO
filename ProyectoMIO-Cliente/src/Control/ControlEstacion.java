package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Excepciones.MiExcepcion;
import Modelo.Entidades.Estacion;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * ControlEstacion
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class ControlEstacion extends Control {
    
    public void crearEstacion(String[] informacion) throws MiExcepcion {
        
        Estacion estacion = new Estacion(Integer.parseInt(informacion[0]), informacion[1], informacion[2], informacion[3]);
        sqlStatement = "INSERT INTO estacion VALUES ('"
                + estacion.getId() + "', '"
                + estacion.getNombre() + "', '"
                + estacion.getDireccion() + "', '"
                + estacion.getCedulaDirector() + "', TRUE);";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al registrar estación " + estacion + ":\n" + ex.getMessage());
        }
    }
    
    public Estacion buscarEstacion(String codigo) throws MiExcepcion {
        sqlStatement = "SELECT * FROM estacion WHERE "
                + "id_estacion = " + codigo + ";";
        try {
            Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(5);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
            Object[] estacion = ((ArrayList<Object[]>) ok.getPayload()).get(0);
            Estacion estacion_ = new Estacion(Integer.parseInt((String) estacion[0]), (String) estacion[1], (String) estacion[2], (String) estacion[3]);
            return estacion_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al obtener la estación con el código " + codigo + ":\n" + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            throw new MiExcepcion("La estación con el código " + codigo + " no se encuentra registrada.");
        }
    }
    
    public void modificarEstacion(String[] informacion) throws MiExcepcion {
        Estacion estacion = new Estacion(Integer.parseInt(informacion[0]), informacion[1], informacion[2], informacion[3]);
        sqlStatement = "UPDATE estacion SET "
                + "nombre_estacion = '" + estacion.getNombre() + "', "
                + "direccion = '" + estacion.getDireccion() + "', "
                + "cedula_empleado = '" + estacion.getCedulaDirector() + "' "
                + "WHERE id_estacion = '" + estacion.getId() + "';";
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al modificar los datos de la estación " + estacion.getNombre().toUpperCase() + ":\n" + ex.getMessage());
        }
    }
    
    public void eliminarEstacion(String codigo) throws MiExcepcion {
        sqlStatement = "UPDATE estacion SET "
                + "estado_estacion = FALSE " 
                + "WHERE id_estacion = '" + codigo + "';";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al momento de eliminar la estación con código " + codigo + ":\n" + ex.getMessage());
        }
    }
    
    public Estacion[] listarEstaciones() throws MiExcepcion {
        sqlStatement = "SELECT * FROM estacion WHERE estado_estacion = TRUE;";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(5);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> estaciones = (ArrayList<Object[]>)ok.getPayload();
            Estacion[] estacion_ = new Estacion[estaciones.size()];
            for (int i = 0; i < estaciones.size(); i++) {
                Object[] row = estaciones.get(i);
                Estacion estacion = new Estacion(
                        Integer.parseInt((String)row[0]), 
                        (String)row[1],
                        (String)row[2],
                        (String)row[3]                        
                );
                estacion_[i] = estacion;
            }
            return estacion_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar las estaciones:\n" + ex.getMessage());
        }
    }
    
}
