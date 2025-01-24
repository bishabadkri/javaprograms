import java.util.Scanner;

public class LoveCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the names of the two people
        System.out.println("Welcome to the Love Calculator!");
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        // Calculate a love percentage
        int loveScore = calculateLoveScore(name1, name2);

        // Display the result
        System.out.println("\nCalculating love percentage...");
        System.out.println("💖 " + name1 + " and " + name2 + " are " + loveScore + "% compatible! 💖");

        scanner.close();
    }

    // Method to calculate a "love score"
    private static int calculateLoveScore(String name1, String name2) {
        String combinedNames = name1.toLowerCase() + name2.toLowerCase();
        int score = 0;

        // Add up the ASCII values of characters in the names
        for (int i = 0; i < combinedNames.length(); i++) {
            score += combinedNames.charAt(i);
        }

        // Reduce the score to a percentage (0-100)
        return score % 101;
    }
}
