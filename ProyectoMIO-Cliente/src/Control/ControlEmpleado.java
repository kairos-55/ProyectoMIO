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
    
    public void crearEmpleado(String data[]) throws MiExcepcion {        
        Empleado empleado = new Empleado(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4], data[5], data[6], data[7]);
        
        if(data[5]!=null){
            
        sqlStatement = "INSERT INTO empleado VALUES ('"
                + empleado.getCedula() + "', '"
                + empleado.getSalario() + "', '"
                + empleado.getNombres() + "', '"
                + empleado.getApellidos() + "', '"                
                + empleado.getTelefono() + "', '"
                + empleado.getFechaNacimiento() + "', '"
                + empleado.getEstadoCivil() + "', '"
                + empleado.getCargo() + "', true);";
                
        }else {
            
        sqlStatement = "INSERT INTO empleado VALUES ('"
                + empleado.getCedula() + "', '"
                + empleado.getSalario() + "', '"
                + empleado.getNombres() + "', '"
                + empleado.getApellidos() + "', '"                
                + empleado.getTelefono() + "', "
                + empleado.getFechaNacimiento() + ", '"
                + empleado.getEstadoCivil() + "', '"
                + empleado.getCargo() + "', true);";    
            
        }
        
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al registrar empleado " + empleado + ":\n" + ex.getMessage());
        }
    }
    
    public Empleado buscarEmpleado(String cedula) throws MiExcepcion {
        sqlStatement = "SELECT * FROM empleado WHERE "
                    + "empleado.cedula_empleado = '" + cedula + "';";
        try {// Realizamos la petición.
            Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(9);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            Object[] empleado = ((ArrayList<Object[]>)ok.getPayload()).get(0);
            Empleado empleado_ = new Empleado(
                    (String) empleado[0],
                    Double.parseDouble((String) empleado[1]),
                    (String) empleado[2],
                    (String) empleado[3],
                    (String) empleado[4],
                    (String) empleado[5],
                    (String) empleado[6],
                    (String) empleado[7]
                   );
            return empleado_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al obtener empleado con cedula " + cedula + ":\n" + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            throw new MiExcepcion("El empleado con cedula " + cedula + " no se encuentra registrado.");
        }
    }
    
    public void modificarEmpleado(String data[]) throws MiExcepcion {        
        Empleado empleado = new Empleado(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4], data[5], data[6], data[7]);
        sqlStatement = "UPDATE empleado SET "
                + "salario = " + empleado.getSalario() + ", "
                + "nombres = '" + empleado.getNombres() + "', "
                + "apellidos = '" + empleado.getApellidos() + "', "
                + "telefono = '" + empleado.getTelefono() + "', "
                + "fecha_nacimiento = '" + empleado.getFechaNacimiento() + "', "
                + "estado_civil = '" + empleado.getEstadoCivil() + "', "
                + "cargo = '" + empleado.getCargo() + "' "
                + "WHERE cedula_empleado = '" + empleado.getCedula() + "';";
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al actualizar empleado " + empleado + ":\n" + ex.getMessage());
        }
    }
    
    public void eliminarEmpleado(String data) throws MiExcepcion {        
        
        sqlStatement = "UPDATE empleado SET estado_empleado = false "
                + "WHERE cedula_empleado = '" + data + "';";
        try {
            // Realizamos la petición.
            Request request = new Request();
            request.setType("UPDATE");
            request.setSqlRequest(sqlStatement);
            Reply ok = administradorCliente.peticion(request);
            // Verificamos que el proceso se haya realizado con exito.            
            manejadorErrores.respuesta(ok);
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al eliminar empleado " + data + ":\n" + ex.getMessage());
        }
    }
    
    public Empleado[] listarEmpleados() throws MiExcepcion {
        sqlStatement = "SELECT * FROM empleado WHERE estado_empleado = TRUE;";
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
    
    public int[] dimensionColumnasTabla() throws MiExcepcion {
        sqlStatement = "SELECT "                
                + "MAX(LENGTH(cedula_empleado)), "
                + "MAX(LENGTH(nombres)), "
                + "MAX(LENGTH(apellidos)), "
                + "MAX(LENGTH(telefono)), "
                + "TO_CHAR(fecha_nacimiento,''), "
                + "MAX(LENGTH(estado_civil)), "
                + "MAX(LENGTH(cargo)), "
                + "LENGTH(MAX(salario)::text) "
                + "FROM empleado WHERE estado_empleado = TRUE "
                + "GROUP BY fecha_nacimiento;";
        try {
            
            Request request = new Request();
            request.setType("QUERY");
            request.setSqlRequest(sqlStatement);
            request.setColumns(4);
            Reply ok = administradorCliente.peticion(request);
            manejadorErrores.respuesta(ok);
            
            Object[] dimensiones = ((ArrayList<Object[]>)ok.getPayload()).get(0);
            int[] dimensiones_ = new int[dimensiones.length];
            for (int i = 0; i < dimensiones.length; i++) {
                dimensiones_[i] = Integer.parseInt((String) dimensiones[i]);                 
            }
            return dimensiones_;
        } catch (IOException | ClassNotFoundException ex) {
            throw new MiExcepcion("Error al listar tamaños de columnas:\n" + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            throw new MiExcepcion("No hay registros de empleados en la base de datos.");
        }
    }
    
}
