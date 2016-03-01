package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Excepciones.MiExcepcion;
import Modelo.Entidades.Empleado;
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

public class ControlEmpleado extends Control {
    
    public Empleado[] listarEmpleados() throws MiExcepcion {
        sqlStatement = "SELECT * FROM empleado;";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(9);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> empleados = (ArrayList<Object[]>)ok.getPayload();
            Empleado[] empleados_ = new Empleado[empleados.size()];
            for (int i = 0; i < empleados.size(); i++) {
                Object[] row = empleados.get(i);
                Empleado empleado = new Empleado(
                        (String)row[0], 
                        Double.parseDouble((String)row[1]),
                        (String)row[2],
                        (String)row[3],
                        (String)row[4],
                        (String)row[5],
                        (String)row[6],
                        (String)row[7]                        
                );
                empleados_[i] = empleado;
            }
            return empleados_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar los empleados:\n" + ex.getMessage());
        }
    }
    
}
