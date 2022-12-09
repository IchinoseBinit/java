package FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Iterator;

public class Program {

    public static void main(String[] args) {
        try {
            String filePath =
            "C:\\Users\\binit\\OneDrive\\Desktop\\java\\FileHandling\\content.txt";


            // FileReader fileREader = new FileReader(filePath);

            // BufferedReader bReader = new BufferedReader(fileREader);

            // String line = bReader.readLine();

            // Iterator<String> lines = bReader.lines().iterator();
            // // lines.hasNext()

            // if (line != null) {
            //     System.out.println(line);
            // } else {
            //     System.out.println("The file is empty");
            // }

            // while(lines.hasNext()) {
            //     System.out.println(lines.next());
            // } 
            // bReader.close();
            // fileREader.close();

            // FileOutputStream output = new FileOutputStream(filePath);

            // if ("binit".equals( "binit")) {
            // System.out.println("true");
            // }

            // int abc = 123453;

            // output.write( (byte) abc);
            // output.close();
            // System.out.println("File written successfully");

            // FileInputStream input = new FileInputStream(filePath);

            // int data = input.read();
            // System.out.println((char) data);

            // int b = 12;
            // System.out.println((char) b);
            // // Character Stream
            // FileReader fileReader = new FileReader(filePath);
            FileWriter fileWriter = new FileWriter(filePath, true);

            // BufferedReader buffer = new BufferedReader(fileReader);
            // String line = buffer.readLine();

            // if (line != null) {
            // System.out.println(line);
            // String[] array = line.split(",");
            // for (String s : array) {

            // System.out.println (s);
            // }
            // } else {
            // System.out.println("The file is empty");
            // }

            // fileWriter.write(line);
            fileWriter.write("\n, Sunil is an irregular student");
            System.out.println(":::---> Successfully written");
            fileWriter.close();
            // fileReader.close();
            // buffer.close();

            // -------------------------------


        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("Cannot open file");
        }
    }

}
