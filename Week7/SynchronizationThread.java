package Week7;

public class SynchronizationThread {
    int amount = 0;

    synchronized void deposit(int amt) {
        System.out.println("The amount is deposited, Rs."  + amt);
        amount += amt;
        System.out.println("Total Balance is "+amount);
        notifyAll();
    }

    synchronized void withdraw(int amt) {
        if (amount < amt) {
            System.out.println("Your balance is less, Please recharge first");
            try {
                wait();
            } catch(Exception e) {
                System.out.println(e.toString());
            }
            amount -= amt;
            System.out.println("The amount is withdrawn, Rs. "+ amt );
            System.out.println("Your total balance is, Rs." + amount);
        }
    }
}
