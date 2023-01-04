package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class articleDB {
    static Connection con = connection.connection();
    static Statement stmt;
    
    public static void add(String code, int lot){
        try{
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO articulo VALUES(NULL, '" + code + "', " + lot + ")");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "El codigo " + code + " ya fue registrado.", "Codigo ya existente", 1);
        }
    }
    public static ResultSet getMaxId() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT MAX(id) AS id FROM articulo;");
    }
}
