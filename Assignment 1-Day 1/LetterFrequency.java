// Write a java program to design a utility class, 
// which inputs a word and outputs number of 
// occurrences of each letter present in that word.
// Example – 
// Input – Management 
// Output –
// M = 2
// A = 2
// N = 2
// G = 1
// E = 2
// N = 2
// T =1

import java.util.HashMap;
import java.util.Map;
public class LetterFrequency {
  public static void main(String[] args) {
    String word = "Management";
    Map<Character, Integer> letterFrequency = new HashMap<>();
    for (char c : word.toCharArray()) {
      if (letterFrequency.containsKey(c)) {
        letterFrequency.put(c, letterFrequency.get(c) + 1);
      } else {
        letterFrequency.put(c, 1);
      }
    }
    for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }
}
