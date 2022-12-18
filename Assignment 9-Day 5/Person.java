// a)	Create class person with name and age properties with getter/setter
// b)	CreatePesonTest class having main method
// c)	In main method create an object array of Person and handle the appropriate error
// d)	If object array is used beyond its limit, then print exception  
//  “Array can .t be used below or above its limit “and terminate 
// the program
// e)	If no exception then prints person details



// Class to represent a person with name and age properties
class Person {
  // Private fields for name and age
  private String name;
  private int age;

  // Getter and setter methods for name and age
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

// Test class to create an object array of Person and handle errors
class PersonTest1 {
  public static void main(String[] args) {
    // Create an array of Person objects with a fixed size
    Person[] people = new Person[10];

    // Try to access the array beyond its limit
    try {
      people[10] = new Person();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array cannot be used below or above its limit");
      return;
    }

    // If no exception, print the details of each person
    for (Person person : people) {
      System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
  }
}
