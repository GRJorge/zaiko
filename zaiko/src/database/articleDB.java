package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    public static void updateLot(String code, int newLot) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE articulo SET cantidad=" + newLot + " WHERE codigo='" + code + "'");
    }
    public static void sell(String code, int lot) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE articulo SET cantidad=(cantidad - " + lot + ") WHERE codigo='" + code + "'");
    }
    public static void delete(String code, String table) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM " + table + " WHERE id=(SELECT id FROM " + table + " WHERE articuloFK=(SELECT id FROM articulo WHERE codigo='" + code + "'))");
        stmt.executeUpdate("DELETE FROM articulo WHERE codigo='" + code + "'");
    }
    
    public static ResultSet getByCode(String code) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT * FROM articulo WHERE codigo='" + code + "'");
    } 
}
