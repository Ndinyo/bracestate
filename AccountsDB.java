
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

public class AccountsDB {

    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;

    public DefaultTableModel getData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        //dm.addColumn("Hid");
        dm.addColumn("Housing Unit");
        dm.addColumn("Name");
        dm.addColumn("Location");
        dm.addColumn("H Number");
        dm.addColumn("Rent");
        dm.addColumn("T Name");

        //Select
        String sql = "SELECT * FROM housingunit";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                //String id = rt.getString(1);
                String hUnit = rt.getString(2);
                String name = rt.getString(3);
                String location = rt.getString(4);
                //String category = rt.getString(5);
                String number = rt.getString(6);
                //String status = rt.getString(7);
                //String condition = rt.getString(8);
                String rent = rt.getString(9);
                String tenant = rt.getString(10);

                dm.addRow(new String[]{hUnit, name,location, number, rent, tenant});

            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean addRentPay(String hunit, String name, String hno, String rent, String tname, String payment, String tno, String water, String garbage, String arrears, String other, String expected, String paid, String balance, int year, String month, String date, String deposit,String location) {

        String sql = "INSERT INTO accounts(hunit,hname,hno,rent,tname,payment,transaction,water,garbage,arrears,other,expected,paid,ba,year,month,date,deposit,location) VALUES ('" + hunit + "','" + name + "','" + hno + "','" + rent + "','" + tname + "','" + payment + "','" + tno + "','" + water + "','" + garbage + "','" + arrears + "','" + other + "','" + expected + "','" + paid + "','" + balance + "','" + year + "','" + month + "','" + date + "','"+deposit+"','" + location+"')";

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

    public DefaultTableModel getPayData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

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
        dm.addColumn("Penalty charges");
        dm.addColumn("Expected amount");
        dm.addColumn("Amount paid");
        dm.addColumn("Balance");
        dm.addColumn("Year");
        dm.addColumn("Month");
        dm.addColumn("Date");
        dm.addColumn("Deposit");
        dm.addColumn("Location");

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
                String deposit = rt.getString(20);
                String location = rt.getString(21);

                dm.addRow(new String[]{id, hunit, hname, hno, rent, tname, payment, tno, water, garbage, arrears, other, expected, paid, balance, year, month, date,deposit,location});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Boolean deletePay(String id) {
        //SQL

        String sql = "DELETE FROM accounts WHERE acc_id ='" + id + "'";

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

}
