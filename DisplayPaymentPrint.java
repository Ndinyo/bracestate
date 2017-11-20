package bracestate.View;

import bracestate.AccountsDB;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class DisplayPaymentPrint extends javax.swing.JFrame {

    /**
     * Creates new form DisplayPaymentPrint
     */
    public DisplayPaymentPrint() {
        initComponents();
        jTable1.setAutoCreateRowSorter(true);
        
        String grandrent = "0.00";
        double grent = Double.parseDouble(grandrent);
        txtFldGrandTotalRentUsed.setText(grandrent);
        
        String grandexpe = "0.00";
        double gexpe = Double.parseDouble(grandexpe);
        txtFldGrandTotalExpenditure.setText(grandexpe);
        
        String grandincome = "0.00";
        double gincome = Double.parseDouble(grandincome);
        txtFldGrandTotalIncome.setText(grandincome);
    }

    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    DefaultTableModel dm = new DefaultTableModel();
    
    PreparedStatement pst = null;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnExitDelivery = new javax.swing.JButton();
        btnPrintToReport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        comboBoxYear = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        comboBoxMonth = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnSearchValues = new javax.swing.JButton();
        txtFldApartmentName = new javax.swing.JTextField();
        btnClearTable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGrandTotalRentExpected = new javax.swing.JButton();
        txtFldGrandTotalRentUsed = new javax.swing.JTextField();
        txtFldGrandTotalExpenditure = new javax.swing.JTextField();
        btnGrandTotalRentPaid = new javax.swing.JButton();
        btnGrandTotalBalance = new javax.swing.JButton();
        txtFldGrandTotalIncome = new javax.swing.JTextField();

        setTitle("ACO HOLDINGS LIMITED - RENT PAYMENT OVERVIEW");

        jTable1.setBackground(new java.awt.Color(0, 255, 213));
        jTable1.setForeground(new java.awt.Color(0, 0, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnDelete.setBackground(new java.awt.Color(255, 255, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExitDelivery.setBackground(new java.awt.Color(255, 255, 0));
        btnExitDelivery.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExitDelivery.setText("Exit");
        btnExitDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitDeliveryActionPerformed(evt);
            }
        });

        btnPrintToReport.setBackground(new java.awt.Color(255, 255, 0));
        btnPrintToReport.setText("Print To Report");
        btnPrintToReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintToReportActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter By Year"));

        comboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "None" }));
        comboBoxYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxYearItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter By Month"));

        comboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        comboBoxMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMonthItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By Apartment name"));

        btnSearchValues.setBackground(new java.awt.Color(255, 255, 0));
        btnSearchValues.setText("Search");
        btnSearchValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchValuesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFldApartmentName, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchValues)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldApartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchValues))
                .addContainerGap())
        );

        btnClearTable.setBackground(new java.awt.Color(255, 255, 0));
        btnClearTable.setText("Clear Table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Attention ! Only perform one search then Exit the window to perform a different search");

        btnGrandTotalRentExpected.setBackground(new java.awt.Color(255, 255, 0));
        btnGrandTotalRentExpected.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalRentExpected.setText("Grand Total Rent Expected");
        btnGrandTotalRentExpected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalRentExpectedActionPerformed(evt);
            }
        });

        txtFldGrandTotalRentUsed.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalRentUsed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtFldGrandTotalExpenditure.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalExpenditure.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGrandTotalRentPaid.setBackground(new java.awt.Color(255, 255, 0));
        btnGrandTotalRentPaid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalRentPaid.setText("Grand Total Rent Paid");
        btnGrandTotalRentPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalRentPaidActionPerformed(evt);
            }
        });

        btnGrandTotalBalance.setBackground(new java.awt.Color(255, 255, 0));
        btnGrandTotalBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrandTotalBalance.setText("Grand Total Balance");
        btnGrandTotalBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrandTotalBalanceActionPerformed(evt);
            }
        });

        txtFldGrandTotalIncome.setBackground(new java.awt.Color(0, 255, 204));
        txtFldGrandTotalIncome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClearTable)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExitDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnPrintToReport)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrandTotalRentExpected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFldGrandTotalRentUsed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrandTotalRentPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFldGrandTotalExpenditure, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGrandTotalBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFldGrandTotalIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClearTable)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExitDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrintToReport, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGrandTotalBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnGrandTotalRentPaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGrandTotalRentExpected, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtFldGrandTotalIncome)
                    .addComponent(txtFldGrandTotalRentUsed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldGrandTotalExpenditure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
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
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnExitDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitDeliveryActionPerformed

        int exit = JOptionPane.showConfirmDialog(this, "Exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);

        if (exit == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnExitDeliveryActionPerformed

    public DefaultTableModel searchSpecifics() {
        //Add columns to TableModel
        //DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Ap_Id");
        //dm.addColumn("Housing Unit");
        
        dm.addColumn("House No");
        dm.addColumn("Rent");
        dm.addColumn("Tenant");
        //dm.addColumn("Description");
        //dm.addColumn("Transaction ");
        //dm.addColumn("Water charges");
        //dm.addColumn("Garbage charges");
        dm.addColumn("Arrears");
        //dm.addColumn("Other charges");
        dm.addColumn("Expected Amount");
        dm.addColumn("Amount Paid");
        dm.addColumn("Balance");
        dm.addColumn("Year");
        dm.addColumn("Month");
        //dm.addColumn("Date");
        dm.addColumn("Name");

        //Select
        //String sql = "SELECT hno,rent,tname,arrears,expected,paid,ba,year,month,date,hname FROM accounts";
        String sql = "SELECT * FROM accounts WHERE hname='" + txtFldApartmentName.getText()+"'";
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                // String hunit = rt.getString(2);
                String hname = rt.getString(3);
                String hno = rt.getString(4);
                String rent = rt.getString(5);
                String tname = rt.getString(6);
                //String payment = rt.getString(7);
                //String tno = rt.getString(8);
                //String water = rt.getString(9);
                //String garbage = rt.getString(10);
                String arrears = rt.getString(11);
                //String other = rt.getString(12);
                String expected = rt.getString(13);
                String paid = rt.getString(14);
                String balance = rt.getString(19);
                String year = rt.getString(16);
                String month = rt.getString(17);
                //String date = rt.getString(18);

                dm.addRow(new String[]{id,hno, rent, tname, arrears, expected, paid, balance, year, month,hname});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void btnPrintToReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintToReportActionPerformed
//
//        try {
//            JOptionPane.showMessageDialog(this, "Please be patient as the report is being generated......");
//            dm = (DefaultTableModel) jTable1.getModel();
//            JRTableModelDataSource dSource = new JRTableModelDataSource(dm);
//            String rSource = "reports/payment.jrxml";
//
//            JasperReport jr = JasperCompileManager.compileReport(rSource);
//            Map<String, Object> par = new HashMap<String, Object>();
//            par.put("Report", "report");
//
//            JasperPrint jp = JasperFillManager.fillReport(jr, par, dSource);
//
//            JasperViewer.viewReport(jp, false);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage());
//        }
//        
        String rSource = "reports/payment.jrxml";
        Map<String, Object> par = new HashMap<String, Object>();
        JasperReport jr = null;
        try {
            jr = JasperCompileManager.compileReport(rSource);
        } catch (JRException ex) {
            Logger.getLogger(DisplayPaymentPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
        //JOptionPane.showMessageDialog(this, "Please be patient as the report is being generated......");
            dm = (DefaultTableModel) jTable1.getModel();
            JRTableModelDataSource dSource = new JRTableModelDataSource(dm);
        JasperPrint jp = null;
        try {
            jp = JasperFillManager.fillReport(jr, par, dSource);
        } catch (JRException ex) {
            Logger.getLogger(DisplayPaymentPrint.class.getName()).log(Level.SEVERE, null, ex);
        }
         JasperViewer.viewReport(jp, false);
    }//GEN-LAST:event_btnPrintToReportActionPerformed

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

    private void clearTable() {
        txtFldApartmentName.setText("");
        DefaultTableModel dmm = (DefaultTableModel) jTable1.getModel();
        dmm.getDataVector().removeAllElements();
        dmm.fireTableDataChanged();
        //jTable1.revalidate();
    }
    
      private void searchContentsRefresh() {
       
        DefaultTableModel dmm = null;
        //jTable1.setModel(dmm);
        dmm = (DefaultTableModel) jTable1.getModel();
        dmm.getDataVector().removeAllElements();
        dmm.fireTableDataChanged();
    }
    
    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed

        clearTable();
        searchContentsRefresh();
    }//GEN-LAST:event_btnClearTableActionPerformed

    public int getGrandTotalBalance() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {

            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 7).toString());

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;

    }
     
     public int getGrandTotalRentPaid() {
        int rowsCount = jTable1.getRowCount();
        double sum = 0;
        try {

            for (int i = 0; i < rowsCount; i++) {
                sum = sum + Double.parseDouble(jTable1.getValueAt(i, 6).toString());

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Empty Values!", "Error!", JOptionPane.OK_OPTION);
        }
        return (int) sum;

    }
     
     
      public int getGrandTotalRentExpected() {
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
    
    private void btnGrandTotalRentExpectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalRentExpectedActionPerformed

        getGrandTotalRentExpected();
        txtFldGrandTotalRentUsed.setText(Integer.toString(getGrandTotalRentExpected()));
    }//GEN-LAST:event_btnGrandTotalRentExpectedActionPerformed

    private void btnGrandTotalRentPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalRentPaidActionPerformed
        getGrandTotalRentPaid();
        txtFldGrandTotalExpenditure.setText(Integer.toString(getGrandTotalRentPaid()));
    }//GEN-LAST:event_btnGrandTotalRentPaidActionPerformed

    private void btnGrandTotalBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrandTotalBalanceActionPerformed
        getGrandTotalBalance();
        txtFldGrandTotalIncome.setText(Integer.toString(getGrandTotalBalance()));
    }//GEN-LAST:event_btnGrandTotalBalanceActionPerformed
    
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
            java.util.logging.Logger.getLogger(DisplayPaymentPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayPaymentPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayPaymentPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayPaymentPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayPaymentPrint().setVisible(true);
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
    private javax.swing.JButton btnPrintToReport;
    private javax.swing.JButton btnSearchValues;
    private javax.swing.JComboBox<String> comboBoxMonth;
    private javax.swing.JComboBox<String> comboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFldApartmentName;
    public javax.swing.JTextField txtFldGrandTotalExpenditure;
    public javax.swing.JTextField txtFldGrandTotalIncome;
    public javax.swing.JTextField txtFldGrandTotalRentUsed;
    // End of variables declaration//GEN-END:variables
}
