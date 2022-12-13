package FileHandling;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public int getId() {
        return id;
    }

    public boolean decreaseQuantity() {
        if(quantity >= 1) {
            quantity -- ;
            return true;
        } else {
            System.out.println("The book is not available");
            return false;
        }
    }

    public void increaseQuantity() {        
        quantity++;        
    }

    public Book(int id,String name, String author, int quantity ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public void display() {
        System.out.printf("%-5s | %-30s | %-20s | %-5s\n", id, name, author, quantity);
    }

    @Override
    public String toString() {
        return id+","+name +","+author+","+quantity+"\n";
    }

    // 1, Harry Potter, J.K. Rowling, 4
}
