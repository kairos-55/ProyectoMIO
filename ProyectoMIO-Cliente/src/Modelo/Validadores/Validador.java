package Modelo.Validadores;

import Modelo.Excepciones.MiExcepcion;

/**
 *
 * Validador
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class Validador {

    /**
     * validarCamposVacios Método encargado de validar que los campos no sean
     * vacios.
     *
     * @param informacion Un arreglo de String que contiene los campos.
     * @throws MiExcepcion Lanza Excepciones de tipo MiExcepcion.
     */
    public void validarCamposVacios(String[] informacion) throws MiExcepcion {
        for (String dato : informacion) {
            validarCampoVacio(dato,"");
        }
    }

    /**
     * validarCampoVacio Método encargado de validar que un campo no este
     * vacío.
     *
     * @param dato Dato.
     * @throws MiExcepcion
     */
    public void validarCampoVacio(String dato, String nombreCampo) throws MiExcepcion {
        
        if ("".equals(dato)) {
            
            throw new MiExcepcion(nombreCampo + " es un campo obligatorio.");
            
        }
        
    }
    

    /**
     * validarDinero Método encargado de validar que una cantidad corresponda a
     * dinero.
     *
     * @param dinero Dinero.
     * @throws MiExcepcion
     */
    public void validarDinero(int dinero) throws MiExcepcion {
        if (dinero % 50 != 0) {
            throw new MiExcepcion("Monto invalido de dinero.");
        }
        if (dinero < 0) {
            throw new MiExcepcion("El monto debe ser positivo.");
        }
    }

    /**
     * validateInteger Metodo encargado de validar que un dato sea entero.
     *
     * @param dato Dato.
     * @throws NumberFormatException
     */
    public void validarInteger(String dato) throws NumberFormatException {
        int integer = Integer.parseInt(dato);
    }
    
    public void validarDouble (String dato) throws NumberFormatException {
        double doubleDato = Double.parseDouble(dato);
    }

    /**
     * validarString Método encargado de validar que un dato sea una cadena.
     *
     * @param dato Cadena.
     * @throws MiExcepcion
     */
    public void validarString(String dato) throws MiExcepcion {
        for (int i = 0; i < dato.length(); i++) {
            if (Character.isDigit(dato.charAt(i))) {
                throw new MiExcepcion("Solo puedes escribir letras.");
            }
        }
    }

    /**
     * validarAlgunosCamposLlenos Validar que por lo menos este un campo lleno.
     *
     * @param informacion
     * @throws MyException
     */
    public void validarAlgunosCamposLlenos(String[] informacion) throws MiExcepcion {
        for (String dato : informacion) {
            if (!"".equals(dato)) {
                return;
            }
        }
        throw new MiExcepcion("Todos los campos están vacíos.");
    }
    
    public void validarLongitudMinima(String nombre, String dato, int longitud) throws MiExcepcion {
        if (dato.length() < longitud) {
            throw new MiExcepcion ("La longitud de " + nombre + " debe ser mayor a " + longitud);
        }
    }
    
    /*
    * validateTelephoneNumber Validar que la longitud del numero telefonico este en un rango 0, 7, 10
    * 
    * @param telephoneNumber
    * @throws MyException
    */
    
    public void validarCadenaNumeros(String cadena)throws MiExcepcion{
        
        boolean validarCadena = cadena.matches("[0-9]*");
        
        if(!validarCadena) {
            throw new MiExcepcion ("El código de la estación debe ser de solo números.");
        }         
                            
    }

}   