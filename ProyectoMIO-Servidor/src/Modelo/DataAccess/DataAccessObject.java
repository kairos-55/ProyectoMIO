package Modelo.DataAccess;

import Modelo.Excepciones.MiExcepcion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * DataAccessObject
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class DataAccessObject {
    /**
     * Class' attributes.
     */
    protected final Fachada fachada;
    protected Connection conexion;
    protected Statement sentencia;
    protected ResultSet resultados;
    /**
     * DataAccessObject Método contructor de la clase.
     */
    public DataAccessObject() {
        fachada = new Fachada();
    }
    /**
     * [executeUpdate Método encargado de ejecutar una sentencia sql de tipo INSERT o UPDATE.]
     * @param sqlstatement [String sentencia sql.]
     * @throws MiExcepcion [Manejo de excepciones.]
     */
    public void actualizacion(String sqlstatement) throws MiExcepcion {
        try {
            conexion = fachada.conectar();
            sentencia = conexion.createStatement();
            int rowsUpdates = sentencia.executeUpdate(sqlstatement);
            fachada.desconectar(conexion);
        } catch (SQLException ex) {
            throw new MiExcepcion(ex.getMessage());
        }
    }
    /**
     * [executeQuery Método encargado de realizar una consulta en la bd.]
     * @param sqlstatement          [String Correspondiente a la sentencia sql.]
     * @param columns
     * @return ArrayList<Object[]>  [Contenedor de los resultados de la consulta.]
     * @throws MiExcepcion          [Manejo de exepciones.]
     */
    public ArrayList<Object[]> consulta(String sqlstatement, int columnas) throws MiExcepcion {
        try {
            ArrayList<Object[]> resultadosObtenidos = new ArrayList<>();
            conexion = fachada.conectar();
            sentencia = conexion.createStatement();
            resultados = sentencia.executeQuery(sqlstatement);
            // Obtenemos los resultados...
            while (resultados.next()) {
                Object[] temp = new Object[columnas];
                for(int i = 0; i < columnas; i++){
                    temp[i] = (String) resultados.getString(i + 1);
                }
                resultadosObtenidos.add(temp);
            }
            fachada.desconectar(conexion);
            return resultadosObtenidos;
        } catch (SQLException ex) {
            throw new MiExcepcion(ex.getMessage());   
        }
    }
}