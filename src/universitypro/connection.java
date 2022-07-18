
package universitypro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHEEB AL-AQLANY
 */
public class connection {
    static Connection con = null;
    static Connection connect(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root" , "");

        } catch (ClassNotFoundException | SQLException e) {
            
        }
        return con;
    }
}
