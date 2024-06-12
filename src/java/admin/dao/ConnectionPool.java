package admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    static Connection conn;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName (driver);
            
            String url = "jdbc:mysql://localhost:3306/webgroup11?serverTimezone=UTC";
            conn = (Connection) DriverManager.getConnection(url, "?", "?");
        }
        
        catch (SQLException e){
            System.out.println("SQLException" + e);
        }
        
        return conn;
    }
}
