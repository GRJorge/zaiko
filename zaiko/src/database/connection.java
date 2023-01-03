package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class connection {
    public static String bd = "zaiko";
    public static String user = "root";
    public static String pass = "";
    public static String url = "jdbc:mysql://localhost:3306/";
    public static Connection con;
    
    public static Connection connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url+bd,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la base de datos\n" + ex + "\n" + bd + "|" + user + "|" + pass + "|" + url, "Error BD", 0);
        }
        return con;
    }
}
