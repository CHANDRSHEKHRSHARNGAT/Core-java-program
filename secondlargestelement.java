import java.util.Arrays;
public class secondlargestelement {      
        public static void main(String[] args) { 
        int a[] = {1,23,3,49,53,27,6,24,38};
        Arrays.sort(a);
        int num = a[a.length -2 ];
        System.out.println(num);
        
  }
}

