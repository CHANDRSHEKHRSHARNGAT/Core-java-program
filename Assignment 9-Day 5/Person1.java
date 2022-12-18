// Program   to Handle NullPointerException
// a) create class Person with method display ()
//   Which displays message ‘I am fine”
// b) Create lass PersonTest with main entry point
// c) In main method handle NullPointerException  for          Peron object creation
// d) If an object is not crated properly then handle the  
//    exception
// e) Print message “problem in creating person object”



class Person1 {
  public void display() {
    System.out.println("I am fine");
  }
}

class PersonTest {
  public static void main(String[] args) {
    try {
      // Create a new Person object
      Person1 person = new Person1();

      // Call the display method on the Person object
      person.display();
    } catch (NullPointerException e) {
      // Handle the NullPointerException
      System.out.println("Problem in creating person object");
    }
  }
}
