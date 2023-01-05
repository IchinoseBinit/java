package Week7;

public class Print{

    int id;

    public Print(int id) {
        this.id = id;
    }
    
    public void run() {
        for (int i = 0; i< 5; i++) {
            System.out.println("Running from "+id + " and the value is "+i);
        }
        System.out.println("Finished execution of "+id);
    }
    
}
