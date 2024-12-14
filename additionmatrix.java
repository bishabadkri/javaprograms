import java.util.Scanner;

public class additionmatrix {
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int brr[][] = new int[2][2];
        Scanner ob = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter the first array's elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = ob.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter the second array's elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                brr[i][j] = ob.nextInt();
            }
        }

        // Matrix addition
        int sum[][] = new int[2][2];
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = arr[i][j] + brr[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }

        ob.close();
    }
}
