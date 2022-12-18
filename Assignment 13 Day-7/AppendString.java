// Write a program to append user entered string 
// every time when you open 
// a file "info.txt" for writing 

import java.io.*;

public class AppendString {
    public static void main(String[] args) throws IOException {
        // Prompt the user to enter a string to append to the file
        System.out.println("Enter a string to append to the file: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();

        // Open the file for writing and append the user's string to it
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("info.txt", true))) {
            writer.write(inputString);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
