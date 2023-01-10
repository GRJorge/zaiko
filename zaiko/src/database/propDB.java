package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class propDB {
    static Connection con = connection.connection();
    static Statement stmt;
    
    public static void add(String brand, String description) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO accesorio VALUES(NULL,'" + brand + "','" + description + "',(SELECT MAX(id) FROM articulo))");
    }
    public static ResultSet get() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT codigo, marca, descripcion, cantidad FROM accesorio INNER JOIN articulo WHERE articuloFK=articulo.id ORDER BY articulo.id DESC");
    }
}
