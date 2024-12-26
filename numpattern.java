/*wap to print the following pattern
9 8 7 
8 7 6 
7 6 5*/
import java.util.Scanner;

public class numpattern {
    public static void main(String[] args) {
        // Loop to control the rows
        for (int i = 9; i >= 7; i--) {
            // Loop to control the columns
            for (int j = i; j >= i - 2; j--) {
                System.out.print(j + " "); // Print numbers in the same row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
