package admin.model;

public class ClientModel {
    private String Username;
    private String Password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String completeAddress;
    private String Birthday;
    private Double mobileNumber;

    public String getUsername() {
        return Username;
    }

    public void setId(String Username) {
        this.Username = Username;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public String getFirstName() {
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
    
    public String getcompleteAddress() {
        return completeAddress;
    }
    
    public void setcompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }
    
    public String getBirthday() {
        return Birthday;
    }
    
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
    
    public double getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(Double mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
