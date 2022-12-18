// Write a Java program to create two sets ,
//  then compare them with each other 
// and retain elements which are same on both sets.

import java.util.HashSet;
import java.util.Set;

public class Retain{
  public static void main(String[] args) {
    // Create two sets
    Set<String> set1 = new HashSet<>();
    Set<String> set2 = new HashSet<>();

    // Add elements to the sets
    set1.add("apple");
    set1.add("banana");
    set1.add("orange");

    set2.add("banana");
    set2.add("pear");
    set2.add("strawberry");

    // Retain the elements that are common to both sets
    set1.retainAll(set2);

    // Print the resulting set
    System.out.println(set1);
  }
}
