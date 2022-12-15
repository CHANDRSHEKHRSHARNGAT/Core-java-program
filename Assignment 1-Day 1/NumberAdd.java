// write a java program to display addition of two numbers
// 1. accept any two numbers from users 
// 2. create a method named  addTwoNumbers
// public int addTwoNumbers(int a , int b)
// 3. add the given number and display the output
// Create class named NumberAdd , add a main method in the class.
//  in main create object of class and access the method

public class NumberAdd {

  public static void main(String[] args) {
    // accept two numbers from user
    int a = 10;
    int b = 20;
    
    // create object of NumberAdd class
    NumberAdd obj = new NumberAdd();
    
    // call the method and pass the numbers
    int sum = obj.addTwoNumbers(a, b);
    
    // print the result
System.out.println("Sum of " + a + " and " + b + " is " + sum);
  }
  
  // method to add two numbers
  public int addTwoNumbers(int a, int b) {
    return a + b;
  }
}

