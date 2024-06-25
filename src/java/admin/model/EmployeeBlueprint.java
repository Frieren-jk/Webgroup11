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

    private String userName;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String birthday;
    private String mobileNumber;
    private String accountStatus;
    private String loginStatus;

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
            String mobileNumber) {

        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.mobileNumber = mobileNumber;

    }
    
    

    public EmployeeBlueprint(
            String userName,
            String firstName,
            String middleName,
            String lastName,
            String address,
            String birthday,
            String mobileNumber) {

        this.userName = userName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.mobileNumber = mobileNumber;

    }

    @Override
    public String toString() {
        return "EmployeeBlueprint{"
                + "userName='" + userName + '\''
                + ", password='" + password + '\''
                + ", firstName='" + firstName + '\''
                + ", middleName='" + middleName + '\''
                + ", lastName='" + lastName + '\''
                + ", address='" + address + '\''
                + ", birthday='" + birthday + '\''
                + ", mobileNumber='" + mobileNumber + '\''
                + ", accountStatus='" + accountStatus + '\''
                + ", loginStatus='" + loginStatus + '\''
                + '}';
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

    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getaccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getloginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

}
