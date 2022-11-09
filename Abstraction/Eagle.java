package Abstraction;

public class Eagle implements Bird, FlightFulBird{
    public void eat() {
        System.out.println("The eagle is eating");
    }

    public void run() {
        System.out.println("The eagle is running");
    }

    public void fly() {
        System.out.println("The eagle is flying");
    }
}
