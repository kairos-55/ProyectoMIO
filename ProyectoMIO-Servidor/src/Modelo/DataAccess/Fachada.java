/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DataAccess;

import Modelo.Excepciones.MiExcepcion;
import java.sql.*;

/**
 *
 * Fachada
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Fachada {

    /**
     * Class' attributes.
     */
    private final String url;
    private final String user;
    private final String password;
    private Connection conexion;

    /**
     * [Facade Class' constructor.]
     */
    public Fachada() {

// PC MARTHA
      url = "jdbc:postgresql://localhost:5432/basededatos";
      user = "martha";
      password = "martha";


// JESUSARO UNIVALLE.
        /*url = "jdbc:postgresql://pgsql/jesusaro";
         user = "jesusaro";
         password = "jesusaro";*/
        
    }

    /**
     * [connect Metodo encargado de establecer la conexion con la base de
     * datos.]
     *
     * @return Connection [Objeto de tipo conexion.]
     * @throws MyException [Manejo de excepciones.]
     */
    public Connection conectar() throws MiExcepcion {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            return conexion;
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la BD: " + ex.getMessage());
            throw new MiExcepcion("No se pudo conectar a la BD: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            throw new MiExcepcion("No se pudo conectar a la BD: " + ex.getMessage());
        }

    }

    /**
     * [disconnect Metodo encargado de cerrar la conexion con la base de datos.]
     *
     * @param conexion [Objeto de tipo conexion.]
     * @throws SQLException [Excepciones del tipo sql.]
     */
    public void desconectar(Connection conexion) throws SQLException {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("No se pudo desconectar de la BD: " + ex.getMessage());
        }
    }
}
