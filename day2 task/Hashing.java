import java.util.HashSet;

public class Hashing{

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(8);
        System.out.println(set);
        
        set.remove(3);
        System.out.println(set);
    }
}