// Write a java class to demonstrate AssertException.

public class AssertionErrorDemo {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    assert x > y : "Error: x is not greater than y";
    System.out.println("This line of code will not be executed");
  }
}
