
package bracestate;

/**
 *
 * @author Abi
 */

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;


public class LoginDB {
    
    String conString = "jdbc:postgresql://localhost:5432/Estate";
    String user = "postgres";
    String passWord = "abel";

    ResultSet rs = null;
    
    
     public Boolean addUser(String first, String last, String username, String password, String confirmpassword, String role) {

        String sql_stmnt = "INSERT INTO login(f_name,l_name,username,password,confirmpassword,role) VALUES ('" + first + "','" + last + "','" + username + "','" + password + "','" + confirmpassword + "','" + role+"')";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, passWord);

            PreparedStatement pst = conn.prepareStatement(sql_stmnt);

            int rowsAffected = pst.executeUpdate();
            conn.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
}
