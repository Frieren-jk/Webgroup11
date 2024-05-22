/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin.model;

/**
 *
 * @author John
 */
public class EmployeeBlueprint {
    private int employeeID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String department;
    private String employmentStatus;
   
    
    public EmployeeBlueprint() {
        //empty
    }
    
    public EmployeeBlueprint( int employeeID, String firstName, String middleName, String lastName, String department, String employmentStatus) {
       
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.employmentStatus = employmentStatus;
    
    }
    
    public int getEmployeeID() { 
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    } 
    
    public String getfirstName() { 
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
    
    public String getMiddleName() { 
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    } 
    
    public String getLastName() { 
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
    
    public String getDepartment() { 
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    } 
    
    public String getEmploymentStatus() { 
        return employmentStatus;
    }
    
    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    } 
  
    
}
