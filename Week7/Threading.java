package Week7;

public class Threading {    
    public static void main(String[] args) {
        try {
        MyThread mThreadOne = new MyThread();
        MyThread mThreadTwo = new MyThread();
        MyThread mThreadThree = new MyThread();
        mThreadOne.setPriority(10);
        mThreadTwo.setPriority(5);
        mThreadThree.setPriority(1);
        // obj.setPriority(10);
        // obj.setPriority(5);
        // obj.setPriority(2);
        mThreadOne.start();
        mThreadTwo.start();
        mThreadThree.start();

        // Print pOne = new Print(1);
        // Print pTwo = new Print(2);
        // Print pThree = new Print(3);

        // pOne.run();
        // pTwo.run();
        // pThree.run();

        // 
        } catch (Exception ex) {

        }
    }


    
}
