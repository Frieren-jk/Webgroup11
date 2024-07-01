/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.dao;

import admin.model.EmployeeBlueprint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.apache.catalina.User;

/**
 *
 * @author John
 */
public class EmployeeDao {

    private static final String SELECT_USER_ID = "select "
            + "userName, "
            + "password, "
            + "firstName, "
            + "middleName, "
            + "lastName, "
            + "address, "
            + "birthday, "
            + "mobileNumber from employee where userName = ? ";
    private static final String SELECT_ALL_USER = "select * from employee";
    private static final String DELETE_USER = "delete from employee where userName = ?;";
    private static final String UPDATE_USER = "UPDATE employee SET "
            + "password=?, "
            + "firstName=?, "
            + "middleName=?, "
            + "lastName=?, "
            + "address=?, "
            + "birthday=?, "
            + "mobileNumber=? "
            + "WHERE userName=?";

    //create User
    public boolean createEmployee(EmployeeBlueprint employee) {
        boolean success = false;
        Connection conn;
        PreparedStatement ps;
        String query = "INSERT INTO employee ("
                + "userName, "
                + "password, "
                + "firstName, "
                + "middleName, "
                + "lastName, "
                + "address, "
                + "birthday, "
                + "mobileNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, employee.getuserName());
            ps.setString(2, employee.getpassword());
            ps.setString(3, employee.getfirstName());
            ps.setString(4, employee.getMiddleName());
            ps.setString(5, employee.getLastName());
            ps.setString(6, employee.getaddress());
            ps.setString(7, employee.getbirthday());
            ps.setString(8, employee.getmobileNumber());
            int rowAffected = ps.executeUpdate();
            // Check if the insertion was successful
            if (rowAffected != 0) {
                success = true;
            }
        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        }
        return success;
    }

    //get User
    public EmployeeBlueprint getEmployeeList(EmployeeBlueprint employee) {
        String userName = employee.getuserName();
        String password = employee.getpassword();
        String firstName = employee.getfirstName();
        String middleName = employee.getMiddleName();
        String lastName = employee.getLastName();
        String address = employee.getaddress();
        String birthday = employee.getbirthday();
        String mobileNumber = employee.getmobileNumber();
        EmployeeBlueprint employeelist = new EmployeeBlueprint(
                userName,
                password,
                firstName,
                middleName,
                lastName,
                address,
                birthday,
                mobileNumber);
        return employeelist;

    }

    //update User
    public boolean updateUser(String password, String firstName, String middleName, String lastName, String address, String birthday, String mobileNumber, String userName) {
        boolean success = false;
        Connection conn;
        PreparedStatement ps;
        try {
            // Get a connection from the connection pool 
            conn = ConnectPool.getConnection();
            // Prepare the SQL statement
            ps = conn.prepareStatement(UPDATE_USER);
            // Set the parameters for the prepared statement
            ps.setString(1, password);
            ps.setString(2, firstName);
            ps.setString(3, middleName);
            ps.setString(4, lastName);
            ps.setString(5, address);
            ps.setString(6, birthday);
            ps.setString(7, mobileNumber);
            ps.setString(8, userName);

            // Execute the update
            int rowAffected = ps.executeUpdate();
            // Check if the insertion was successful
            if (rowAffected != 0) {
                success = true;
            }
        } catch (SQLException error) {
            System.out.println("updateProduct Error: " + error);
        }

        return success;
    }

    //SELECT USER BY ID
    public ArrayList<EmployeeBlueprint> selectUser(String userName) {
        ArrayList<EmployeeBlueprint> AllUser = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(SELECT_USER_ID);
            ps.setString(1, userName);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                EmployeeBlueprint user = new EmployeeBlueprint();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstName"));
                user.setMiddleName(rs.getString("middleName"));
                user.setLastName(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setBirthday(rs.getString("birthday"));
                user.setMobileNumber(rs.getString("mobileNumber"));

                AllUser.add(user);
                System.out.println(AllUser);
            }

        } catch (SQLException e) {
            System.out.println("SELECT USER BY ID error: " + e);
        }

        return AllUser;
    }

    //DLEETE USER
    public boolean deleteUser(String userName) throws SQLException {
        boolean rowsDeleted = false;
        Connection conn;
        PreparedStatement ps;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(DELETE_USER);
            ps.setString(1, userName);

            rowsDeleted = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("SELECT USER BY ID error: " + e);
        }
        return rowsDeleted;
    }

    public EmployeeBlueprint checkUserExists(String userName, String password) throws ClassNotFoundException {
        EmployeeBlueprint user = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT * FROM employee WHERE userName = ? OR password = ?";
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            rs = ps.executeQuery();

            if (rs.next()) {
                user = new EmployeeBlueprint();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
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
        return user;
    }
    
    public boolean isUserInDatabase(EmployeeBlueprint user) throws ClassNotFoundException {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webgroup11", "root", "WebtechNakakainis1");
        pstmt = conn.prepareStatement("SELECT * FROM employee WHERE username = ? AND password = ?");
        pstmt.setString(1, user.getuserName());
        pstmt.setString(2, user.getpassword());
        rs = pstmt.executeQuery();

        return rs.next(); // returns true if the user exists in the database
    } catch (SQLException e) {
        throw new ClassNotFoundException("Error checking user in database: " + e.getMessage());
    } finally {
        closeResources(conn, pstmt, rs);
    }
}

    private void closeResources(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            // log the error
        }
    }
}
