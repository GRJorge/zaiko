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
    public static void update(String code, String brand, String model, String capacity) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("UPDATE telefono SET marca='" + brand + "', modelo='" + model + "', capacidad='" + capacity + "' WHERE articuloFK=(SELECT id FROM articulo WHERE codigo='" + code + "')");
    }
    
    public static ResultSet get(String code) throws SQLException{
        stmt = con.createStatement();
        ResultSet query;
        if(code == null){
            query = stmt.executeQuery("SELECT codigo, marca, modelo, capacidad, cantidad FROM telefono INNER JOIN articulo WHERE articuloFK=articulo.id ORDER BY articulo.id DESC");
        }else{
            query = stmt.executeQuery("SELECT marca, modelo, capacidad, cantidad FROM telefono INNER JOIN articulo WHERE articuloFK=articulo.id AND codigo='" + code + "'");
        }
        return query;
    }
    public static ResultSet searchBy(String by, String searchText) throws SQLException{
        stmt = con.createStatement();
        return stmt.executeQuery("SELECT codigo, marca, modelo, capacidad, cantidad FROM telefono INNER JOIN articulo WHERE " + by + " LIKE '%" + searchText + "%' AND articuloFK=articulo.id");
    }
}
