package Week6;

public class StringClass {
    public static void main(String[] args) {
        try {

            // charAt() -> gets char in the given index in a string
            // indexOf() -> gets index of a char
            // toLowerCase()
            // toUpperCase()
            // length()
            // contains()
            // substring()
            // trim()
            // replace()
            // compareTo()
            // equalsIgnoreCase()

            String name = " Suneeel   Thapa ";
            String[] list = name.trim().split(" ");
            String goodName = "";
            for (String ss : list) {
                if (!ss.isEmpty()) {
                    goodName = goodName + " " + ss;
                }
            }
            System.out.println(goodName.trim());

        } catch (Exception ex) {
            System.out.println("Error detected");
        }

    }
}
