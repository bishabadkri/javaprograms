import java.util.Scanner;

public class timeconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        int minutes = hours * 60;
        int seconds = hours * 3600;

        System.out.println(hours + " hours is equal to:");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");

        scanner.close();
    }
}
