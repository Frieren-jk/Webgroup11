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

/**
 *
 * @author John
 */
public class EmployeeDao {

    private String SQLurl = "jdbc:mysql://localhost:3306/webgroup11?serverTimezone=UTC";
    private String username = "root";
    private String password = "pass123";

    private static final String SELECT_USER_ID = "select "
            + "userName, "
            + "password, "
            + "firstName, "
            + "middleName, "
            + "lastName, "
            + "address, "
            + "birthday, "
            + "mobileNumber from employee where username =?";
    private static final String SELECT_ALL_USER = "select * from employee";
    private static final String DELETE_USER = "delete from employee where userName = ?;";
    private static final String UPDATE_USER = "update employee set "
            + "userName = ?, "
            + "password = ?, "
            + "firstName = ?, "
            + "middleName = ?, "
            + "lastName = ?, "
            + "address = ?, "
            + "birthday = ?, "
            + "mobileNumber = ? where userName = ?;";

    //create User
    public void createEmployee(EmployeeBlueprint employee) {
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
        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        }
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
    public boolean updateEmployee(EmployeeBlueprint employee) {
        boolean rowUpdate = false;
        Connection conn;
        PreparedStatement ps;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(UPDATE_USER);
            ps.setString(1, employee.getuserName());
            ps.setString(2, employee.getpassword());
            ps.setString(3, employee.getfirstName());
            ps.setString(4, employee.getMiddleName());
            ps.setString(5, employee.getLastName());
            ps.setString(6, employee.getaddress());
            ps.setString(7, employee.getbirthday());
            ps.setString(8, employee.getmobileNumber());
            rowUpdate = ps.executeUpdate() > 0;
        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        }

        return rowUpdate;
    }

    //SELECT USER BY ID
    public EmployeeBlueprint selectUser(String userName) {
        EmployeeBlueprint user = null;
        Connection conn;
        PreparedStatement ps;
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(SELECT_USER_ID);
            ps.setString(1, userName);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String passw = rs.getString("password");
                String firstName = rs.getString("firstName");
                String middleName = rs.getString("middleName");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String birthday = rs.getString("birthday");
                String mobileNumber = rs.getString("mobileNumber");
                user = new EmployeeBlueprint(userName, passw, firstName, middleName, lastName, address, birthday, mobileNumber);
            }

        } catch (SQLException e) {
            System.out.println("SELECT USER BY ID error: " + e);
        }

        return user;
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
