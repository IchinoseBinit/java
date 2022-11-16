public class ThrowsException {

    public static void main(String[] args) {
        try {
            display();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    // public static void display() {
    public static void display() throws Exception {
        throw new Exception("Hello world");
        // System.out.println("null");
    }

    // psvm -> getInput();
    // with try catch

    // getInput method with try catch
    // int returnType
    // scanner to take number
    // input name
    // return num
    // catch throw Exception()
    
}
