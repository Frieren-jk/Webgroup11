package admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    public boolean checkUserExists(String userName, String password) throws ClassNotFoundException {
        boolean exists = false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM employee WHERE userName = ? and password = ?";
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                exists = true;
                String updateQuery = "UPDATE employee SET loginStatus = 'Online' WHERE userName = ?";
                PreparedStatement updatePs;
                updatePs = conn.prepareStatement(updateQuery);
                updatePs.setString(1, userName);
                updatePs.executeUpdate();
                updatePs.close();
            }
        } catch (SQLException e) {
            System.out.println("SQLException" + e);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("SQLException" + e.getMessage());
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.println("SQLException" + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("SQLException" + e.getMessage());
                }
            }
        }
        return exists;
    }

    public void updateLoginStatus(String userName) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            String query = "UPDATE employee SET loginStatus = 'Offline' WHERE userName = ?";
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                }
            }
        }
    }
}
