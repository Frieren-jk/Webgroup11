/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.dao;

import admin.model.EmployeeBlueprint;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author John
 */
public class EmployeeDao {

    public boolean createEmployee(EmployeeBlueprint employee) {
        boolean success = false;
        Connection conn = null;
        PreparedStatement ps = null;
        String query = "INSERT INTO employee ("
                + "userName, "
                + "password, "
                + "firstName, "
                + "middleName, "
                + "lastName, "
                + "address, "
                + "birthday, "
                + "mobileNumber, "
                + "department, "
                + "employmentStatus) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

//                + "userName, "
//                + "password, "
//                + "firstName, "
//                + "middleName, "
//                + "lastName, "
//                + "address, "
//                + "birthday, "
//                + "mobileNumber, "
//                + "department, "
//                + "employmentStatus) "
//                + "values (?,?,?,?,?,?,?,?,?,?);";
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
            ps.setLong(8, employee.getmobileNumber());
            ps.setString(9, employee.getDepartment());
            ps.setString(10, employee.getEmploymentStatus());
            int rowAffected = ps.executeUpdate();
            if (rowAffected != 0) {
                success = true;
            }
        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    //ignore
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    //ignore
                }
            }

        }
        return success;
    }

    public EmployeeBlueprint getEmployeeList(EmployeeBlueprint employee) {
        String userName = employee.getuserName();
        String password = employee.getpassword();
        String firstName = employee.getfirstName();
        String middleName = employee.getMiddleName();
        String lastName = employee.getLastName();
        String address = employee.getaddress();
        String birthday = employee.getbirthday();
        long mobileNumber = employee.getmobileNumber();
        String department = employee.getDepartment();
        String employmentStatus = employee.getEmploymentStatus();
        EmployeeBlueprint employeelist = new EmployeeBlueprint(
                userName,
                password,
                firstName,
                middleName,
                lastName,
                address,
                birthday,
                mobileNumber,
                department,
                employmentStatus);
        return employeelist;

    }

}
