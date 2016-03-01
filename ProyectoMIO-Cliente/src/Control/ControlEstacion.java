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
    
}
