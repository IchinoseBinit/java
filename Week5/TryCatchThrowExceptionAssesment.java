import java.util.Scanner;

public class TryCatchThrowExceptionAssesment {

    public static void main(String[] args) {
        try {
           System.out.println("The number is " + getInput());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int getInput() throws Exception {
        try {
            System.out.println("Enter a number");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            return num;
        } catch (Exception ex) {
            throw new Exception("Please enter a valid number");
        }
    }
}
