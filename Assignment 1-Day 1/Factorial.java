// Q.  Write a Java program to find the factorial of a given number over command line option. 
//Use recursion instead of a for/while loop.
// Accepting the number as command line argument . 

public class Factorial {

  public static void main(String[] args) {
    // check if user has provided a number as command line argument
    if (args.length != 1) {
      System.out.println("Please provide a number to find the factorial");
    } else {
      // accept the number from command line argument
      int number = Integer.parseInt(args[0]);
      
      // create object of Factorial class
      Factorial obj = new Factorial();
      // call the method and pass the number
      int factorial = obj.findFactorial(number);
      // print the result
      System.out.println("Factorial of " + number + " is " + factorial);
    }
  }
  // method to find the factorial using recursion
  public int findFactorial(int number) {
    // base case
    if (number == 0) {
      return 1;
    }
    // recursive case
    return number * findFactorial(number - 1);
  }
}
