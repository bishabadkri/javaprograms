import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner ob = new Scanner(System.in);

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ob.nextInt();
        }

        // Sorting in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // Swap if the current element is greater than the next element
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("The ascending order of the elements of the array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
