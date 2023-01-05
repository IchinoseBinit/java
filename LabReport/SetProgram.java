package LabReport;

import java.util.HashSet;
import java.util.Scanner;

public class SetProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        while (end < input.length()) {
            char c = input.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                end++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }

        System.out.println("The longest substring with unique characters is: " + input.substring(end - maxLength, end));
        scanner.close();
    }
}