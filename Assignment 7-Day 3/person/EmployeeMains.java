// a)     Using the previous problem statement on Person
// b)     Remove the default constructor form Person and employee classes
// c)      Modify Employee class add parameterized constructor to assign the properties Person class
// d)     In EmployeeMain  create an object of Employee class
// e)     assign the properties using Employee class parameterized constructor
// (don't use setter)
// f)       display the details of employee by calling getter form Employee class


package person;

class Person {
    // Properties
    private int id;
    private String name;
    private String address;
    
    // Constructor with three parameters
    public Person(int id, String name, String address) {
      this.id = id;
      this.name = name;
      this.address = address;
    }
  }
  
  // Employee class that inherits from Person class
   class Employee extends Person {
    // basicSalary property with getter and setter
    private double basicSalary;
    
    public double getBasicSalary() {
      return basicSalary;
    }
    
    public void setBasicSalary(double basicSalary) {
      this.basicSalary = basicSalary;
    }
    
    // Constructor that accepts three parameters from Person class
    public Employee(int id, String name, String address, double basicSalary) {
      super(id, name, address);
      this.basicSalary = basicSalary;
    }

    public String getName() {
        return null;
    }

    public String getId() {
        return null;
    }
  }
  
  // EmployeeMain class with main method
  public class EmployeeMains {
    public static void main(String[] args) {
      // Create an object of Employee class
      Employee employee = new Employee(1, "John Doe", "123 Main Street", 50000);
      
      // Display Employee details
      System.out.println("ID: " + employee.getId());
      System.out.println("Name: " + employee.getName());
      System.out.println("Address: " + employee.getClass());
      System.out.println("Basic Salary: " + employee.getBasicSalary());
    }
  }
  