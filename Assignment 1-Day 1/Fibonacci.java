// Program to print the Fibonacci numbers. 8
// The Fibonacci numbers are 
//the numbers in the following sequence.
// 0, 1, 1, 2, 3, 5, 8, 13, 21............  

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many Fibonacci numbers to print: ");
    int n = input.nextInt();
    int fib1 = 0;
    int fib2 = 1;
    System.out.print(fib1 + " " + fib2 + " ");
    for (int i = 2; i < n; i++) {
      int fib3 = fib1 + fib2;
      System.out.print(fib3 + " ");
      fib1 = fib2;
      fib2 = fib3;
    }
    System.out.println();
  }
}