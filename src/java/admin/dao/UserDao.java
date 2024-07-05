package admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class UserDao {

    public boolean checkUserExists(String userName, String password) throws ClassNotFoundException {
        boolean exists = false;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT password FROM employee WHERE userName = ?";
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            rs = ps.executeQuery();

            if (rs.next()) {
                String storedHashedPassword = rs.getString("password");
                if (BCrypt.checkpw(password, storedHashedPassword)) {
                    exists = true;

                    // Update login status to 'Online'
                    String updateQuery = "UPDATE employee SET loginStatus = 'Online' WHERE userName = ?";
                    try (PreparedStatement updatePs = conn.prepareStatement(updateQuery)) {
                        updatePs.setString(1, userName);
                        updatePs.executeUpdate();
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
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

    public boolean changePass(String username, String newPassword) throws SQLException {
        boolean rowsUpdated = false;
        try (Connection conn = ConnectPool.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT password FROM employee WHERE userName = ?")) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String currentPasswordHash = rs.getString("password");
                    System.out.println("Current Password Hash: " + currentPasswordHash);

                    // Check if the new password matches the current password hash
                    if (BCrypt.checkpw(newPassword, currentPasswordHash)) {
                        System.out.println("New password is the same as the current password.");
                        return false;
                    }
                }
            }

            try (PreparedStatement updatePs = conn.prepareStatement("UPDATE employee SET password = ? WHERE userName = ?")) {
                updatePs.setString(1, hashPassword(newPassword)); // hash the new password
                updatePs.setString(2, username);
                rowsUpdated = updatePs.executeUpdate() > 0;
            }
        }
        return rowsUpdated;
    }

    private String hashPassword(String password) {
        String salt = BCrypt.gensalt(12); // Use a strong salt (12 rounds is recommended)
        return BCrypt.hashpw(password, salt);
    }

    public String getLatestPass(String userName) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String password = null;

        try {
            String query = "Select password from employee WHERE userName = ?";
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);

            rs = ps.executeQuery();

            if (rs.next()) {

                password = rs.getString("password");
                System.out.println("latest" + password);
            }
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
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("SQLException: " + e.getMessage());
                }
            }
        }
        return password;
    }

}
