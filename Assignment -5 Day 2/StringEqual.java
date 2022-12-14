public class StringEqual {
  public static void main(String[] args) {
    // Create two StringBuffer objects
    StringBuffer firstObject = new StringBuffer("java");
    StringBuffer secondObject = new StringBuffer("java");

    // Compare the objects for equality
    if (firstObject.equals(secondObject)) {
      System.out.println("The objects are equal.");
    } else {
      System.out.println("The objects are not equal.");
    }
  }
}
