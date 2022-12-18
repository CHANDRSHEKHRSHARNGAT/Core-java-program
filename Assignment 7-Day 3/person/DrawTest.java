// a)     Create an abstract class Shape which is having the abstract function draw ().
// b)     Create three more sub classes from Shape which is Circle, Triangle, Line
// c)      Override the display method inside all three classes printing a message
// d)     For circle  => “draw a circle” Triangle->” draw a triangle”    Line=> draw  Line
// e)     Create  DrawTestclass with  entry point main
// f)       Take input form user 1 to 3 
// g)     Give option for user  1 for Circle , 2 for triangle , 3 for Line  obj

package person;
import java.util.Scanner;

// Abstract class Shape with abstract method draw()
abstract class Shape {
    abstract void draw();
}

// Subclass Circle that extends the Shape class
class Circle extends Shape {
    // Overriding the draw() method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass Triangle that extends the Shape class
class Triangle extends Shape {
    // Overriding the draw() method
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

// Subclass Line that extends the Shape class
class Line extends Shape {
    // Overriding the draw() method
    @Override
    void draw() {
        System.out.println("Drawing a line");
    }
}

// DrawTest class with main method
public class DrawTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        
        System.out.println("Enter 1 for Circle, 2 for Triangle, or 3 for Line: ");
        option = sc.nextInt();
        
        // Creating the object of the corresponding class based on user input
        if (option == 1) {
            Shape circle = new Circle();
            circle.draw();
        } else if (option == 2) {
            Shape triangle = new Triangle();
            triangle.draw();
        } else if (option == 3) {
            Shape line = new Line();
            line.draw();
        } else {
            System.out.println("Invalid option");
        }
    }
}
