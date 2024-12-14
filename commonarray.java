import java.util.Scanner;

public class commonarray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int arr[][] = new int[2][2];
        
        // Input elements of the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = ob.nextInt();
            }
        }
        
        int brr[][] = new int[2][2];
        
        // Input elements of the second array
        System.out.println("Enter the elements of the second array:");
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                brr[k][l] = ob.nextInt();
            }
        }
        
        // Display common elements
        System.out.println("The common elements are:");
        int count = 0; // To track if any common elements are found
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for(int k=0;k<2;k++)
                { 
                    for(int l=0;l<2;l++)
                    {

                    
                if (arr[i][j] == brr[k][l]) {
                    System.out.println(arr[i][j]);
                    count++;
                }
            }
        }
        }

        }
        
        // If no common elements are found
        if (count == 0) {
            System.out.println("No common elements found.");
        }
        
        ob.close();
    }
}
