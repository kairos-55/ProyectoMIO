package Administrador;

import Modelo.Excepciones.MiExcepcion;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * Administrador
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Administrador  
{   
    private final int PORT = 1234; // Puerto para la conexión
    protected ServerSocket serverSocket; // Socket del servidor
    
    public Administrador() throws IOException{
        serverSocket = new ServerSocket(PORT); 
    }

    public void iniciarServidor()
    {
        
        while (true) {
            try
            {
                System.out.println(">> ESTADO: Esperando por un cliente..."); // Esperando conexión                
                Socket clientSocket = serverSocket.accept(); 
                System.out.println(">> CONEXIÓN ENTRANTE: " + clientSocket + ".");
                // Lanzamos el hilo que atendera la peticion del cliente.
                ((HiloServidor) new HiloServidor(clientSocket)).start();
            }
            catch (IOException | MiExcepcion e)
            {
                System.out.println("CLASS: Administrador. iniciarServidor(): " + e.getMessage());
            }
        }
    }
}
    
