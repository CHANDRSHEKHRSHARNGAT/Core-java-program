import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeLists {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice = 0;
    String name;

    // Create a variable to store the index of the name 
    int index;

    do {
      System.out.println("1. Add name to list");
      System.out.println("2. Edit name in list");
      System.out.println("3. Remove name from list");
      System.out.println("4. Display list in ascending order");
      System.out.println("5. Exit");
      System.out.println("Enter your choice: ");

      // Read the user's choice
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          // Read the name that the user wants to add
          System.out.println("Enter the name: ");
          name = scanner.next();

          // Add the name to the list
          names.add(name);
          break;
        case 2:
          // Read the name that the user wants to edit
          System.out.println("Enter the name: ");
          name = scanner.next();

          System.out.println("Enter the index: ");
          index = scanner.nextInt();

          // Edit the name in the list
          names.set(index, name);
          break;
        case 3:
          System.out.println("Enter the index: ");
          index = scanner.nextInt();

          // Remove the name from the list
          names.remove(index);
          break;
        case 4:
          // Sort the names in ascending order
          Collections.sort(names);

          // Print the names
          for (String s : names) {
            System.out.println(s);
          }
          break;
        case 5:
          // Exit 
          break;
        default:
          System.out.println("Invalid choice.");
          break;
      }
    } while (choice != 5);
  }
}
