import java.util.ArrayList;

class TryCatch {
    public static void main(String[] args) {

        try {
            ArrayList<String> names =  new ArrayList<>();
            names.add("Binit");
            names.add("Jenith");
            names.add("Sujan");
            names.add("Pujan");

            System.out.println(names);

            System.out.println(names.get(0));
            System.out.println("The size is "+names.size());

            

            names.add("Clarke");
            System.out.println(names.get(4));
            System.out.println("The size is "+names.size());
        } catch(Exception ex) {
            System.out.println("You are trying to access the index which is not present in the list");
        } finally {

            display();
        }
    }

    public static void display() {
        System.out.println("The program has ended successfully");
    }
}