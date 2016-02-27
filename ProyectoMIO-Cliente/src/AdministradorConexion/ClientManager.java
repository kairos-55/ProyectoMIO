package ConnectionManagement;

import Model.Messages.Reply;
import Model.Messages.Request;
import Model.Entities.Employee;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * ClientManager 16/01/2016
 *
 * @author Alvaro Jose Lobaton Restrepo
 */
public class ClientManager {

    private final int PUERTO = 1234;
    private final String HOST = "localhost";
    protected Socket clientSocket;
    protected ObjectOutputStream output;
    private ObjectInputStream input;

    public ClientManager() {        
    }
    
    public void connect() throws IOException {
        clientSocket = new Socket(HOST, PUERTO); 
    }
    
    public void disconnect() throws IOException  {        
        clientSocket.close();        
        output.close();
        input.close();
    }
    
    public void setFlows() throws IOException {
        output = new ObjectOutputStream(clientSocket.getOutputStream());
        output.flush();
        input = new ObjectInputStream(clientSocket.getInputStream());
    }
    
    public void send(Object object) throws IOException {
        output.writeObject(object);
        //output.flush();
    }
    
    public Object receive() throws IOException, ClassNotFoundException {
        return input.readObject();
    }

    public Reply doRequest(Request request) throws IOException, ClassNotFoundException {
        // Nos conectamos.
        connect();
        // Seteamos los flujos de entrada salida.
        setFlows();
        // Informamos que servicio requerimos del servidor.
        send(request); 
        // Recibimos datos o estados del servidor.        
        Reply reply = (Reply) receive();
        // Cerramos la conexión.
        disconnect();
        // Retornamos la respuesta.
        return reply;
    }
}
