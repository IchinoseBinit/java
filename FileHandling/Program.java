package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Program {

    static final String FILEPATH =
            "C:\\Users\\binit\\OneDrive\\Desktop\\java\\FileHandling\\content.txt";

    public static void main(String[] args) {
        try {           

            FileReader fileReader = new FileReader(FILEPATH);
            // classname    objectname  = keyword constructor (parametrized)

            BufferedReader bReader = new BufferedReader(fileReader);
            // classname    objectname  =    keyword    constructor

            // String line = bReader.readLine();
            
            // if (line != null) {
            //     System.out.println(line);
            // } else {
            //     System.out.println("The file is empty");
            // }

            // Iterator

            // POJO
            // Plain Old Java Objects

            ArrayList<Book> books = new ArrayList<>();

            
            Iterator<String> lines = bReader.lines().iterator();
            // lines.
            while(lines.hasNext()) {
                String[] details = lines.next().split(",");
                int id = Integer.parseInt(details[0].trim());
                int quantity = Integer.parseInt(details[3].trim());
                //       Deserialization
                Book book = new Book(id, details[1].trim(), details[2].trim(), quantity);
                books.add(book);
            } 
            bReader.close();
            fileReader.close();

            for(Book book: books) {
                book.display();
            }

            // 

            writeToFile(books);
            
            


        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("Cannot open file");
        }
    }

    public static void writeToFile(ArrayList<Book> books) {
        try {
        // Serialization
        FileWriter fileWriter = new FileWriter(FILEPATH);
        for (Book book : books) {
            fileWriter.write(book.toString());
        }
        System.out.println(":::---> Successfully written");
        fileWriter.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}
