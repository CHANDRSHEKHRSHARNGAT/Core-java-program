public class RegularEx {
  public static void main(String[] args) {
    // A test email address
    String email = "test@example.com";

    // Call the validateEmail method and print the result
    System.out.println(validateEmail(email));
  }
  public static boolean validateEmail(String str) {
    // Use a regular expression to check if the email address is valid
return str.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$");
  }
}

// Write method which validates the email id enter by the user. 
// add method to validate the email id , 
//  public boolean validateEmail(String str)
// call the method in main and print the message true/false
// Note: make use of String matches function and  pattern (RegEx )
