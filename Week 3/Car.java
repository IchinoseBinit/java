import java.util.ArrayList;

public class Car {

    public String name;
    public double price;
    public String brand;
    public String color;
    public ArrayList<String> features;

    public Car(String name, double price, String brand, String color, ArrayList<String> features) {

        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.features = features;

    }
}