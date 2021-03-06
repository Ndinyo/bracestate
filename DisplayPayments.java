package bracestate.View;

import bracestate.AccountsDB;
import bracestate.DisplayReports;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * /**
 *
 * @author Abi
 */
public class DisplayPayments extends javax.swing.JFrame {

    /**
     * Creates new form DisplayPayments
     */
    public DisplayPayments() {
        initComponents();

        String grandrent = "0.00";
        double grent = Double.parseDouble(grandrent);
        txtFldGrandTotalRentUsed.setText(grandrent);

        String grandexpe = "0.00";
        double gexpe = Double.parseDouble(grandexpe);
        txtFldGrandTotalExpenditure.setText(grandexpe);

        String grandincome = "0.00";
        double gincome = Double.parseDouble(grandincome);
        txtFldGrandTotalIncome.setText(grandincome);

        jTable1.setAutoCreateRowSorter(true);

    }

    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    DefaultTableModel dm = new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrintDelivery = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExitDelivery = new javax.swing.JButton();
        btnRetrieve = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGrandTotalRentExpected = new javax.swing.JButton();
        btnGrandTotalRentPaid = new javax.swing.JButton();
        btnGrandTotalBalance = new javax.swing.JButton();
        txtFldGrandTotalIncome = new javax.swing.JTextField();
        txtFldGrandTotalExpenditure = new javax.swing.JTextField();
        txtFldGrandTotalRentUsed = new javax.swing.JTextField();
        comboBoxYear = new javax.swing.JComboBox<>();
        comboBoxMonth = new javax.swing.JComboBox<>();
        txtFldApartmentName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSearchValues = new javax.swing.JButton();
        btnClearTable = new javax.swing.JButton();

        setTitle("ONGATA RONGAI FLATS - MONTHLY PAYMENTS");
        setResizable(false);

        btnPrintDelivery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPrintDelivery.setText("Print");
        btnPrintDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintDeliveryActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExitDelivery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExitDelivery.setText("Exit");
        btnExitDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitDeliveryActionPerformed(evt);
            }
        });

        btnRetrieve.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRetrieve.setText("Retrieve");
        btnRetrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrieveActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(0, 255, 213));
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

        jLabel1.setText("Filter by Year:");

        jLabel2.setText("Filter by Month:");

        btnGrandTotalRentExpected.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalRentExpected.setText("Grand Total Rent Expected");
        btnGrandTotalRentExpected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalRentExpectedActionPerformed(evt);
            }
        });

        btnGrandTotalRentPaid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalRentPaid.setText("Grand Total Rent Paid");
        btnGrandTotalRentPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalRentPaidActionPerformed(evt);
            }
        });

        btnGrandTotalBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalBalance.setText("Grand Total Balance");
        btnGrandTotalBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalBalanceActionPerformed(evt);
            }
        });

        txtFldGrandTotalIncome.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFldGrandTotalExpenditure.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalExpenditure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFldGrandTotalRentUsed.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalRentUsed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "None" }));
        comboBoxYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxYearItemStateChanged(evt);
            }
        });

        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        comboBoxMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMonthItemStateChanged(evt);
            }
        });

        jLabel4.setText("Apartment name");

        btnSearchValues.setText("Search");
        btnSearchValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchValuesActionPerformed(evt);
            }
        });

        btnClearTable.setText("Clear Table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrintDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(btnExitDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGrandTotalRentExpected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFldGrandTotalRentUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFldGrandTotalExpenditure)
                            .addComponent(btnGrandTotalRentPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGrandTotalBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFldGrandTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(251, 251, 251))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRetrieve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1089, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSearchValues)
                                        .addGap(76, 76, 76)
                                        .addComponent(btnClearTable))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(265, 265, 265)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFldApartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetrieve)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldApartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchValues)
                    .addComponent(btnClearTable))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnPrintDelivery)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDelete)
                                .addComponent(btnExitDelivery))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnGrandTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnGrandTotalRentPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGrandTotalRentExpected, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFldGrandTotalRentUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFldGrandTotalIncome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFldGrandTotalExpenditure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnPrintDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintDeliveryActionPerformed
