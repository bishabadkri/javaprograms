/* Find the second highest number without using Arrays.sort */
/* Input:
arr = {34, 12, 89, 5, 65, 89}

Output:
Second Highest Number is: 65 */
public class Second_HIGHEST {
    public static void main(String[] args) {
        int[] arr = {34, 12, 89, 5, 65, 89};
        int max = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int second_highest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second_highest = max; // Update second highest before max
                max = arr[i];
            } else if (arr[i] > second_highest && arr[i] < max) {
                second_highest = arr[i];
            }
        }

        if (second_highest == Integer.MIN_VALUE) {
            System.out.println("Second highest number not found.");
        } else {
            System.out.println("Second Highest Number is: " + second_highest);
        }
    }
}