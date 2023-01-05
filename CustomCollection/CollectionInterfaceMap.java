package CustomCollection;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class CollectionInterfaceMap {
    // List
    // initialize and declare

    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable<>();
        hashtable.put("name", "Rajesh");
        hashtable.put("age", "22");
        hashtable.put("skill", "null");
        System.out.println(hashtable);
        hashtable.remove("name");
        System.out.println(hashtable);
        System.out.println(hashtable.get("age"));
        System.out.println(hashtable.containsValue("22"));
        hashtable.clear();
        System.out.println(hashtable.size());
    }
}
