public class SortedArrayCheck {
    public static void main(String[] args) {
    int[] array = {1, 2, 4, 7, 9}; // Sorted array
    //int[] array = {1, 5, 3, 7, 9}; // Unsorted array
    boolean isSorted = true;
    
    for (int i = 0; i < array.length - 1; i++) {
    if (array[i] > array[i + 1]) {
    isSorted = false;
    break;
    }
    }
    
    System.out.println("Array is sorted: " + isSorted);
    }
    }