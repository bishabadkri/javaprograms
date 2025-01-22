import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for easier comparison

        int vowels = 0, consonants = 0;
        StringBuilder vowelChars = new StringBuilder();
        StringBuilder consonantChars = new StringBuilder();

        // Loop through the characters of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                    vowelChars.append(ch).append(" ");
                } else {
                    consonants++;
                    consonantChars.append(ch).append(" ");
                }
            }
        }

        // Display the results
        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Vowels: " + vowelChars.toString().trim());
        System.out.println("Total number of consonants: " + consonants);
        System.out.println("Consonants: " + consonantChars.toString().trim());

        scanner.close();
    }
}
