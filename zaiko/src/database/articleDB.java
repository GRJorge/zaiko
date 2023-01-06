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
    
    public static void add(String code, int lot) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO articulo VALUES(NULL, '" + code + "', " + lot + ")");
    }
    public static ResultSet getMaxId() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT MAX(id) AS id FROM articulo;");
    }
}
