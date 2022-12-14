public class SumProduct {
    public static void main(String[] args) {
        // create an array of integers
        int[] array = {1, 2, 3, 4, 5};

        // calculate the sum and product of the array elements
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            product *= array[i];
        }

        // print the sum and product of the array elements
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}


//Write a program to find the sum and product of all elements of an array.