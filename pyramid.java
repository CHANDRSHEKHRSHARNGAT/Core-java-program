public class pyramid {
    public static void main(String[] args) {
       // int height = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
    }
    System.out.println();
        }
    }   
}




