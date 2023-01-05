package Week6;

public class CustomStringBuffer {
    // append
    // insert
    // replace
    // delete
    // deleteCharAt
    // reverse
    // charAt
    // setCharAt
    // setLength
    // ensureCapacity
    // length
    // capacity

    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("Hello");
        System.out.println(sBuffer);


        sBuffer.append(" world");
        System.out.println(sBuffer);

        sBuffer.insert(5 , " Binit");
        System.out.println(sBuffer);

        sBuffer.replace(0, 5, "hi");
        System.out.println(sBuffer);

        sBuffer.delete(0, 2);
        System.out.println(sBuffer);
        sBuffer.deleteCharAt(0);
        System.out.println(sBuffer);

        

    //     reverse
    // // charAt
    // // setCharAt
    // // setLength

        // sBuffer.reverse();
        // System.out.println(sBuffer);

        System.out.println(sBuffer.charAt(0));
        sBuffer.setCharAt(9, 'L');
        System.out.println(sBuffer);

        System.out.println(sBuffer.length());
        // sBuffer.setLength(20);
        // System.out.println(sBuffer.length());
        
        sBuffer.ensureCapacity(30);
        sBuffer.replace(0, sBuffer.length(), "n");
        System.out.println(sBuffer.capacity());
        
        // pool / pooling
        // immutable
        // mutable
    }
}
