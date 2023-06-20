public class Exception{
    public static void main(String args[]){
        int a=34, b=0, c;
        try {
            c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e ) {
            System.out.println("can't divide by zero");
        }
        System.out.println("error found");
    }
}
