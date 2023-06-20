import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class removeduplicate {
public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(4);
list.add(3);
list.add(1);
list.add(2);
list.add(4);
list.add(5);

Set<Integer> set = new HashSet<Integer>();
set.addAll(list);
list.clear();
list.addAll(set);
System.out.println(list);

    }
}
