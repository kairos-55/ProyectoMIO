package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Entidades.Ruta;
import Modelo.Entidades.Ruta;
import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControlRuta extends Control{
    
    public void crearRuta(String[] informacion) throws MiExcepcion {
        
        Ruta ruta = new Ruta(informacion[0], Integer.parseInt(informacion[1]));
        sqlStatement = "INSERT INTO ruta VALUES ('"
                + ruta.getNombre()+ "', '"
                + ruta.getIdRecorrido() + "', TRUE);";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al registrar ruta " + ruta + ":\n" + ex.getMessage());
        }
    }
    
    public Ruta buscarRuta(String codigo) throws MiExcepcion {
        sqlStatement = "SELECT * FROM ruta WHERE "
                + "nombre_ruta = '" + codigo + "';";
        try {
            Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(3);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
            Object[] ruta = ((ArrayList<Object[]>) ok.getPayload()).get(0);
            Ruta ruta_ = new Ruta((String) ruta[0], Integer.parseInt((String) ruta[1]));
            return ruta_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al obtener la ruta con el código " + codigo + ":\n" + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            throw new MiExcepcion("La ruta con el nombre " + codigo + " no se encuentra registrada.");
        }
    }
    
    public void modificarRuta(String[] informacion) throws MiExcepcion {
        Ruta ruta = new Ruta(informacion[0], Integer.parseInt(informacion[1]));
        sqlStatement = "UPDATE ruta SET "
                + "id_recorrido = '" + ruta.getIdRecorrido() + "' "
                + "WHERE nombre_ruta = '" + ruta.getNombre() + "';";
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al modificar los datos de la ruta " + ruta.getNombre().toUpperCase() + ":\n" + ex.getMessage());
        }
    }
    
    public void eliminarRuta(String codigo) throws MiExcepcion {
        sqlStatement = "UPDATE ruta SET "
                + "estado_ruta = FALSE " 
                + "WHERE nombre_ruta = '" + codigo + "';";
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al momento de eliminar la ruta con el nombre " + codigo + ":\n" + ex.getMessage());
        }
    }
    
    public Ruta[] listarRutas() throws MiExcepcion {
        sqlStatement = "SELECT * FROM ruta WHERE estado_ruta = TRUE;";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(3);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> rutaes = (ArrayList<Object[]>)ok.getPayload();
            Ruta[] ruta_ = new Ruta[rutaes.size()];
            for (int i = 0; i < rutaes.size(); i++) {
                Object[] row = rutaes.get(i);
                Ruta ruta = new Ruta(
                        (String)row[0], 
                        Integer.parseInt((String)row[1])                                                                     
                );
                ruta_[i] = ruta;
            }
            return ruta_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar las rutas:\n" + ex.getMessage());
        }
    }
    
}
