
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

public class HousingUnitDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";

    ResultSet rs = null;
    
    
    public Boolean addHousingUnit(String hUnit, String hName, String location, String categories, String number, String status, String condition, String rent, String tname) {

        String sql_stmnt = "INSERT INTO housingunit(h_unit,hu_name,location,categories,hnumber, status,condition,rent_charge,t_name) VALUES ('" + hUnit+ "','" + hName + "','" + location + "','" + categories + "','" + number + "','" + status+"','"+condition+"','"+rent+"','"+tname+ "')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);
   
            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            int rowsAffected = pst.executeUpdate();
            conn.close();
            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public Boolean delete(String id) {
        //SQL

        String sql = "DELETE FROM housingunit WHERE hu_id ='" + id + "'";

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
    
    
    public DefaultTableModel getData() {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        dm.addColumn("Hid");
        dm.addColumn("Housing Unit");
        dm.addColumn("Name");
        dm.addColumn("Location");
        dm.addColumn("Category");
        dm.addColumn("H Number");
        dm.addColumn("Status");
        dm.addColumn("Condition");
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
                String id = rt.getString(1);
                String hUnit = rt.getString(2);
                String name = rt.getString(3);
                String location = rt.getString(4);
                String category = rt.getString(5);
                String number = rt.getString(6);
                String status = rt.getString(7);
                String condition = rt.getString(8);
                String rent = rt.getString(9);
                String tenant = rt.getString(10);
                
                dm.addRow(new String[]{id,hUnit,name,location,category,number,status,condition,rent,tenant});
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public Boolean update(String id,String hunit, String name, String location, String category, String number, String status, String condition, String rent, String tenant) {
        String sql = "UPDATE housingunit SET h_unit = '" + hunit + "',hu_name='" + name + "',location='" + location + "',categories='" + category + "',hnumber='" + number + "',status='" + status + "',condition='" + condition + "',rent_charge='" + rent + "',t_name='" + tenant + "' WHERE hu_id ='" + id + "'";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            //Statement
            PreparedStatement st = conn.prepareStatement(sql);

            st.execute();

            conn.close();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
