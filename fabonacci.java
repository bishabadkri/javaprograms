public class Fibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative method to print Fibonacci series
    public static void fibonacciIterative(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < terms; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to display
        System.out.println("Recursive Fibonacci (10th term): " + fibonacciRecursive(9)); // 10th term
        fibonacciIterative(terms);
    }
}
