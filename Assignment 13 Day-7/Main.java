// 8.Write a java program to enter some lines of text from 
// console and give choice to user
// a. save b. discard
// if user select save, append the entered text inside 
// a file named "transcript" 
// if user select discard text message should not be 
// saved in file.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    // Create a BufferedReader to read input from the console
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      // Prompt the user to enter some lines of text
      System.out.println("Enter some lines of text:");
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        // Append the entered text to the string builder
        sb.append(line);
        sb.append("\n");

        // Ask the user if they want to save or discard the text
        System.out.println("Enter 'save' to save the text or 'discard' to discard it:");
        String choice = reader.readLine();

        // If the user chooses to save the text, write it to a file named "transcript"
        if (choice.equals("save")) {
          try (BufferedWriter writer = new BufferedWriter(new FileWriter("transcript"))) {
            writer.write(sb.toString());
            System.out.println("Text saved to file 'transcript'");
            break;
          } catch (IOException e) {
            System.out.println("Error writing to file 'transcript': " + e.getMessage());
            break;
          }
        } else if (choice.equals("discard")) {
          // If the user chooses to discard the text, print a message and exit the program
          System.out.println("Text discarded");
          break;
        } else {
          // If the user enters an invalid choice, print an error message and prompt them again
          System.out.println("Invalid choice. Please enter 'save' or 'discard'.");
        }
      }
    } catch (IOException e) {
      System.out.println("Error reading from console: " + e.getMessage());
    }
  }
}
