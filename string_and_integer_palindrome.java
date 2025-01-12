import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if a number is a palindrome
    public static boolean isNumberPalindrome(int number) {
        int original = number, reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return original == reverse;
    }

    // Method to check if a string is a palindrome
    public static boolean isStringPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number palindrome check
        System.out.print("Enter a number to check for palindrome: ");
        int number = scanner.nextInt();
        System.out.println(number + " is palindrome? " + isNumberPalindrome(number));

        // String palindrome check
        System.out.print("Enter a string to check for palindrome: ");
        scanner.nextLine(); // Consume newline
        String str = scanner.nextLine();
        System.out.println(str + " is palindrome? " + isStringPalindrome(str));

        scanner.close();
    }
}
