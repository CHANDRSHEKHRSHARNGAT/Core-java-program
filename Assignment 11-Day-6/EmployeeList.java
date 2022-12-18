// Write program to accept employee names, add the names
//  in Collection (Array List) 
// Create menu with given options
// 1. Add the names to the list.
// 2. Edit the name in the list.
// 3. Remove name form the list.

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
  public static void main(String[] args) {
    ArrayList<String> employees = new ArrayList<String>();
    Scanner in = new Scanner(System.in);

    while (true) {
      // Print menu
      System.out.println("1. Add a name to the list");
      System.out.println("2. Edit a name in the list");
      System.out.println("3. Remove a name from the list");

      // Prompt user to select an option
      System.out.print("Enter your selection: ");
      int selection = in.nextInt();

      // Add a name to the list
      if (selection == 1) {
        System.out.print("Enter the name to add: ");
        String name = in.next();
        employees.add(name);
      }
      // Edit a name in the list
      else if (selection == 2) {
        System.out.print("Enter the name to edit: ");
        String oldName = in.next();
        System.out.print("Enter the new name: ");
        String newName = in.next();

        // Find the index of the name to edit
        int index = employees.indexOf(oldName);

        // Check if the name exists in the list
        if (index != -1) {
          employees.set(index, newName);
          System.out.println("Name edited successfully.");
        }
        else {
          System.out.println("Error: Name not found in the list.");
        }
      }
      // Remove a name from the list
      else if (selection == 3) {
        System.out.print("Enter the name to remove: ");
        String name = in.next();

        // Check if the name exists in the list
        if (employees.remove(name)) {
          System.out.println("Name removed successfully.");
        }
        else {
          System.out.println("Error: Name not found in the list.");
        }
      }
      else {
        System.out.println("Invalid selection.");
      }
    }
  }
}
