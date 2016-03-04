/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Reportes.Listados;

import Modelo.Entidades.Empleado;

/**
 *
 * @author Usuario
 */
public class JIFListaEmpleados extends JIFListados {
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
    public JIFListaEmpleados(String title, int parent_W, int parent_H, String[] columns, Empleado[] rows, int[] dimensiones, boolean disposeOnSelect) {
        super(title, parent_W, parent_H, columns, dimensiones, rows.length, disposeOnSelect);
        addRows(rows);        
    }
    
    private void addRows(Empleado[] empleados) {
        // MEDIDAS PREVENTIVAS:
        // Se debe limpiar la tabla previamente...
        int rowCount = dTModel.getRowCount();
        //System.out.println(rowCount);
        for (int i = (rowCount - 1); i > -1; i--) {
            dTModel.removeRow(i);
        }
        // AÑADIMOS LAS FILAS:
        for (Empleado empleado : empleados) {
            Object[] row = {
                empleado.getCedula(),
                empleado.getNombres(),
                empleado.getApellidos(),
                empleado.getTelefono(),
                empleado.getFechaNacimiento(),
                empleado.getEstadoCivil(),
                empleado.getCargo(),
                empleado.getSalario()
            };
            dTModel.addRow(row);
        }
    }
}
