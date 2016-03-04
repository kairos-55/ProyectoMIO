package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Entidades.Recorrido;
import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.util.ArrayList;


public class ControlRecorrido extends Control {
    
    public Recorrido[] listarRecorridos() throws MiExcepcion {
        sqlStatement = "SELECT * FROM recorrido WHERE estado_recorrido = TRUE;";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(3);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            ArrayList<Object[]> recorridos = (ArrayList<Object[]>)ok.getPayload();
            Recorrido[] recorrido_ = new Recorrido[recorridos.size()];
            for (int i = 0; i < recorridos.size(); i++) {
                Object[] row = recorridos.get(i);
                Recorrido recorrido = new Recorrido(
                        Integer.parseInt((String)row[0]), 
                        (String)row[1]                                             
                );
                recorrido_[i] = recorrido;
            }
            return recorrido_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar los recorridos:\n" + ex.getMessage());
        }
    }
    
}
