package AdministradorConexion;

import Model.Messages.Reply;
import Model.Messages.Request;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * AdministradorCliente
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class AdministradorCliente {

    private final int PUERTO = 1234;
    private final String HOST = "localhost";
    protected Socket clientSocket;
    protected ObjectOutputStream output;
    private ObjectInputStream input;

    public AdministradorCliente() {        
    }
    
    public void conectar() throws IOException {
        clientSocket = new Socket(HOST, PUERTO); 
    }
    
    public void desconectar() throws IOException  {        
        clientSocket.close();        
        output.close();
        input.close();
    }
    
    public void flujos() throws IOException {
        output = new ObjectOutputStream(clientSocket.getOutputStream());
        output.flush();
        input = new ObjectInputStream(clientSocket.getInputStream());
    }
    
    public void enviar(Object object) throws IOException {
        output.writeObject(object);
        //output.flush();
    }
    
    public Object recibir() throws IOException, ClassNotFoundException {
        return input.readObject();
    }

    public Reply peticion(Request request) throws IOException, ClassNotFoundException {
        // Nos conectamos.
        conectar();
        // Seteamos los flujos de entrada salida.
        flujos();
        // Informamos que servicio requerimos del servidor.
        enviar(request); 
        // Recibimos datos o estados del servidor.        
        Reply reply = (Reply) recibir();
        // Cerramos la conexión.
        desconectar();
        // Retornamos la respuesta.
        return reply;
    }
}
