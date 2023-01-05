package Week7;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i< 5; i++) {
            System.out.println("Running from "+getName() + " and the value is "+i);
        }
        System.out.println("Finished execution of "+getName());
    }
    
}
