package Week8.Packages;

import java.util.Scanner;
import java.lang.Math;

public class Program {
    public static void main(String[] args) {
        System.out.println("Welcome to Square root number system");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        double number = scanner.nextDouble();
        scanner.close();
        System.out.println("The number is "+Math.round(number));
    }
}
