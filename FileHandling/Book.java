package FileHandling;

public class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id,String name, String author, int quantity ) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
        System.out.println("The author is "+author);
        System.out.println("The quantity is "+quantity);
    }

    @Override
    public String toString() {
        return id+","+name +","+author+","+quantity+"\n";
    }

    // 1, Harry Potter, J.K. Rowling, 4
}
