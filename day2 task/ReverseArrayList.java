import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseArrayList {  
    public static void main(String[] args) {  
        List<String> list = new ArrayList<String>();  
        list.add("india");  
        list.add("chaina");
        list.add("UK");  
        list.add("UK");  
        list.add("Japan"); 
        list.add("Japan");

        System.out.println("Before Reversing");  
        System.out.println(list.toString());  
          
        Collections.reverse(list);  
        System.out.println("After Reversing");  
        System.out.println(list); 

        System.out.println("remove duplicate element");
        Set<String> s = new LinkedHashSet<String>(list);  
        System.out.println(s); 
    }  
} 