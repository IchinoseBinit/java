package PasswordGenerator;

import java.util.Random;

public class Program {
    
    private static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        String password = "";
        String asciNumber = "";
        for (int i=0; i< PASSWORD_LENGTH; i++) 
        {
            int number = (new Random()).nextInt(10);
            asciNumber += number + " ";
            char a =  (char) number;
            password += a;
        }
        System.out.println(asciNumber);
        System.out.println(password);
        
    }

}
