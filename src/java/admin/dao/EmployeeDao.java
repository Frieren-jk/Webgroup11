/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.dao;

import admin.model.EmployeeBlueprint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

}
