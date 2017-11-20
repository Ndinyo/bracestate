
package bracestate;

/**
 *
 * @author Abi
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import org.postgresql.largeobject.LargeObject;
import org.postgresql.largeobject.LargeObjectManager;


public class NewTenantDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";
    
    ResultSet rs = null;
    
    
    public Boolean addTenant(String tName, String gender,String address, String emailAddress, String mobile, String idNo, String date, String paid, String amount, String hUnit, String name, String category, String hNo, String imageF ) {

        String sql_stmnt = "INSERT INTO tenants(name,gender,address,email,mobile,id_no,date_join,paid,amount,h_unit,hu_name,category,h_no,images) VALUES ('" + tName+ "','" + gender + "','" + address+ "','" + emailAddress + "','" + mobile + "','" + idNo + "','" + date + "','" + paid +"','"+amount+"','"+hUnit+"','"+name+"','"+category+"','"+hNo+ "','" + imageF+ "')";

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

        String sql = "DELETE FROM tenants WHERE t_id ='" + id + "'";

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
    
     public DefaultTableModel getData() throws SQLException {
        //Add columns to TableModel
        DefaultTableModel dm = new DefaultTableModel();

        Connection conn = DriverManager.getConnection(conString, user, password);

        dm.addColumn("tid");
        dm.addColumn("Name");
        dm.addColumn("Gender");
        dm.addColumn("Address");
        dm.addColumn("Email");
        dm.addColumn("Mobile");
        dm.addColumn("ID NO");
        dm.addColumn("Date");
        dm.addColumn("Paid Deposit?");
        dm.addColumn("Amount");
        dm.addColumn("Housing unit");
        dm.addColumn("Name");
        dm.addColumn("Category");
        dm.addColumn("House No");
//        dm.addColumn("Image");
//        dm.addColumn("Source path");
//  
//        LargeObjectManager lobj = ((org.postgresql.PGConnection)conn).getLargeObjectAPI();
        
        //Select
        String sql = "SELECT * FROM tenants";

        try {
            Class.forName("org.postgresql.Driver");
            
            //Prepared statement
            PreparedStatement st = conn.prepareStatement(sql);

            //st.execute();
            ResultSet rt = st.executeQuery();

            while (rt.next()) {
                String id = rt.getString(1);
                String name = rt.getString(2);
                String gender = rt.getString(3);
                String address = rt.getString(4);
                String email = rt.getString(5);
                String mobile = rt.getString(6);
                String idno = rt.getString(7);
                String dateJ = rt.getString(8);
                String paid = rt.getString(9);
                String amount = rt.getString(10);
                String hunit = rt.getString(11);
                String hunitname = rt.getString(12);
                String category = rt.getString(13);
                String hno = rt.getString(14);
               
                dm.addRow(new String[]{id, name, gender, address, email, mobile,idno, dateJ, paid, amount, hunit, hunitname, category, hno});
                
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
     
     public Boolean update(String id,String tName, String gender,String address, String email, String mobile, String idNo, String date, String paid, String amount, String hUnit, String name, String category, String hNo) {
        String sql = "UPDATE tenants SET name = '" + tName + "',gender='" + gender + "',address='" + address + "',email='" + email + "',mobile='" + mobile + "',id_no='" + idNo + "',date_join='" + date + "',paid='" + paid + "',amount='" + amount + "',h_unit='" +hUnit+ "',hu_name='" +name+ "',category='" +category+ "',h_no='" +hNo+ "' WHERE t_id ='" + id + "'";

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
