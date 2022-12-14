public class SeprateWord {
  public static void main(String[] args) {
    // The given string
    String str = "this is the best format";
    // Split the string into an array of words
    String[] words = str.split(" ");
    // Loop through the array of words
    for (String word : words) {
      // Print the word and the number of characters in the word
      System.out.println(word + " : " + word.length());
    }
  }
}


//Write program to separate the words from the given string, count number of characters 
//in each word and display in the below format.
//  e.g.  given string is " this is the best format" 
//  output:
//         this : 4
//        is   :  2
//       the  :  3
//       best :  4
//     format : 6