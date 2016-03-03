package GUI.Reportes.Listados;

import Modelo.Entidades.Estacion;
import GUI.Reportes.Listados.JIFListados;

/**
 *
 * JIFListaEstaciones
 16/01/2016
 * @author Alvaro Jose Lobaton Restrepo
 */
public class JIFListaEstaciones extends JIFListados{
    /**
     * Metodo contructor de la clase.
     *
     * @param title
     * @param parent_W
     * @param parent_H
     * @param columns
     * @param rows
     * @param dimensiones
     * @param disposeOnSelect
     */
    public JIFListaEstaciones(String title, int parent_W, int parent_H, String[] columns, Estacion[] rows, int[] dimensiones, boolean disposeOnSelect) {
        super(title, parent_W, parent_H, columns, dimensiones, rows.length, disposeOnSelect);
        addRows(rows);        
    }
    
    private void addRows(Estacion[] estaciones) {
        // MEDIDAS PREVENTIVAS:
        // Se debe limpiar la tabla previamente...
        int rowCount = dTModel.getRowCount();
        //System.out.println(rowCount);
        for (int i = (rowCount - 1); i > -1; i--) {
            dTModel.removeRow(i);
        }
        // AÑADIMOS LAS FILAS:
        for (Estacion estacion : estaciones) {
            Object[] row = {
                estacion.getId(),
                estacion.getNombre(),
                estacion.getDireccion(),
                estacion.getCedulaDirector()                  
            };
            dTModel.addRow(row);
        }
    }
}
