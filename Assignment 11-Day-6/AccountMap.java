// Write a program to store Account number and name 
// in HashMap and sort HashMap by keys?


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javafx.print.Collation;

public class AccountMap {
  public static void main(String[] args) {
    // Create a HashMap to store the account numbers and names
    Map<Integer, String> accounts = new HashMap<>();
    
    // Add some accounts to the map
    accounts.put(123456, "chand Bhatiya");
    accounts.put(987654, "Janifer duby");
    accounts.put(111111, "jonathn Smith");
    accounts.put(222222, "surya Johnson");
    
  
    // Sort the map by keys using a TreeMap
    Map<Integer, String> sortedAccounts = new TreeMap<>(accounts);
    
    // Print the sorted map
    for (Map.Entry<Integer, String> entry : sortedAccounts.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
