/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Messages.Reply;
import Model.Messages.Request;
import Modelo.Entidades.Turno;
import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.util.ArrayList;


 
public class ControlTurno extends Control{
    public Turno[] yaExisteTurno(String codigoTurno) throws MiExcepcion {
        sqlStatement = "SELECT * FROM turno "
                + "WHERE estado_turno = TRUE AND "
                + "id_turno = " + codigoTurno + ";";
        try {Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(4);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
               
            ArrayList<Object[]> turnos = (ArrayList<Object[]>)ok.getPayload();
            Turno[] turno_ = new Turno[turnos.size()];
            for (int i = 0; i < turnos.size(); i++) {
                Object[] row = turnos.get(i);
                Turno turno = new Turno(
                        Integer.parseInt((String)row[0]), 
                        (String)row[1],
                        (String)row[2]
                                               
                );
                turno_[i] = turno;
            }
            return turno_;
                        
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al buscar  existencia de turno :\n" + ex.getMessage());
        }
    }
    public void crearTurno(String[] informacion) throws MiExcepcion {
        
        Turno turno = new Turno(Integer.parseInt(informacion[0]), informacion[1], informacion[2] );
        sqlStatement = "INSERT INTO turno VALUES ('"
                + turno.getId() + "', '"
                + turno.getHoraInicio()+ "', '"
                + turno.getHoraFin() + "', true);"
                ;
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al registrar turno " + turno + ":\n" + ex.getMessage());
        }
    }
}
