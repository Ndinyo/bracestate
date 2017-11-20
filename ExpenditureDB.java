package bracestate;

/**
 *
 * @author Abi
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class ExpenditureDB {
    
    
    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;
    
    public Boolean addExpenditurePay(String description, String expamount, int year, String month, String date, String gexpe) {

        String sql = "INSERT INTO expenditures(description,total_expenses,year,month,date,grandexpenses) VALUES ('" + description +  "','" + expamount  + "','"+ year + "','" + month + "','" + date + "','"  + gexpe+ "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement pst = conn.prepareStatement(sql);

            int rowsAffected = pst.executeUpdate();
            conn.close();
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
     public Boolean deleteExpenditure(String id) {
        //SQL

        String sql = "DELETE FROM expenditures WHERE exp_id ='" + id + "'";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            PreparedStatement st = conn.prepareStatement(sql);

            //EXecute
            st.execute();

            conn.close();

            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
     
     
     public DefaultTableModel getExpenditureData() {
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

                dm.addRow(new String[]{id,description, expAmount, year, month, date,  gexpe,});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
