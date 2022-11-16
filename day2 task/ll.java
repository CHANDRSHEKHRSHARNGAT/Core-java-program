import java.util.ArrayList;
import java.util.Collections;


public class ll{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(7);
        System.out.println(list);

        int element = list.get(1);
        System.out.println(element);

        list.add(1,2);
        System.out.println(list);

        list.set(1,5);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }

    public static void add(int i, String string) {
    }
    
} 