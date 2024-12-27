import java.util.Scanner;

public class FindDeletedCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter position to delete index): ");
        int pos = scanner.nextInt();

        if (pos >= 1 && pos <= str.length()) 
        {
            char ok = str.charAt(pos - 1);
            String y = str.substring(0, pos - 1) + str.substring(pos);

            System.out.println("Deleted character: " + ok);
            System.out.println("Modified string: " + y);
        } 
        else
         {
            System.out.println("Invalid position!");
        }
    }
}

