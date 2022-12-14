import java.util.Scanner;

public class CountCharacters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a mixed string: ");
    String s = input.nextLine();

    int upperCase = 0;
    int lowerCase = 0;
    int digits = 0;
    int special = 0;

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isUpperCase(ch)) {
        upperCase++;
      } else if (Character.isLowerCase(ch)) {
        lowerCase++;
      } else if (Character.isDigit(ch)) {
        digits++;
      } else {
        special++;
      }
    }

    System.out.println("Uppercase letters: " + upperCase);
    System.out.println("Lowercase letters: " + lowerCase);
    System.out.println("Digits: " + digits);
    System.out.println("Special symbols: " + special);

    if (upperCase == 0 && lowerCase == 0 && digits == 0 && special == 0) {
      System.out.println("Not present in string");
    }
  }
}



// Write a Java program to enter a mixed string e. HelloHi3456#Bye
// and count number of uppercase , lowercase alpthabates , 
// digits and special symbols.
// if it not have any of them give message to user "not present in String"