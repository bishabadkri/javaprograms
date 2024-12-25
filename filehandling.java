import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // 1. Create a file
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // 2. Write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is an example of file handling in Java.\n");
            writer.write("Enjoy learning Java!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // 3. Read from the file
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            System.out.println("File content:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        // 4. Delete the file
        try {
            File file = new File(fileName);
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}
