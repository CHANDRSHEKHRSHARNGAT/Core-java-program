import java.util.Scanner;
 public class ConditionSwitch{
     public static void main(String... args){
        System.out.println("Enter your number");
        Scanner sc= new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if(button==2){
            System.out.println("namste");
        }else if(button==3){
            System.out.println("bajingo");
        }    
    }
}