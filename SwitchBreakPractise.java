import java.util.Scanner;

public class SwitchBreakPractise{
 public static void main(String[] args) { 
    Scanner sc= new Scanner(System.in);
    int button = sc.nextInt();
    switch (button) {
        case 1:System.out.println("chand");    
            break;
        case 2:System.out.println("chhotelal");
            break;
        case 3:System.out.println("sharnagat");
            break;
            case 4:System.out.println("kawaditola");
            break;
            default:System.out.println("invalid button");
        } 
    }
}


///(initialization , condition, updation)
//for(int i=0 ;i<=20;i