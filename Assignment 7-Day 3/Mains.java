// Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.



class Member {
  // data members
  String name;
  int age;
  String phoneNumber;
  String address;
  double salary;

  // method to print salary
  void printSalary() {
    System.out.println("Salary: " + salary);
  }
}

class Employee extends Member {
  // data member for specialization
  String specialization;
}

class Manager extends Member {
  // data member for department
  String department;
}

public class Mains {
  public static void main(String[] args) {
    // create an Employee object
    Employee emp = new Employee();
    emp.name = "John Doe";
    emp.age = 30;
    emp.phoneNumber = "123-456-7890";
    emp.address = "123 Main St, Anytown USA";
    emp.salary = 50000;
    emp.specialization = "Software Engineering";

    // create a Manager object
    Manager mgr = new Manager();
    mgr.name = "Jane Doe";
    mgr.age = 35;
    mgr.phoneNumber = "098-765-4321";
    mgr.address = "456 Park Ave, Anytown USA";
    mgr.salary = 75000;
    mgr.department = "Human Resources";

    // print the Employee's salary
    emp.printSalary();

    // print the Manager's salary
    mgr.printSalary();
  }
}
