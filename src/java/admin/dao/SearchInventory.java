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

public class SearchInventory {

    public ArrayList<EmployeeBlueprint> getAllUser() {
        ArrayList<EmployeeBlueprint> AllUser = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String query = "SELECT"
                    + "userName, "
                    + "password, "
                    + "employeeID, "
                    + "firstName, "
                    + "middleName, "
                    + "lastName, "
                    + "address, "
                    + "birthday, "
                    + "mobileNumber, "
                    + "department, "
                    + "employmentStatus "
                    + "FROM employee";

            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {

                EmployeeBlueprint user = new EmployeeBlueprint();
                user.setUserName(rs.getString("userName"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("firstName"));
                user.setMiddleName(rs.getString("middleName"));
                user.setLastName(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setBirthday(rs.getString("birthday"));
                user.setMobileNumber(rs.getLong("mobileNumber"));
                user.setDepartment(rs.getString("department"));
                user.setEmploymentStatus(rs.getString("employmentStatus"));

                AllUser.add(user);

                conn.close();

            }

        } catch (SQLException error) {
            System.out.println("createEmployee Error: " + error);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    //ignore
                }
            }
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

        return null;

    }

}
