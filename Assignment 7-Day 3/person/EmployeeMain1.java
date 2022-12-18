package person;

// Read the problem statement and implement the given requirement
// a)     Create class Developer which inherits Employee properties
// b)     Create class Tester which inherits Employee properties
// c)      add parameterized constructor in Developer and Tester classes
//          to set the property to superclass
// d)     In EmployeeMain class main method create an object of Developer and Tester class 
//           and display the information (use constructor to set the properties)
// e)     Display the salaries for Developer and Tester on console

// Employee class
class Employee {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }
}

// Developer class
 class Developer extends Employee {
  public Developer(String name, int salary) {
    super(name, salary);
  }
}

// Tester class
 class Tester extends Employee {
  public Tester(String name, int salary) {
    super(name, salary);
  }
}

// EmployeeMain class
public class EmployeeMain1 {
  public static void main(String[] args) {
    Developer dev = new Developer("John Doe", 120000);
    Tester tester = new Tester("Jane Doe", 100000);

    System.out.println("Developer: " + dev.getName() + ", Salary: " + dev.getSalary());
    System.out.println("Tester: " + tester.getName() + ", Salary: " + tester.getSalary());
  }
}
