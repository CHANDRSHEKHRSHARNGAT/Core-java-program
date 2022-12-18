// a)     Create base class named Person
// b)     Properties: id, name, address
// c)      Add default constructor in Person class
// d)     Add constructor with three parameters id, name, address
// e)     create class Employee which inherits all the three properties id, name, address
// f)       Add default constructor to employee class
// g)     add basicSalary property in Employee with getter and setter
// h)     create class EmployeeMain with main method
// i)       In main method create object of Employee
// j)       set all the properties id,name,address , salary calling setters of employee
// k)     display the Employee details


// Base class Person
class Person {
    private int id;
    private String name;
    private String address;
    
    // Default constructor
    public Person() {
        this.id = 0;
        this.name = "";
        this.address = "";
    }
    
    // Constructor with three parameters
    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    // Getters and setters for id, name, and address
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

// Employee class that inherits from Person
class Employee extends Person {
    private int basicSalary;
    
    // Default constructor
    public Employee() {
        super();
        this.basicSalary = 0;
    }
    
    // Getter and setter for basicSalary
    public int getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
}

// EmployeeMain class with main method
public class EmployeeMain {
    public static void main(String[] args) {
        // Create Employee object
        Employee emp = new Employee();
        
        // Set employee properties
        emp.setId(1);
        emp.setName("John Doe");
        emp.setAddress("123 Main St");
        emp.setBasicSalary(50000);
        
        // Display employee details
        System.out.println("Employee details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Basic salary: $" + emp.getBasicSalary());
    }
}
