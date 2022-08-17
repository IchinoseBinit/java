import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Welcome to the addition program");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double secondNumber = scanner.nextDouble();
        
        Output myOutput = new Output();
        Output.getMyName();
        System.out.println(myOutput.getDetails(firstNumber, secondNumber));
        scanner.close();
    }
}