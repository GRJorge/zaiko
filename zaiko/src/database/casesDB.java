package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jorge
 */
public class casesDB {
    static Connection con = connection.connection();
    static Statement stmt;
    
    public static void add(String type, String brand, String model) throws SQLException{
        stmt = con.createStatement();
        stmt.executeUpdate("INSERT INTO protector VALUES(NULL,'" + type + "','" + brand + "','" + model + "',(SELECT MAX(id) FROM articulo))");
    }
}
