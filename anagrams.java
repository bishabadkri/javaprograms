import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Sort and compare the strings
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are the same and sorted strings match, they are anagrams
        if (str1.length() == str2.length() && sortString(str1).equals(sortString(str2))) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
        scanner.close();
    }

    // Helper method to sort a string
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
}
