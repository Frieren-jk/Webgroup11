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
        Connection conn  = null;
        PreparedStatement ps = null;
        String query = "insert into employee ("
                + "firstName, "
                + "middleName, "
                + "lastName, "
                + "department, "
                + "employmentStatus) "
                + "values (?,?,?,?,?)";
        try {
            conn = ConnectPool.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, employee.getfirstName());
            ps.setString(2, employee.getMiddleName());
            ps.setString(3, employee.getLastName());
            ps.setString(4, employee.getDepartment());
            ps.setString(5, employee.getEmploymentStatus());
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
        String firstName = employee.getfirstName();
        String middleName = employee.getMiddleName();
         String lastName = employee.getLastName();
        String department = employee.getDepartment();
        String employmentStatus = employee.getEmploymentStatus();
        EmployeeBlueprint employeelist = new EmployeeBlueprint(firstName, middleName,lastName, department, employmentStatus);
        return employeelist;
        
    
    }
    
}
