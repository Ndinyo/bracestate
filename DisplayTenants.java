
package bracestate.View;

import bracestate.HousingUnitDB;
import bracestate.NewTenantDB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abi
 */
public class DisplayTenants extends javax.swing.JFrame {

    /**
     * Creates new form DisplayTenants
     */
    public DisplayTenants() {
        initComponents();
    }

    public String getTenantName() {
        return txtFldTenantNameRegister.toString();
    }
    
    public String getGender() {
        return txtFldGender.toString();
    }
    
    public String getAddress() {
        return txtFldAddress.toString();
    }
    
    public String getEmailAddress() {
        return txtFldEmailAddress.toString();
    }
    
    public int getMobileNo() {
        return Integer.parseInt(txtFldMobileNumber.getText());
    }
    
    public int getIDNO() {
        return Integer.parseInt(txtFldIDNO.getText());
    }
    
    public String getDateOfJoining() {
        return dateOfJoining.getDateFormatString().toString();
    }
    
    public double getAmount() {
        return Double.parseDouble(txtFldAmountPaid.getText());
    }
    
    public String getHousingUnit() {
        return txtFldApartment.toString();
    }
    
    public String getHUName() {
        return txtFldHousingUnitName.toString();
    }
    
    public String getRooms() {
        return txtFldRoomCategories.toString();
    }
    
    public String getHouseNumber() {
        return txtFldTenantHouseNumber.toString();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFldTenantNameRegister = new javax.swing.JTextField();
        txtFldGender = new javax.swing.JTextField();
        txtFldAddress = new javax.swing.JTextField();
        txtFldEmailAddress = new javax.swing.JTextField();
        txtFldMobileNumber = new javax.swing.JTextField();
        txtFldIDNO = new javax.swing.JTextField();
        dateOfJoining = new com.toedter.calendar.JDateChooser();
        txtFldPaidDeposit = new javax.swing.JTextField();
        txtFldAmountPaid = new javax.swing.JTextField();
        txtFldApartment = new javax.swing.JTextField();
        txtFldHousingUnitName = new javax.swing.JTextField();
        txtFldRoomCategories = new javax.swing.JTextField();
        txtFldTenantHouseNumber = new javax.swing.JTextField();
        btnIDVerification = new javax.swing.JButton();

        setTitle("ACO HOLDINGS LIMITED - TENANTS");

        jTable1.setBackground(new java.awt.Color(0, 255, 213));
        jTable1.setForeground(new java.awt.Color(0, 0, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnDelete.setBackground(new java.awt.Color(255, 255, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRetrieve.setBackground(new java.awt.Color(255, 255, 0));
        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dateOfJoining.setDateFormatString("yyyy-MMM-d");

        btnIDVerification.setBackground(new java.awt.Color(255, 255, 0));
        btnIDVerification.setText("ID Verification");
        btnIDVerification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIDVerificationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldIDNO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldPaidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldAmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldHousingUnitName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldRoomCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldTenantHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRetrieve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFldTenantNameRegister, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIDVerification, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFldTenantNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtFldGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldIDNO, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldPaidDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldAmountPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldApartment, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldHousingUnitName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldRoomCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldTenantHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIDVerification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String[] options = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete?", "Confirm Delete!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answer == 0) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();

            if (new NewTenantDB().delete(id)) {
                JOptionPane.showMessageDialog(null, "Selected record deleted Successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Record not Deleted!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed

        NewTenantDB nb = new NewTenantDB();

        DefaultTableModel dm = null;
        try {
            dm = nb.getData();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayTenants.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(dm);
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        int exit = JOptionPane.showConfirmDialog(this, "Exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String tname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String gender = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            String address = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String email = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String mno = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            String idno = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            String date = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
            String paid = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
            String amount = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
            String apartment = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
            String huname = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
            String roomcat = jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString();
            String hno = jTable1.getValueAt(jTable1.getSelectedRow(), 13).toString();
            
            txtFldTenantNameRegister.setText(tname);
            txtFldGender.setText(gender);
            txtFldAddress.setText(address);
            txtFldEmailAddress.setText(email);
            txtFldMobileNumber.setText(mno);
            txtFldIDNO.setText(idno);
            dateOfJoining.setDateFormatString(date);
            txtFldPaidDeposit.setText(paid);
            txtFldAmountPaid.setText(amount);
            txtFldApartment.setText(apartment);
            txtFldHousingUnitName.setText(huname);
            txtFldRoomCategories.setText(roomcat);
            txtFldTenantHouseNumber.setText(hno);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error in Selection!!", "Access Denied", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int index = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();

        int answer = JOptionPane.showConfirmDialog(this, "Are You sure you want to Update?", "Confirm Update!", JOptionPane.YES_NO_OPTION);

        if (answer == JOptionPane.YES_OPTION && new NewTenantDB().update(id, txtFldTenantNameRegister.getText(), txtFldGender.getText(), txtFldAddress.getText(), txtFldEmailAddress.getText(), txtFldMobileNumber.getText(), txtFldIDNO.getText(), dateOfJoining.getDate().toString(), txtFldPaidDeposit.getText(), txtFldAmountPaid.getText(), txtFldApartment.getText(), txtFldHousingUnitName.getText(), txtFldRoomCategories.getText(), txtFldTenantHouseNumber.getText())) {
            JOptionPane.showMessageDialog(null, "Record Successfully Updated!");
            //clearInputBoxes();
        } else {
            JOptionPane.showMessageDialog(null, "Record Not Updated!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIDVerificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIDVerificationActionPerformed
        IDDisplay idDisplay = new IDDisplay();
        idDisplay.show();
    }//GEN-LAST:event_btnIDVerificationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayTenants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayTenants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayTenants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayTenants.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayTenants().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIDVerification;
    private javax.swing.JButton btnRetrieve;
    public com.toedter.calendar.JDateChooser dateOfJoining;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField txtFldAddress;
    public javax.swing.JTextField txtFldAmountPaid;
    private javax.swing.JTextField txtFldApartment;
    public javax.swing.JTextField txtFldEmailAddress;
    private javax.swing.JTextField txtFldGender;
    public javax.swing.JTextField txtFldHousingUnitName;
    public javax.swing.JTextField txtFldIDNO;
    public javax.swing.JTextField txtFldMobileNumber;
    private javax.swing.JTextField txtFldPaidDeposit;
    private javax.swing.JTextField txtFldRoomCategories;
    public javax.swing.JTextField txtFldTenantHouseNumber;
    public javax.swing.JTextField txtFldTenantNameRegister;
    // End of variables declaration//GEN-END:variables
}
