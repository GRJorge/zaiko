package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class phoneDB {
    static Connection con = connection.connection();
    static Statement stmt;
    
    public static void add(String brand, String model, String capacity) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO telefono VALUES(NULL,'" + brand + "','" + model + "','" + capacity + "',(SELECT MAX(id) FROM articulo))");
    }
    public static ResultSet get() throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT codigo, marca, modelo, capacidad, cantidad FROM telefono INNER JOIN articulo WHERE articuloFK=articulo.id ORDER BY articulo.id DESC");
    }
    public static ResultSet searchBy(String by, String searchText) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT codigo, marca, modelo, capacidad, cantidad FROM telefono INNER JOIN articulo WHERE " + by + " LIKE '%" + searchText + "%' AND articuloFK=articulo.id");
    }
}
