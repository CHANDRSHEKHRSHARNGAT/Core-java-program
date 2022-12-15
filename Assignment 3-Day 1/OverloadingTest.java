// Create class  OverloadingTest , add three methods as given below
// 1. public  int getResult(int a , int b) return the addition
// 2. public int getResult (int a , float b) return addition
// 3. public int getResult(float a , double b) return addition
// create main method in the same class  , create object of the OverloadingTest class
// call the method getResult(float a , double b) and get the result

public class OverloadingTest {
  // Method 1: accepts two integer arguments and returns the sum
  public int getResult(int a, int b) {
    return a + b;
  }
  // Method 2: accepts an integer and a float, and returns the sum
  public float getResult(int a, float b) {
    return a + b;
  }
  // Method 3: accepts a float and a double, and returns the sum
  public double getResult(float a, double b) {
    return a + b;
  }
  public static void main(String[] args) {
    OverloadingTest test = new OverloadingTest();
    // Call the third method: getResult(float a, double b)
    double result = test.getResult(1.0f, 2.0);

    System.out.println(result); // Output: 3.0
  }
}
