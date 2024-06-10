package admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterAdd {

    public boolean addRegister (
            String Username,
            String Password,
            String firstName,
            String middleName,
            String lastName,
            String completeAddress,
            String Birthday,
            double mobileNumber) throws ClassNotFoundException{
        boolean success = false;
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            String query = "INSERT INTO clientinfo ("
                    + "Username,)"
                    + "Password,)"
                    + "firstName,"
                    + "middleName,"
                    + "lastName,"
                    + "completeAddress,)"
                    + "Birthday,)"
                    + "mobileNumber,)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            conn = ConnectionPool.getConnection();
            ps = conn.prepareStatement (query);
            ps.setString(1, Username);
            ps.setString(1, Password);
            ps.setString(1, firstName);
            ps.setString(2, middleName);
            ps.setString(3, lastName);
            ps.setString(3, completeAddress);
            ps.setString(3, Birthday);
            ps.setInt(4, mobileNumber);
            
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected !=0) {
                success = true;
            }
        }
        
        catch (SQLException e){
            System.out.println("SQLException" + e);
            
        }
        
        finally {
            if (conn != null) {
                try {
                    conn.close();
                }
                
                catch (SQLException e){
                     System.out.println("SQLException" + e.getMessage());
                }
            }
        }
        
        return success;
    }
}
