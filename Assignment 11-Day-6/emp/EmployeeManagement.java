import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
  int id;
  String name;
  double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }
}

public class EmployeeManagement {
  static Map<Integer, Employee> employees = new HashMap<>();
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while (true) {
      System.out.println("Menu:");
      System.out.println("1. Add an employee");
      System.out.println("2. Edit employee salary");
      System.out.println("3. Remove employee");
      System.out.println("4. Display employee details");
      System.out.println("5. Search for employee");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          addEmployee();
          break;
        case 2:
          editEmployeeSalary();
          break;
        case 3:
          removeEmployee();
          break;
        case 4:
          displayEmployeeDetails();
          break;
        case 5:
          searchEmployee();
          break;
        default:
          System.out.println("Invalid choice. Try again.");
          break;
      }
    }
  }

  private static void searchEmployee() {
  }

  private static void displayEmployeeDetails() {
  }

  public static void addEmployee() {
    System.out.print("Enter employee id: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter employee name: ");
    String name = scanner.nextLine();

    System.out.print("Enter employee salary: ");
    double salary = scanner.nextDouble();
    scanner.nextLine();

    Employee employee = new Employee(id, name, salary);
    employees.put(id, employee);

    System.out.println("Employee added successfully.");
  }

  public static void editEmployeeSalary() {
    System.out.print("Enter employee id: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    Employee employee = employees.get(id);
    if (employee == null) {
      System.out.println("Employee not found.");
      return;
    }

    System.out.print("Enter new salary: ");
    double salary = scanner.nextDouble();
    scanner.nextLine();

    employee.salary = salary;
    employees.put(id, employee);

    System.out.println("Salary updated successfully.");
  }

  public static void removeEmployee() {
    System.out.print("Enter employee id: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    Employee employee = employees.get(id);
    if (employee == null) {
      System.out.println("Employee not fount");
    }
  }
}
