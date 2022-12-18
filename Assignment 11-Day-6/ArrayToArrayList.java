import java.util.ArrayList;

public class ArrayToArrayList {
  public static void main(String[] args) {
    // Create the arrays
    int[] intArray = {1, 2, 3, 4, 5};
    String[] stringArray = {"apple", "banana", "orange"};

    // Convert the arrays to ArrayLists
    ArrayList<Integer> intList = new ArrayList<Integer>();
    for (int i : intArray) {
      intList.add(i);
    }
    ArrayList<String> stringList = new ArrayList<String>();
    for (String s : stringArray) {
      stringList.add(s);
    }

    // Print the ArrayLists
    System.out.println(intList);
    System.out.println(stringList);
  }
}


// Note: In Java 8 and later, you can use the Arrays.stream() 
// method to convert an array to an 
// ArrayList more easily, like this:

// ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArray));
// ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(stringArray));