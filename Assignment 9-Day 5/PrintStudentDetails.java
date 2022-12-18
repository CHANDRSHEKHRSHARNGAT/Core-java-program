// Write a program in java to take following arguments 
//from command prompt and print them
// 1. student name
// 2.marks of float 5 subject
// 3. calculate average of marks 
// In main method print student name , marks of 5 subject 
//and their average,

public class PrintStudentDetails {
  public static void main(String[] args) {
      // Get student name
      String name = args[1];

      // Get marks of five subjects
      float mark1 = Float.parseFloat(args[1]);
      float mark2 = Float.parseFloat(args[2]);
      float mark3 = Float.parseFloat(args[3]);
      float mark4 = Float.parseFloat(args[4]);
      float mark5 = Float.parseFloat(args[5]);

      // Calculate average of marks
      float average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5;

      // Print student name, marks, and average
      System.out.println("Student Name: " + name);
      System.out.println("Marks in Subject 1: " + mark1);
      System.out.println("Marks in Subject 2: " + mark2);
      System.out.println("Marks in Subject 3: " + mark3);
      System.out.println("Marks in Subject 4: " + mark4);
      System.out.println("Marks in Subject 5: " + mark5);
      System.out.println("Average marks: " + average);
  }
}
