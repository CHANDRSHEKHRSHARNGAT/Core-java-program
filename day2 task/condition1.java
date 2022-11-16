import java.util.Scanner;
public class condition1{
    public static void main(String args[]){
        System.out.println("Enter your number");    
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }else if(a>b){
            System.out.println("a is grather");
        }else{
            System.out.println("a is lesser");
        }
    }
}