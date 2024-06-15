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
    private long mobileNumber;
    private String userName;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String birthday;
    private String department;
    private String employmentStatus;
   
    
    public EmployeeBlueprint() {
        //empty
    }
    
    public EmployeeBlueprint(
            String userName, 
            String password, 
            String firstName, 
            String middleName, 
            String lastName,
            String address,
            String birthday, 
            long mobileNumber,
            String department, 
            String employmentStatus) {
       
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.mobileNumber = mobileNumber;
        this.department = department;
        this.employmentStatus = employmentStatus;
    
    }
    
    public String getuserName() { 
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    } 
    
    public String getpassword() { 
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
    
    public String getaddress() { 
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    } 
    
    public String getbirthday() { 
        return birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    } 
    
    public long getmobileNumber() { 
        return mobileNumber;
    }
    
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
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
