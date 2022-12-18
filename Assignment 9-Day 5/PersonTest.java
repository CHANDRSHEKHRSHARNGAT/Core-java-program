// Create class Person having properties name, city, age,contactnumber
// b)	Add Getter/setter method for the properties
// c)	Create  PersonTest class with main method
// d)	Take input from user for person details
// e)	Check the following condition
// 1.	Name entered should be max 15 character 
// 2.	If name exceed 15 characters, then throw an exception on this condition
// 3.	Print message “name should be of max 15 character” and terminate the program
// f)	City entered should be “pune” , “Mumbai” or “Chennai”  
// If user enter any other city throw an exception message 
//“Please enter city (pune|Mumbai|Chennai) only” and terminate the program


import java.util.Scanner;

 class Persons {
  private String name;
  private String city;
  private int age;
  private String contactNumber;

  // Getters and setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getContactNumber() {
    return this.contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }
}

public class PersonTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter person name:");
    String name = sc.nextLine();

    // Check if name is less than 15 characters
    if (name.length() > 15) {
      throw new IllegalArgumentException("Name should be of max 15 characters");
    }

    System.out.println("Enter person city:");
    String city = sc.nextLine();

    // Check if city is "pune", "Mumbai" or "Chennai"
    if (!city.equalsIgnoreCase("pune") && !city.equalsIgnoreCase("mumbai") && !city.equalsIgnoreCase("chennai")) {
      throw new IllegalArgumentException("Please enter city (pune|Mumbai|Chennai) only");
    }

    System.out.println("Enter person age:");
    int age = sc.nextInt();

    System.out.println("Enter person contact number:");
    String contactNumber = sc.nextLine();

    // Create a Person object
    Persons persons = new Persons();
    persons.setName(name);
    persons.setCity(city);
    persons.setAge(age);
    persons.setContactNumber(contactNumber);

    // Print person details
    System.out.println("Person details:");
    System.out.println("Name: " + persons.getName());
    System.out.println("City: " + persons.getCity());
    System.out.println("Age: " + persons.getAge());
    System.out.println("Contact number: " + persons.getContactNumber());
  }
}
