// Write program to accept employee details and add in 
//the set(HashSet) 
// Create menu with given options
// 1. Add the employee to the set.
// 2. Edit the employee in the set.  (Salary update)
// 3. Remove employee form the set.
// 4. Display list of Employee
// 5. Display employee list in asc order (based on emp name)


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
  private String name;
  private int salary;

  Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}

class EmployeeSet {
  public static void main(String[] args) {
    Set<Employee> employees = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("1. Add employee");
      System.out.println("2. Edit employee salary");
      System.out.println("3. Remove employee");
      System.out.println("4. Display employees");
      System.out.println("5. Display employees in ascending order by name");
      System.out.println("Enter your choice (1-5):");

      int choice = scanner.nextInt();

      if (choice == 1) {
        // Add employee
        System.out.println("Enter employee name:");
        String name = scanner.next();
        System.out.println("Enter employee salary:");
        int salary = scanner.nextInt();
        employees.add(new Employee(name, salary));
      } else if (choice == 2) {
        // Edit employee salary
        System.out.println("Enter employee name:");
        String name = scanner.next();
        Employee employee = findEmployeeByName(employees, name);
        if (employee == null) {
          System.out.println("Employee not found!");
        } else {
          System.out.println("Enter new salary:");
          int salary = scanner.nextInt();
          employee.setSalary(salary);
        }
      } else if (choice == 3) {
        // Remove employee
        System.out.println("Enter employee name:");
        String name = scanner.next();
        Employee employee = findEmployeeByName(employees, name);
        if (employee == null) {
          System.out.println("Employee not found!");
        } else {
          employees.remove(employee);
        }
      } else if (choice == 4) {
        // Display employees
        displayEmployees(employees);
      } else if (choice == 5) {
        // Display employees in ascending order by name
        displayEmployeesInAscendingOrderByName(employees);
      } else {
        break;
      }
    }

    scanner.close();
  }

private static Employee findEmployeeByName(Set<Employee> employees, String name) {
    return null;
}
private static void displayEmployees(Set<Employee> employees) {
}
private static void displayEmployeesInAscendingOrderByName(Set<Employee> employees) {
}

}

 