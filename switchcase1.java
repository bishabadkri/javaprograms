import java.util.Scanner;

public class switchcase1 {

    public static void func1() {
        int a = 2;
        int b = 3;
        int c = a + b;
        System.out.println("The sum is...... " + c);
    }

    public static void func2() {
        int a = 2;
        int b = 3;
        int c = a * b;
        System.out.println("The product is:" + c);
    }

    public static void func3() {
        Scanner ob = new Scanner(System.in);

        int m;
        System.out.println("Enter the marks of all students in java");

        for (int i = 1; i <= 5; i++) {
            m = ob.nextInt();
            System.out.println(" the marks of all students in java" + m);
        }
        ob.close();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter a choice (1-6) or 0 to exit:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    func1();
                    break;
                case 2:
                    func2();
                    break;
                case 3:
                    func3();
                    break;
                case 4:
                    System.out.println("hello444");
                    break;
                case 5:
                    System.out.println("hello555");
                    break;
                case 6:
                    System.out.println("hello666");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid!!!!!!Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
