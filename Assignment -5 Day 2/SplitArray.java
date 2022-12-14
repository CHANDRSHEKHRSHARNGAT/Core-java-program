import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        // create an array of integers
        int[] array = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};

        // calculate the length of each part of the split array
        int length1 = array.length / 2;
        int length2 = array.length - length1;

        // create two arrays to store the split elements
        int[] array1 = new int[length1];
        int[] array2 = new int[length2];

        // copy the elements from the initial array to the split arrays
        for (int i = 0; i < length1; i++) {
            array1[i] = array[i];
        }
        for (int i = 0; i < length2; i++) {
            array2[i] = array[length1 + i];
        }

        // print the split arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
    }
}


//Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays. E.g.-
// INITIAL array :
// 58	24	13	15	63	9	8	81	1	78
// After spliting :
// 58	24	13	15	63
// 9	8	81	1	78
