public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A is source, C is destination, B is auxiliary
    }

    public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
        // Base case: If there's only 1 disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move top n-1 disks from source to auxiliary
        solveTowerOfHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from auxiliary to destination
        solveTowerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
