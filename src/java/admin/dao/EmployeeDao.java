/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.dao;
import admin.model.EmployeeBlueprint;
/**
 *
 * @author John
 */
public class EmployeeDao {
    public EmployeeBlueprint getEmployeeList(EmployeeBlueprint employee) {
        int employeeID = employee.getEmployeeID();
        String firstName = employee.getfirstName();
        String lastName = employee.getLastName();
        String middleName = employee.getMiddleName();
        String department = employee.getDepartment();
        String employmentStatus = employee.getEmploymentStatus();
        EmployeeBlueprint employeelist = new EmployeeBlueprint(employeeID, firstName, lastName, middleName, department, employmentStatus);
        return employeelist;
        
    
    }
    
}