//
//        DisplayReports displayReports = new DisplayReports();
//
//        try {
//            displayReports.showPayments();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(DisplayPayments.class.getName()).log(Level.SEVERE, null, ex);
//        }
        MessageFormat header = new MessageFormat("Print");
        MessageFormat footer = new MessageFormat("page(0,number,integer)");

        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnPrintDeliveryActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String[] options = {"Yes", "No"};
        int answer = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete?", "Confirm Delete!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (answer == 0) {
            int index = jTable1.getSelectedRow();
            String id = jTable1.getValueAt(index, 0).toString();

            if (new AccountsDB().deletePay(id)) {
                JOptionPane.showMessageDialog(null, "Selected record deleted Successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Record not Deleted!");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitDeliveryActionPerformed

        int exit = JOptionPane.showConfirmDialog(this, "Exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);

        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitDeliveryActionPerformed

    private void btnRetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrieveActionPerformed

//        //AccountsDB fb = new AccountsDB();
//        DisplayPayment dPay = new DisplayPayment();
//
//        dm = dPay.getPayData();
//        jTable1.setModel(dm);
    }//GEN-LAST:event_btnRetrieveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    public DefaultTableModel getPayData() {
        //Add columns to TableModel
        //DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Acc_id");
        dm.addColumn("Housing Unit");
        dm.addColumn("Unit Name");
        dm.addColumn("House No");
        dm.addColumn("Rent");
        dm.addColumn("T Name");
        dm.addColumn("Description");
        dm.addColumn("Transaction ");
        dm.addColumn("Water charges");
        dm.addColumn("Garbage charges");
        dm.addColumn("Arrears");
        dm.addColumn("Other charges");
        dm.addColumn("Expected amount");
        dm.addColumn("Amount paid");
        dm.addColumn("Balance");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        

        //Select
        String sql = "SELECT * FROM accounts";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String hunit = rt.getString(2);
                String hname = rt.getString(3);
                String hno = rt.getString(4);
                String rent = rt.getString(5);
                String tname = rt.getString(6);
                String payment = rt.getString(7);
                String tno = rt.getString(8);
                String water = rt.getString(9);
                String garbage = rt.getString(10);
                String arrears = rt.getString(11);
                String other = rt.getString(12);
                String expected = rt.getString(13);
                String paid = rt.getString(14);
                String balance = rt.getString(19);
                String year = rt.getString(16);
                String month = rt.getString(17);
                String date = rt.getString(18);

                dm.addRow(new String[]{id, hunit, hname, hno, rent, tname, payment, tno, water, garbage, arrears, other, expected, paid, balance, year, month, date});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int getGrandTotalBalance() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {
            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 14).toString());
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;
    }

    public int getGrandTotalRentPaid() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {
            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 13).toString());
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;
    }

    public void calculateExpected() {
        DefaultTableModel dc = (DefaultTableModel) jTable1.getModel();

        double result = 0;
        int i = 0;

        for (i = 0; i < dc.getRowCount(); i++) {
            result = result + Double.parseDouble(dc.getValueAt(i, 12).toString());
        }
        ((DefaultTableModel) jTable1.getModel()).addRow(new Object[]{result});
    }

    public void calculateRentPaid() {
        DefaultTableModel dc = (DefaultTableModel) jTable1.getModel();

        double result = 0;
        int i = 0;

        for (i = 0; i < dc.getRowCount(); i++) {
            result = result + Double.parseDouble(dc.getValueAt(i, 13).toString());
        }
        ((DefaultTableModel) jTable1.getModel()).addRow(new Object[]{result});
    }

    public void calculateBalance() {
        DefaultTableModel dc = (DefaultTableModel) jTable1.getModel();

        double result = 0;
        int i = 0;

        for (i = 0; i < dc.getRowCount(); i++) {
            result = result + Double.parseDouble(dc.getValueAt(i, 14).toString());
        }
        ((DefaultTableModel) jTable1.getModel()).addRow(new Object[]{result});
    }

    public int getGrandTotalRentExpected() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {
            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 12).toString());
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;
    }

    private void btnGrandTotalRentExpectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalRentExpectedActionPerformed

        getGrandTotalRentExpected();
        txtFldGrandTotalRentUsed.setText(Integer.toString(getGrandTotalRentExpected()));
        //calculateExpected();
    }//GEN-LAST:event_btnGrandTotalRentExpectedActionPerformed

    private void btnGrandTotalRentPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalRentPaidActionPerformed
        getGrandTotalRentPaid();
        txtFldGrandTotalExpenditure.setText(Integer.toString(getGrandTotalRentPaid()));
        //calculateRentPaid();
    }//GEN-LAST:event_btnGrandTotalRentPaidActionPerformed

    private void btnGrandTotalBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalBalanceActionPerformed
        getGrandTotalBalance();
        txtFldGrandTotalIncome.setText(Integer.toString(getGrandTotalBalance()));
        //calculateBalance();
    }//GEN-LAST:event_btnGrandTotalBalanceActionPerformed

    private void comboBoxYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxYearItemStateChanged
        String selected = comboBoxYear.getSelectedItem().toString();

        //filterData(selected);
        RowFilter<DefaultTableModel, Object> rf = null;

        try {
            rf = RowFilter.regexFilter(selected, jTable1.getColumnModel().getColumnIndex("Year"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        ((TableRowSorter) jTable1.getRowSorter()).setRowFilter(rf);
    }//GEN-LAST:event_comboBoxYearItemStateChanged

    private void comboBoxMonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxMonthItemStateChanged
        String selected = comboBoxMonth.getSelectedItem().toString();

        RowFilter<DefaultTableModel, Object> rf = null;

        try {
            rf = RowFilter.regexFilter(selected, jTable1.getColumnModel().getColumnIndex("Month"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
        ((TableRowSorter) jTable1.getRowSorter()).setRowFilter(rf);

    }//GEN-LAST:event_comboBoxMonthItemStateChanged

    private DefaultTableModel searchSpecifics() {
        dm.addColumn("Acc_id");
        dm.addColumn("Housing Unit");
        dm.addColumn("Unit Name");
        dm.addColumn("House No");
        dm.addColumn("Rent");
        dm.addColumn("T Name");
        dm.addColumn("Description");
        dm.addColumn("Transaction ");
        dm.addColumn("Water charges");
        dm.addColumn("Garbage charges");
        dm.addColumn("Arrears");
        dm.addColumn("Other charges");
        dm.addColumn("Expected amount");
        dm.addColumn("Amount paid");
        dm.addColumn("Balance");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");

        //Select
        String sql = "SELECT * FROM accounts WHERE hname = '" + txtFldApartmentName.getText() + "'";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String hunit = rt.getString(2);
                String hname = rt.getString(3);
                String hno = rt.getString(4);
                String rent = rt.getString(5);
                String tname = rt.getString(6);
                String payment = rt.getString(7);
                String tno = rt.getString(8);
                String water = rt.getString(9);
                String garbage = rt.getString(10);
                String arrears = rt.getString(11);
                String other = rt.getString(12);
                String expected = rt.getString(13);
                String paid = rt.getString(14);
                String balance = rt.getString(19);
                String year = rt.getString(16);
                String month = rt.getString(17);
                String date = rt.getString(18);

                dm.addRow(new String[]{id, hunit, hname, hno, rent, tname, payment, tno, water, garbage, arrears, other, expected, paid, balance, year, month, date});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void clearTable() {
        txtFldApartmentName.setText("");
        DefaultTableModel dmm = (DefaultTableModel) jTable1.getModel();
        dmm.getDataVector().removeAllElements();
        dmm.fireTableDataChanged();
        //jTable1.revalidate();
    }

    private void btnSearchValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchValuesActionPerformed

        try {
            if (txtFldApartmentName.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Apartment name should not be blank!", "Error", JOptionPane.OK_OPTION);
                txtFldApartmentName.requestFocus();
            } else {
                DefaultTableModel dmm = (DefaultTableModel) jTable1.getModel();

                dmm = this.searchSpecifics();
                jTable1.setModel(dmm);
                txtFldApartmentName.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnSearchValuesActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed

        clearTable();
        searchContentsRefresh();
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void searchContentsRefresh() {
        DisplayPayments disp = new DisplayPayments();
        DefaultTableModel dmm = null;
        //jTable1.setModel(dmm);
        dmm = (DefaultTableModel) jTable1.getModel();
        dmm.getDataVector().removeAllElements();
        dmm.fireTableDataChanged();
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
            java.util.logging.Logger.getLogger(DisplayPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayPayments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayPayments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExitDelivery;
    private javax.swing.JButton btnGrandTotalBalance;
    private javax.swing.JButton btnGrandTotalRentExpected;
    private javax.swing.JButton btnGrandTotalRentPaid;
    private javax.swing.JButton btnPrintDelivery;
    private javax.swing.JButton btnRetrieve;
    private javax.swing.JButton btnSearchValues;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFldApartmentName;
    public javax.swing.JTextField txtFldGrandTotalExpenditure;
    public javax.swing.JTextField txtFldGrandTotalIncome;
    public javax.swing.JTextField txtFldGrandTotalRentUsed;
    // End of variables declaration//GEN-END:variables
}
