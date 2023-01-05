package Week8.RandomGeneration;

import java.util.Random;



public class Program {
    

    public static void main(String[] args) {
        // double random =  Math.random();
        // System.out.println("Random number is "+random);
        // int number = (int)(Math.round( random * 100));
        // System.out.println(number);

        Random random = new Random();

        // String p = "cash-on-delivery";
        // String p = "cashOnDelivery";
        // String p = "cod";

        PaymentMode p = PaymentMode.MOBILE_BANKING;
        

        for (PaymentMode m : PaymentMode.values()) {
            System.out.println(m.toString().replaceAll("_", " "));
        }

        // System.out.println(random.nextInt(500));
    }

}
