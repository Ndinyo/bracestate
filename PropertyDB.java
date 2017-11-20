/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class PropertyDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String password = "abel";
    
    ResultSet rs = null;

    //Insert Data
    public Boolean addProperty(String hUnit, String hName, String location, String categories) {

        String sql_stmnt = "INSERT INTO property(h_unit,hu_name,location,categories) VALUES ('" + hUnit+ "','" + hName + "','" + location + "','" + categories + "')";

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

        String sql = "DELETE FROM property WHERE hu_id ='" + id + "'";

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

        //Select
        String sql = "SELECT * FROM property";

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
               
                dm.addRow(new String[]{id,hUnit,name,location,category});
             
            }
            return dm;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
     
      public Boolean update(String id, String hunit, String name, String location, String category) {
        String sql = "UPDATE property SET h_unit = '" + hunit + "',hu_name='" + name + "',location='" + location + "',category='" + category + "' WHERE hu_id ='" + id + "'";

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
