import java.util.Scanner;

public class Movies {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your favorite movie: ");
    String movie = in.nextLine();
    System.out.println("Enter your favorite book: ");
    String book = in.nextLine();

    System.out.println("Your favorite movie is " + movie + " and it has " + movie.length() + " characters.");
     System.out.println("Your favorite book is " + book + " and it has " + book.length() + " characters.");
  }
}

// write java code below to take input and 
// print your favorite movie and book.
// also print the length of character for each of them.