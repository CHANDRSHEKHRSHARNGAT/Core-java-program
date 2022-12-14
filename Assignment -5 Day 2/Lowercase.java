// Get the first name, middle name, and last name from the user
public class Lowercase{
    public static void main(String[] args){
var firstName = "John";
var middleName = "Michael";
var lastName = "Smith";

// Get the first letter of each name
var firstInitial = firstName.substring(0, 1);
var middleInitial = middleName.substring(0, 1);
var lastInitial = lastName.substring(0, 1);

// Concatenate the initials together and make them lowercase
var initials = firstInitial + middleInitial + lastInitial;
initials = initials.toLowerCase();

System.out.println(initials); 
    }
}

// .Enter first name, middle name, and last name 
// from the user and get the
// the first letter of the first name, middle name, 
// and last name and 
// append (concatenate) them together and then
//  return them all in lowercase.