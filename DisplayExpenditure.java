package bracestate.View;

import bracestate.DisplayReports;
import bracestate.ExpenditureDB;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abi
 */
public class DisplayExpenditure extends javax.swing.JFrame {

    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    public DisplayExpenditure() {
        initComponents();

        String text = "0.00";

        String exp = "0.00";
        double e = Double.parseDouble(exp);
        txtFldGrandTotalExpenditure.setText(exp);
        jTable1.setAutoCreateRowSorter(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnGrandTotalExpenditure = new javax.swing.JButton();
        txtFldGrandTotalExpenditure = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnExitDelivery = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboBxYear = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comboBxMonth = new javax.swing.JComboBox<>();

        setTitle("ACO HOLDINGS LIMITED - EXPENDITURE OVERVIEW");
        setResizable(false);

        btnDelete.setBackground(new java.awt.Color(255, 255, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRetrieve.setBackground(new java.awt.Color(255, 255, 0));
        btnRetrieve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        btnGrandTotalExpenditure.setBackground(new java.awt.Color(255, 255, 0));
        btnGrandTotalExpenditure.setText("GrandTotal Expenditure");
        btnGrandTotalExpenditure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalExpenditureActionPerformed(evt);
            }
        });

        txtFldGrandTotalExpenditure.setBackground(new java.awt.Color(0, 255, 204));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Specify the Filter Options");

        btnExitDelivery.setBackground(new java.awt.Color(255, 255, 0));
        btnExitDelivery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExitDelivery.setText("Exit");
        btnExitDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitDeliveryActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter By Year"));

        comboBxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "None" }));
        comboBxYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBxYearItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter By Month"));

        comboBxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        comboBxMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBxMonthItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExitDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(btnGrandTotalExpenditure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFldGrandTotalExpenditure, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrandTotalExpenditure, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldGrandTotalExpenditure, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExitDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
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

            if (new ExpenditureDB().deleteExpenditure(id)) {
                JOptionPane.showMessageDialog(null, "Selected record deleted Successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Record not Deleted!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitDeliveryActionPerformed

        int exit = JOptionPane.showConfirmDialog(this, "Exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitDeliveryActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed

        ExpenditureDB fb = new ExpenditureDB();

        DefaultTableModel dm = fb.getExpenditureData();
        jTable1.setModel(dm);
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        Expenditures exp = new Expenditures();

        try {
            String id = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            String description = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
            String totalExp = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
            String year = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
            String month = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
            String date = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
            String gexp = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();

            exp.txtFldDescription.setText(description);

            exp.txtFldAmountExpenses.setText(totalExp);

            exp.date.setDateFormatString(date);

            exp.txtFldGrandTotalExpenditure.setText(gexp);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Error in Selection!!", "Access Denied", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    public int getTotalExpenditureSum() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {
            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 5).toString());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;
    }

    private void btnGrandTotalExpenditureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalExpenditureActionPerformed

        getTotalExpenditureSum();
        txtFldGrandTotalExpenditure.setText(Integer.toString(getTotalExpenditureSum()));
    }//GEN-LAST:event_btnGrandTotalExpenditureActionPerformed

    private void comboBxYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBxYearItemStateChanged
        String selected = comboBxYear.getSelectedItem().toString();

        //filterData(selected);
        RowFilter<DefaultTableModel, Object> rf = null;

        try {
            rf = RowFilter.regexFilter(selected, jTable1.getColumnModel().getColumnIndex("Year"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        ((TableRowSorter) jTable1.getRowSorter()).setRowFilter(rf);
    }//GEN-LAST:event_comboBxYearItemStateChanged

    private void comboBxMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBxMonthItemStateChanged

        String selected = comboBxMonth.getSelectedItem().toString();

        RowFilter<DefaultTableModel, Object> rf = null;

        try {
            rf = RowFilter.regexFilter(selected, jTable1.getColumnModel().getColumnIndex("Month"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        ((TableRowSorter) jTable1.getRowSorter()).setRowFilter(rf);
    }//GEN-LAST:event_comboBxMonthItemStateChanged

    public DefaultTableModel searchSpecifics() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Exp_id");
        dm.addColumn("Description");
        dm.addColumn("Expenditure amount");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Grand Total Expenditure");

        //Select
        String sql = "SELECT * FROM expenditures";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                //String tname = rt.getString(2);
                String description = rt.getString(2);
                //String rent = rt.getString(4);
                String expAmount = rt.getString(3);
                //String income = rt.getString(6);
                String year = rt.getString(4);
                String month = rt.getString(5);
                String date = rt.getString(6);
                //String grent = rt.getString(10);
                String gexpe = rt.getString(7);
                //String gincome = rt.getString(12);

                dm.addRow(new String[]{id, description, expAmount, year, month, date, gexpe,});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

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
            java.util.logging.Logger.getLogger(DisplayExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayExpenditure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayExpenditure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExitDelivery;
    private javax.swing.JButton btnGrandTotalExpenditure;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JComboBox<String> comboBxMonth;
    private javax.swing.JComboBox<String> comboBxYear;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFldGrandTotalExpenditure;
    // End of variables declaration//GEN-END:variables
}
