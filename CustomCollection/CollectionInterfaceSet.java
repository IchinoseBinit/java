package CustomCollection;

import java.util.HashSet;
import java.util.Set;

public class CollectionInterfaceSet {
    // List
    // initialize and declare

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet();

        

        integers.add(1);
        integers.add(12);
        integers.add(5);
        integers.add(21);
        integers.add(18);
        integers.add(15); 
        integers.add(21); 

        System.out.println(integers);
        
        System.out.println( integers.remove(21));
        System.out.println(integers);
        System.out.println(integers.isEmpty());
        System.out.println(integers.remove(1));
        System.out.println(integers.size());
        // System.out.println(integers.indexOf(21));
        // System.out.println(integers.lastIndexOf(21));

    }

}
