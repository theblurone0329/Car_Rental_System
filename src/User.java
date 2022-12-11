public class User {

    String username;
    String password;
    String email;
    String phoneNum;
    String role;
    
    User(String username, String password, String email, String phoneNum, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
        this.role = role;
    }

    User(String username, String password, String email, String phoneNum) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getRole() {
        return role;
    }
}
