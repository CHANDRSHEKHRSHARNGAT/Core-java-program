public class SubArray {
  public static void main(String[] args) {
    // The input array
    int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};

    // The subarray we are looking for lies between the indexes 3 and 8
    int startIndex = 3;
    int endIndex = 8;

    // Print the subarray
    for (int i = startIndex; i <= endIndex; i++) {
      System.out.println(array[i]);
    }
  }
}


// If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], 
// your program should be able to find that 
// the subarray lies between the indexes 3 and 8.