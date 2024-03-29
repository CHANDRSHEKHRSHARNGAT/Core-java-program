import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
public class HashmapApp1 {
  public static void main(String args[]) {
//Creation
  HashMap<String, Integer> map = new HashMap<>();
//Insertion
  map.put("India", 120);
  map.put("US", 30);
  map.put("China", 150);
  map.put("China", 180);
  map.put("chanda", 22);
  System.out.println(map);
//Searching
   if(map.containsKey("Indonesia")) {
   System.out.println("key is present in the map");
   } 
  else {
   System.out.println("key is not present in the map");
  }
   System.out.println(map.get("China")); //key exists
   System.out.println(map.get("Indonesia")); //key doesn't exist
///////////////////////////////////////////////////////
//Iteration (1)
    for( Entry<String, Integer> e : map.entrySet()) {
    System.out.println(e.getKey());
    System.out.println(e.getValue());
 }
////////////////////////////////////////////////////////
// //Iteration (2)
    Set<String> keys = map.keySet();
    for(String key : keys) {
    System.out.println(key+ " " + map.get(key));
     }
   }
}