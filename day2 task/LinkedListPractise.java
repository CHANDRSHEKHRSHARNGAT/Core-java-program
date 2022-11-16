
import java.util.*;


import java.util.LinkedList;

class Main {
  public static void main(String[] args){

    LinkedList<String> animals = new LinkedList<>();

    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    // add() index parameter
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);

    // change elements at index 3
    animals.set(3, "Horse");
    System.out.println("Updated LinkedList: " + animals);

    //remove

    String str = animals.remove(1);
    System.out.println("Removed Element: " + str);
  }
}

  
    