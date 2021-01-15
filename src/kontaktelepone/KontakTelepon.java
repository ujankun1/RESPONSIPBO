/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontaktelepone;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Lenovo
 */
public class KontakTelepon {
Connection conn = null;
    /**
     * @param args the command line arguments
     */
    public static Connection koneksi() {
        String driver = "com.mysql.jdbc.Driver";
        String _host = "jdbc:mysql://localhost/databuku";
        String _user = "root";
        String _pass = "";
        // TODO code application logic here
    try {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(_host, _user, _pass);
        return conn;
    }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
}
