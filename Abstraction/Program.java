package Abstraction;

public class Program {

    public static void main(String[] args) {
    }

    public static void print(Bird bird) {
        bird.eat();
        bird.run();
    }
    public static void printFlightFulBird(FlightFulBird flightFulBird) {
        flightFulBird.fly();
        
    }
    
}
