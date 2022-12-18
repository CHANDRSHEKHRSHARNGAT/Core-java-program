import java.util.HashSet;
import java.util.Scanner;

public class EmployeeNameSet {

  public static void main(String[] args) {
    // Create a new HashSet to store the employee names
    HashSet<String> employeeNames = new HashSet<>();

    // Create a scanner to read user input
    Scanner input = new Scanner(System.in);

    while (true) {
      // Display menu
      System.out.println("Menu:");
      System.out.println("1. Add a name to the set");
      System.out.println("2. Edit a name in the set");
      System.out.println("3. Remove a name from the set");

      // Read user's choice
      int choice = input.nextInt();

      // Add a name to the set
      if (choice == 1) {
        System.out.println("Enter a name to add to the set:");
        String name = input.next();
        employeeNames.add(name);
      }
      // Edit a name in the set
      else if (choice == 2) {
        System.out.println("Enter the name to edit:");
        String oldName = input.next();
        System.out.println("Enter the new name:");
        String newName = input.next();

        // Check if the old name exists in the set
        if (employeeNames.contains(oldName)) {
          // Remove the old name
          employeeNames.remove(oldName);
          // Add the new name
          employeeNames.add(newName);
        } else {
          System.out.println("The name you entered does not exist in the set.");
        }
      }
      // Remove a name from the set
      else if (choice == 3) {
        System.out.println("Enter the name to remove from the set:");
        String name = input.next();

        // Check if the name exists in the set
        if (employeeNames.contains(name)) {
          employeeNames.remove(name);
        } else {
          System.out.println("The name you entered does not exist in the set.");
        }
      }
    }
  }
}
