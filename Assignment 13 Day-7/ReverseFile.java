// Write a program to read the content of file you 
// created in exercise above and 
// store it in reverse order in another file.

import java.io.*;
import java.util.Scanner;

public class ReverseFile {
  public static void main(String[] args) throws IOException {
    // Create a Scanner object to read the input file
    Scanner input = new Scanner(new File("input.txt"));
    // Create a FileWriter object to write to the output file
    FileWriter output = new FileWriter("output.txt");
    // Read the input file line by line and store it in a StringBuilder object
    StringBuilder sb = new StringBuilder();
    while (input.hasNextLine()) {
      sb.append(input.nextLine());
      sb.append(System.lineSeparator());
    }
    // Reverse the contents of the StringBuilder object
    sb.reverse();
    // Write the reversed contents of the StringBuilder object to the output file
    output.write(sb.toString());
    // Close the Scanner and FileWriter objects
    input.close();
    output.close();
  }
}
