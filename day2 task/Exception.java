public class Exception{
    public static void main(String args[]){
        int a=10, b=23, c;
        try {
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
          System.out.println("can't devide by zero");
        }
        System.out.println("main method ended");
    }
}
