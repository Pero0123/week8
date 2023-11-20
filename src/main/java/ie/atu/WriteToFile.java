package ie.atu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

    public static void main(String[] args) {
        //specify the file name
        String fileName = "File13.txt";

        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("traffic gonna be cat");

            System.out.println("content successfully written to the file");
        }
        catch (IOException e) {
            System.out.println("an error occurred while creating the file");
            e.printStackTrace();
        }

    }
}