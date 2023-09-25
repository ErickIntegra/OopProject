package ProjectClass23;
/*
12. Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName
 */
public class Registration {
    private String email;
    private String userName;
    private String password;

    // Constructor to initialize the object with default values
    public Registration() {
        email = "";
        userName = "";
        password = "";
    }

    // Method to set the email with validation
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only yahoo email addresses are allowed.");
        }
    }

    // Method to set the userName with validation
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It should be at least 7 characters long and not contain the password.");
        }
    }

    // Method to set the password with validation
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It should be at least 7 characters long and not contain the userName.");
        }
    }

    // Method to check if an email is valid (Yahoo email)
    private boolean isValidEmail(String email) {
        return email != null && email.endsWith("@yahoo.com");
    }

    // Method to check if a userName is valid
    private boolean isValidUserName(String userName) {
        return userName != null && userName.length() > 6 && !password.contains(userName);
    }

    // Method to check if a password is valid
    private boolean isValidPassword(String password) {
        return password != null && password.length() > 6 && !userName.contains(password);
    }

    // Method to display the registration information
    public void displayRegistrationInfo() {
        System.out.println("Email: " + email);
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Registration registration = new Registration();

        // Set valid email, userName, and password
        registration.setEmail("user@yahoo.com");
        registration.setUserName("validUser");
        registration.setPassword("validPassword");

        // Display registration information
        registration.displayRegistrationInfo();

        // Attempt to set invalid email, userName, and password
        registration.setEmail("invalid@gmail.com"); // Should print an error message
        registration.setUserName("short"); // Should print an error message
        registration.setPassword("invalidUser"); // Should print an error message
    }
}