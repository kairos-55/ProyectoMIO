package GUI.Reportes.Listados;

import GUI.PaquetePrincipal.AnclarVentanaInterna;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * JIFListados
 * 
 * @author Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 * @author Martha Cecilia Holguin Tovar. Código: 1129455
 * @author Jesús Alberto Ramírez Otálvaro. Código: 1422554
 * 
 */

public class JIFListados extends AnclarVentanaInterna {

    protected String[] aColumns;
    protected Vector aColumnsVector;
    protected boolean disposeOnSelect;
    protected int width;
    protected int height;
    // ATRIBUTOS PRIVADOS DE LA CLASE.
    protected DefaultTableModel dTModel;
    protected JTable jTable;
    protected Container container;
    protected String[] selectedRow; 
    //
    protected int rows_len;
    protected JLabel jLRecords;
    
    public JIFListados(String title, int parent_W, int parent_H, String[] columns, int[] sizes, int rows_len, boolean disposeOnSelect) {
        width = 900;
        height = 500;
        setTitle(title);
        aColumns = columns;
        aColumnsVector = new Vector(Arrays.asList(this.aColumns));
        this.disposeOnSelect = disposeOnSelect;
        this.rows_len = rows_len;
        
        setResizable(false);
        setClosable(true);
        setMaximizable(false);
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initializeComponents();
        accommodateComponents();
        setSizeColumn(sizes);
        
        setSize(this.width, this.height);
        setLocation((int) (Math.abs(parent_W - this.getSize().width) / 2), (int) (Math.abs(parent_H - this.getSize().height) / 2));
        
        setLocked(true);
    }

    /**
     * initializeComponents.
     */
    protected final void initializeComponents() {
        dTModel = new DefaultTableModel(aColumnsVector, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable = new JTable(dTModel);
        jTable.getTableHeader().setReorderingAllowed(false); // Impide que las columnas puedan ser intercambiadas de sitio.
        jTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable.doLayout();          
        jTable.setDragEnabled(false);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTable.addMouseListener(new EventManager(this));
        selectedRow = new String[this.aColumns.length];
        jLRecords = new JLabel("Numero de registros: " + rows_len);
    }
    
    protected final void setSizeColumn(int[] sizes) {        
        int width_ = 0;
        
        for (int i = 0; i < sizes.length; i++) { 
            int columnSize = Math.max(sizes[i] * 10, aColumns[i].length() * 10);
            jTable.getColumnModel().getColumn(i).setPreferredWidth(columnSize);
            width_ += columnSize;
        }
        if(width_ < 900) {
            width = width_;
        }
        //setSize(width, height);
    }

    /**
     * accommodateComponents.
     */
    protected final void accommodateComponents() {
        // CONTAINER.
        container = this.getContentPane();
        container.setLayout(new BorderLayout());
        
        container.add(jLRecords, "Last");        
        
        JScrollPane jSPPanel = new JScrollPane();
        jSPPanel.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jSPPanel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jSPPanel.setViewportView(jTable);
        container.add(jSPPanel, "Center");
    }   

    /**
     * getSelectedRow Metodo encargado de objener los datos de la fila
     * seleccionada.
     *
     * @return
     */
    public String[] getSelectedRow() {
        return selectedRow;
    }
        
    /**
     * EventManager
     */
    protected class EventManager implements MouseListener {

        /**
         * Atributos privados de la clase.
         */
        JInternalFrame parentComponent;

        /**
         * EventManager Metodo constructor de la clase.
         *
         * @param parentComponent Componente padre.
         */
        EventManager(JInternalFrame parentComponent) {
            this.parentComponent = parentComponent;
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (disposeOnSelect) {
                if (e.getClickCount() == 2) {
                    int row = jTable.getSelectedRow();
                    for (int i = 0; i < aColumns.length; i++) {
                        //selectedRow[i] = (String) dTModel.getValueAt(row, i);
                        selectedRow[i] = String.valueOf(dTModel.getValueAt(row, i));
                    }
                    parentComponent.dispose();
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}
