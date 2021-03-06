
package bracestate.View;

import bracestate.LoginDB;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Abi
 */
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        btnSubmit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtFldLName = new javax.swing.JTextField();
        comboBxRole = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        passwrdFldPassword = new javax.swing.JPasswordField();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFldFName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFldUName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passwrdFldConfirmPass = new javax.swing.JPasswordField();
        btnExitAccountCreation = new javax.swing.JButton();

        setTitle("ACCOUNT CREATION");
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 365));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 0));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setName("btnSubmit"); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("First Name: ");

        txtFldLName.setName("txtFldLName"); // NOI18N

        comboBxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Accountant", "Admin", "Agent", "Caretaker", " " }));
        comboBxRole.setName("cmbbxRole"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Confirm Password: ");

        passwrdFldPassword.setName("passwrdFlduserPass"); // NOI18N

        btnClear.setBackground(new java.awt.Color(255, 255, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("Reset");
        btnClear.setName("btnClear"); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Password: ");

        txtFldFName.setName("txtFldFName"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Last Name: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Username: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Role: ");

        passwrdFldConfirmPass.setName("passwrdFldConfirmPass"); // NOI18N

        btnExitAccountCreation.setBackground(new java.awt.Color(255, 255, 0));
        btnExitAccountCreation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExitAccountCreation.setText("Exit");
        btnExitAccountCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitAccountCreationActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(btnSubmit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtFldLName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(comboBxRole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(passwrdFldPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnClear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtFldFName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtFldUName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(passwrdFldConfirmPass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnExitAccountCreation, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43)
                        .addComponent(txtFldLName))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(txtFldFName))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBxRole, 0, 228, Short.MAX_VALUE)
                            .addComponent(passwrdFldConfirmPass)
                            .addComponent(passwrdFldPassword)
                            .addComponent(txtFldUName)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnExitAccountCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFldFName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldLName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtFldUName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(passwrdFldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(passwrdFldConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboBxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExitAccountCreation)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String getFirstName() {
        return txtFldFName.toString();
    }

    public String getLastName() {
        return txtFldLName.toString();
    }

    public String getUserName() {
        return txtFldUName.toString();
    }

    public String getPassword() {
        return Arrays.toString(passwrdFldPassword.getPassword());
    }

    public String getConfrimPassword() {
        return Arrays.toString(passwrdFldConfirmPass.getPassword());
    }

    public String getRole() {
        return comboBxRole.toString();
    }
    
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        LoginDB fDB = new LoginDB();

        String pass = Arrays.toString(passwrdFldPassword.getPassword());
        String confirmPass = Arrays.toString(passwrdFldConfirmPass.getPassword());

        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        md.update(pass.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format
        StringBuffer hexString = new StringBuffer();

        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        pass = hexString.toString();

        //Confirm Password
        MessageDigest mdd = null;

        try {
            mdd = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        mdd.update(confirmPass.getBytes());

        byte byteDataCon[] = mdd.digest();

        //convert the byte to hex format
        StringBuffer hexStringCon = new StringBuffer();

        for (int i = 0; i < byteDataCon.length; i++) {
            String hexx = Integer.toHexString(0xff & byteDataCon[i]);
            if (hexx.length() == 1) {
                hexStringCon.append('0');
            }
            hexStringCon.append(hexx);
        }
        confirmPass = hexStringCon.toString();

        try {
            if (txtFldFName.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, " First Name should not be blank!!", "Error!", JOptionPane.OK_OPTION);
                txtFldFName.requestFocus();
            } else if (txtFldLName.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, " Last Name should not be blank!", "Error!", JOptionPane.OK_OPTION);
                txtFldLName.requestFocus();
            } else if (txtFldUName.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, " User Name should not be blank!", "Error!", JOptionPane.OK_OPTION);
                txtFldUName.requestFocus();
            } else if (passwrdFldPassword.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, " Password should not be blank!", "Error!", JOptionPane.OK_OPTION);
                passwrdFldPassword.requestFocus();
            } else if (passwrdFldConfirmPass.getPassword().length == 0) {
                JOptionPane.showMessageDialog(null, " Please confirm the Password!", "Error!", JOptionPane.OK_OPTION);
                passwrdFldConfirmPass.requestFocus();
            } else if (!(Arrays.equals(passwrdFldPassword.getPassword(), passwrdFldConfirmPass.getPassword()))) {
                JOptionPane.showMessageDialog(null, " Passwords do not Match!  Please enter new credentials!");
                passwrdFldPassword.setText("");
                passwrdFldConfirmPass.setText("");
                passwrdFldPassword.requestFocus();
            } else if (fDB.addUser(txtFldFName.getText(), txtFldLName.getText(), txtFldUName.getText(), pass, confirmPass, comboBxRole.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(null, " User account created Successfully!");

                resetFields();
                
                int response = JOptionPane.showConfirmDialog(this, "Create a new Account?", "New Account", JOptionPane.YES_NO_OPTION);
                
                if (response == JOptionPane.NO_OPTION){
                    this.dispose();
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Incorrect values!", "Error!", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

     public void resetFields() {
        txtFldUName.setText("");
        txtFldFName.setText("");
        txtFldLName.setText("");
        passwrdFldPassword.setText("");
        passwrdFldConfirmPass.setText("");
        comboBxRole.setSelectedItem("");
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        resetFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitAccountCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitAccountCreationActionPerformed
        
        int exit = JOptionPane.showConfirmDialog(this, "Exit Account Creation?", "Confirm!", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitAccountCreationActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExitAccountCreation;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox comboBxRole;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField passwrdFldConfirmPass;
    private javax.swing.JPasswordField passwrdFldPassword;
    private javax.swing.JTextField txtFldFName;
    private javax.swing.JTextField txtFldLName;
    private javax.swing.JTextField txtFldUName;
    // End of variables declaration//GEN-END:variables
}
