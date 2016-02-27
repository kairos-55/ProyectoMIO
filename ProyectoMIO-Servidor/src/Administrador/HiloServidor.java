package Administrador;

import Modelo.DataAccess.DataAccessObject;
import Model.Messages.Request;
import Modelo.Excepciones.MiExcepcion;
import Model.Messages.Reply;
import java.io.*;
import java.net.*;

/**
 *
 * HiloServidor
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class HiloServidor extends Thread {

    private Socket socket;
    private ObjectOutputStream output;
    private ObjectInputStream input;

    public HiloServidor(Socket socket) throws MiExcepcion {
        this.socket = socket;
        try {
            output = new ObjectOutputStream(socket.getOutputStream());
            output.flush();
            input = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            System.out.println("Class: HiloServidor. HiloServidor(): " + ex.getMessage());
            throw new MiExcepcion("Error");
        }
    }
    
    public void enviar(Object object) throws IOException {
        output.writeObject(object);
        output.flush();
    }
    
    public Object recibir() throws IOException, ClassNotFoundException {
        return input.readObject();
    }

    public void desconectar() throws IOException  {        
        socket.close();        
        output.close();
        input.close();
    }

    @Override
    public void run() {        
        try {
            // Obtenemos la peticion.
            Request peticion = (Request) recibir();
            DataAccessObject dao = new DataAccessObject ();
            // Gestionamos la peticion.
            switch(peticion.getType()) {
                case "UPDATE":
                    {
                        Reply reply = new Reply();
                        try {
                            reply.setErrorCode(0);
                            reply.setState("Transacción realizada con éxito.");
                            dao.actualizacion(peticion.getSqlRequest());
                            enviar(reply);
                        } catch (MiExcepcion ex) {
                            reply.setErrorCode(1);
                            reply.setState(ex.getMessage());
                            enviar(reply);
                        }
                    }                    
                    break;
                case "QUERY":                    
                    {
                        Reply reply = new Reply();
                        try {                            
                            reply.setErrorCode(0);
                            reply.setState("Transacción realizada con éxito.");
                            reply.setPayload( dao.consulta(peticion.getSqlRequest(), peticion.getColumns()) );
                            enviar(reply); 
                        } catch (MiExcepcion ex) {
                            reply.setErrorCode(1);
                            reply.setState(ex.getMessage());
                            enviar(reply);
                        }
                    }                    
                    break;
            }
            // Cerramos la conexión.
            desconectar();
            System.out.println(">> CERRANDO CONEXIÓN: " + socket + ".");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("CLASS: HiloServidor. run(): " + ex.getMessage());
        } 
    }
}
