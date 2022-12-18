// 1. write a program to create a file , 
// take you information such as name, company, location from 
// console and store it in file.

import java.io.*;
public class CreateFile {
  public static void main(String[] args) {
    String fileName = "myinfo.txt"; // name of the file to create
    String name = ""; // variable to store the user's name
    String company = ""; // variable to store the user's company
    String location = ""; // variable to store the user's location
    // Use a BufferedReader to read input from the console
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      // Create the file
      File file = new File(fileName);
      if (file.createNewFile()) {
        System.out.println("File created: " + fileName);
      } else {
        System.out.println("File already exists.");
      }
      
      // Prompt the user for their name, company, and location
      System.out.print("Enter your name: ");
      name = reader.readLine();
      
      System.out.print("Enter your company: ");
      company = reader.readLine();
      
      System.out.print("Enter your location: ");
      location = reader.readLine();
      
      // Write the user's information to the file
      PrintWriter writer = new PrintWriter(file);
      writer.println("Name: " + name);
      writer.println("Company: " + company);
      writer.println("Location: " + location);
      writer.close();
      
      System.out.println("Information saved to file.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
