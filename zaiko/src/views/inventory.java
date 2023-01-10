package views;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

import database.*;
/**
 *
 * @author jorge
 */
public class inventory extends javax.swing.JPanel {

    /**
     * Creates new form inventory
     */
    public inventory() {
        initComponents();
        
        try {
            fillCaseTable(casesDB.get());
            fillMicaTable(micaDB.get());
            fillPropTable(propDB.get());
            fillPhoneTable(phoneDB.get());
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        casePanel = new javax.swing.JPanel();
        caseTableScroll = new javax.swing.JScrollPane();
        caseTable = new javax.swing.JTable();
        micaPanel = new javax.swing.JPanel();
        micaTableScroll = new javax.swing.JScrollPane();
        micaTable = new javax.swing.JTable();
        propPanel = new javax.swing.JPanel();
        propScrollTable = new javax.swing.JScrollPane();
        propTable = new javax.swing.JTable();
        phonePanel = new javax.swing.JPanel();
        phoneScrollTable = new javax.swing.JScrollPane();
        phoneTable = new javax.swing.JTable();

        caseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Marca", "Modelo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        caseTableScroll.setViewportView(caseTable);
        if (caseTable.getColumnModel().getColumnCount() > 0) {
            caseTable.getColumnModel().getColumn(0).setMaxWidth(128);
            caseTable.getColumnModel().getColumn(4).setMaxWidth(128);
        }

        javax.swing.GroupLayout casePanelLayout = new javax.swing.GroupLayout(casePanel);
        casePanel.setLayout(casePanelLayout);
        casePanelLayout.setHorizontalGroup(
            casePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(caseTableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        casePanelLayout.setVerticalGroup(
            casePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, casePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caseTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Protectores", casePanel);

        micaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Marca", "Modelo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        micaTableScroll.setViewportView(micaTable);
        if (micaTable.getColumnModel().getColumnCount() > 0) {
            micaTable.getColumnModel().getColumn(0).setMaxWidth(128);
            micaTable.getColumnModel().getColumn(4).setMaxWidth(128);
        }

        javax.swing.GroupLayout micaPanelLayout = new javax.swing.GroupLayout(micaPanel);
        micaPanel.setLayout(micaPanelLayout);
        micaPanelLayout.setHorizontalGroup(
            micaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(micaTableScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        micaPanelLayout.setVerticalGroup(
            micaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, micaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(micaTableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Micas", micaPanel);

        propTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Marca", "Descripcion", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        propScrollTable.setViewportView(propTable);
        if (propTable.getColumnModel().getColumnCount() > 0) {
            propTable.getColumnModel().getColumn(0).setMaxWidth(128);
            propTable.getColumnModel().getColumn(3).setMaxWidth(128);
        }

        javax.swing.GroupLayout propPanelLayout = new javax.swing.GroupLayout(propPanel);
        propPanel.setLayout(propPanelLayout);
        propPanelLayout.setHorizontalGroup(
            propPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(propScrollTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        propPanelLayout.setVerticalGroup(
            propPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, propPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(propScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Accesorios", propPanel);

        phoneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Marca", "Modelo", "Capacidad", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        phoneScrollTable.setViewportView(phoneTable);
        if (phoneTable.getColumnModel().getColumnCount() > 0) {
            phoneTable.getColumnModel().getColumn(0).setMaxWidth(128);
            phoneTable.getColumnModel().getColumn(4).setMaxWidth(128);
        }

        javax.swing.GroupLayout phonePanelLayout = new javax.swing.GroupLayout(phonePanel);
        phonePanel.setLayout(phonePanelLayout);
        phonePanelLayout.setHorizontalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phoneScrollTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        phonePanelLayout.setVerticalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phonePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(phoneScrollTable, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Telefonos", phonePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void fillCaseTable(ResultSet query) throws SQLException{
        String[] data = new String[5];
        
        DefaultTableModel model = (DefaultTableModel) caseTable.getModel();
        model.setRowCount(0);
        while(query.next()){
            data[0] = query.getString("codigo").toUpperCase();
            data[1] = query.getString("tipo");
            data[2] = query.getString("marca");
            data[3] = query.getString("modelo");
            data[4] = query.getString("cantidad");
            model.addRow(data);
        }
        caseTable.setModel(model);
    }
    private void fillMicaTable(ResultSet query) throws SQLException{
        String[] data = new String[5];
        
        DefaultTableModel model = (DefaultTableModel) micaTable.getModel();
        model.setRowCount(0);
        while(query.next()){
            data[0] = query.getString("codigo").toUpperCase();
            data[1] = query.getString("tipo");
            data[2] = query.getString("marca");
            data[3] = query.getString("modelo");
            data[4] = query.getString("cantidad");
            model.addRow(data);
        }
        micaTable.setModel(model);
    }
    private void fillPropTable(ResultSet query) throws SQLException{
        String[] data = new String[4];
        
        DefaultTableModel model = (DefaultTableModel) propTable.getModel();
        model.setRowCount(0);
        while(query.next()){
            data[0] = query.getString("codigo").toUpperCase();
            data[1] = query.getString("marca");
            data[2] = query.getString("descripcion");
            data[3] = query.getString("cantidad");
            model.addRow(data);
        }
        propTable.setModel(model);
    }
    private void fillPhoneTable(ResultSet query) throws SQLException{
        String[] data = new String[5];
        
        DefaultTableModel model = (DefaultTableModel) phoneTable.getModel();
        model.setRowCount(0);
        while(query.next()){
            data[0] = query.getString("codigo").toUpperCase();
            data[1] = query.getString("marca");
            data[2] = query.getString("modelo");
            data[3] = query.getString("capacidad");
            data[4] = query.getString("cantidad");
            model.addRow(data);
        }
        phoneTable.setModel(model);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel casePanel;
    private javax.swing.JTable caseTable;
    private javax.swing.JScrollPane caseTableScroll;
    private javax.swing.JPanel micaPanel;
    private javax.swing.JTable micaTable;
    private javax.swing.JScrollPane micaTableScroll;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JScrollPane phoneScrollTable;
    private javax.swing.JTable phoneTable;
    private javax.swing.JPanel propPanel;
    private javax.swing.JScrollPane propScrollTable;
    private javax.swing.JTable propTable;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
