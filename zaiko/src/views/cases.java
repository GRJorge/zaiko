package views;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JSpinner;

import database.articleDB;
import database.casesDB;
/**
 *
 * @author jorge
 */
public class cases extends javax.swing.JPanel {

    
    /**
     * Creates new form cases
     */
    public cases(String code) {
        initComponents();
        
        ((JSpinner.DefaultEditor)lot.getEditor()).getTextField().addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10){
                    save.requestFocusInWindow();
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        
        if(code != null){
            this.code.setText(code);
            this.code.setEditable(false);
            save.setText("Editar");
            title.setText("Editar protector");
            titleLot.setVisible(false);
            lot.setVisible(false);
            saveLot.setVisible(false);
            
            try {
                ResultSet query = casesDB.get(code);
                while(query.next()){
                    switch(query.getString("tipo")){
                        case "Protector" -> type.setSelectedIndex(0);
                        case "Clip" -> type.setSelectedIndex(1);
                        default -> type.setSelectedIndex(2);
                    }
                    
                    brand.setText(query.getString("marca"));
                    model.setText(query.getString("modelo"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(cases.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// TODO add your handling code

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        titleType = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        titleBrand = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        cleanBrand = new javax.swing.JLabel();
        titleModel = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        titleLot = new javax.swing.JLabel();
        lot = new javax.swing.JSpinner();
        saveLot = new javax.swing.JCheckBox();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        titleCode = new javax.swing.JLabel();
        code = new javax.swing.JTextField();

        title.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Agregar protector");

        titleType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleType.setText("Tipo:");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Protector", "Clip", "Otterbox" }));
        type.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typeKeyPressed(evt);
            }
        });

        titleBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleBrand.setText("Marca:");

        brand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                brandKeyPressed(evt);
            }
        });

        cleanBrand.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        cleanBrand.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cleanBrand.setText("x");
        cleanBrand.setToolTipText("Borrar marca");
        cleanBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cleanBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cleanBrandMousePressed(evt);
            }
        });

        titleModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleModel.setText("Modelo:");

        model.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelKeyPressed(evt);
            }
        });

        titleLot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleLot.setText("Cantidad:");

        lot.setToolTipText("");
        lot.setValue(1);

        saveLot.setToolTipText("Mantener cantidad");

        cancel.setText("Volver");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        titleCode.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        titleCode.setText("Codigo:");

        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleCode, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(code))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleLot, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lot))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleModel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(model))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(brand))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(titleType, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saveLot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cleanBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleCode)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleType)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cleanBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleBrand)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleLot))
                    .addComponent(saveLot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(save))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyPressed
        if(evt.getKeyCode() == 10 && !code.getText().isBlank()){
            type.requestFocusInWindow();
        }
    }//GEN-LAST:event_codeKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(validateData()){
            if(code.isEditable()){
                try {
                    articleDB.add(code.getText(), Integer.parseInt(lot.getValue().toString()));
                    casesDB.add(type.getSelectedItem().toString(), brand.getText(), model.getText());
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "El codigo " + code.getText() + " ya fue registrado.", "Codigo ya existente", 1);
                }

                code.setText("");
                model.setText("");
                if(!saveLot.isSelected()){
                    lot.setValue(1);
                }
                code.requestFocusInWindow();            
            }else{
                try {
                    casesDB.update(code.getText(), type.getSelectedItem().toString(), brand.getText(), model.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(cases.class.getName()).log(Level.SEVERE, null, ex);
                }
                menu.changeContent(new inventory(), null);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        menu.changeContent(new inventory(), null);
    }//GEN-LAST:event_cancelActionPerformed

    private void cleanBrandMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanBrandMousePressed
        brand.setText("");
        brand.requestFocusInWindow();
    }//GEN-LAST:event_cleanBrandMousePressed

    private void typeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeKeyPressed
        if(evt.getKeyCode() == 10){
            brand.requestFocusInWindow();
        }
    }//GEN-LAST:event_typeKeyPressed

    private void brandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_brandKeyPressed
        if(evt.getKeyCode() == 10 && !brand.getText().isBlank()){
            model.requestFocusInWindow();
        }
    }//GEN-LAST:event_brandKeyPressed

    private void modelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelKeyPressed
        if(evt.getKeyCode() == 10 && !model.getText().isBlank()){
            if(lot.isVisible()){
                lot.requestFocusInWindow();
            }else{
                save.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_modelKeyPressed

    private boolean validateData(){
        boolean ok;
        
        ok = !(code.getText().isBlank() || brand.getText().isBlank() || model.getText().isBlank());
        
        if(Integer.parseInt(lot.getValue().toString()) < 0){
            ok = false;
        }
        
        return ok;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel cleanBrand;
    public javax.swing.JTextField code;
    private javax.swing.JSpinner lot;
    private javax.swing.JTextField model;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox saveLot;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleBrand;
    private javax.swing.JLabel titleCode;
    private javax.swing.JLabel titleLot;
    private javax.swing.JLabel titleModel;
    private javax.swing.JLabel titleType;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
