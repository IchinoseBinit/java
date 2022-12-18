package CustomCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Collections;

public class CollectionInterfaceList {
    // List
    // initialize and declare

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();
        Stack<Integer> myStack = new Stack<>();

        list.add("e");
        list.add("Rajesh");
        System.out.println(list);
        

        integers.add(1);
        integers.add(12);
        integers.add(5);
        integers.add(21);
        integers.add(18);
        integers.add(15); 
        integers.add(21); 

        // System.out.println( integers.get(5));
        // System.out.println(integers.isEmpty());
        // System.out.println(integers.remove(1));
        // System.out.println(integers.size());
        // System.out.println(integers.indexOf(21));
        // System.out.println(integers.lastIndexOf(21));


        System.out.println(integers);

        // Comparator
        Collections.sort(integers);
        Collections.reverse(integers);
        // integers.asSet().toList()


        System.out.println(integers);
    }

    public static void getListData(List<Integer> integers) {

    }
}
