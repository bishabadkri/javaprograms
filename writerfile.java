import java.io.*;
import java.util.Scanner;

public class writerfile {
    public static void main(String[] args) throws Exception {
        // Creating FileWriter object
        FileWriter writer = new FileWriter("D:\\output.txt");
        Scanner sc = new Scanner(System.in);

        // Taking numerical inputs and performing addition
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;

        // Writing sum to file
        writer.write("Sum of " + num1 + " and " + num2 + " is: " + sum + "\n");

        // Taking string input
        sc.nextLine();  // Consume newline left-over
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Asking for character index
        System.out.print("Enter index to extract character: ");
        int index = sc.nextInt();

        // Extracting and writing character to file
        if (index >= 0 && index < inputString.length()) {
            char extractedChar = inputString.charAt(index);
            writer.write("Character at index " + index + " is: " + extractedChar + "\n");
        } else {
            writer.write("Invalid index! Index must be between 0 and " + (inputString.length() - 1) + "\n");
        }

       
    }
}
