import java.util.Arrays;

public class QuickSortExample {

    // Function to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Function to partition the array and return the pivot index
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index for the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap the pivot element with the element at i + 1
        swap(array, i + 1, high);
        return i + 1; // Return the pivot index
    }

    // Function to swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main function to test the QuickSort implementation
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
