/**
 * BinaryTetranacci calculates the Tetranacci numbers recursively.
 * This implementation is inefficient for large n due to exponential time complexity.
 */
public class BinaryTetranacci {

    /**
     * Calculates the nth Tetranacci number using recursion.
     * @param n The position of the Tetranacci number to calculate.
     * @return The nth Tetranacci number.
     */
    public static long binaryTet(long n) {
        // Base cases: first three terms are 0, fourth term is 1
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }
        // Recursive calculation for Tetranacci
        return binaryTet(n - 1) + binaryTet(n - 2) + binaryTet(n - 3) + binaryTet(n - 4);
    }

    public static void main(String[] args) {
        // Calculate Tetranacci numbers at increments of 5 and print the result and time taken
        for (int i = 5; i <= 50; i += 5) {
            long start = System.currentTimeMillis();       // start time
            long tetNumber = binaryTet(i);                 // calculate Tetranacci number
            long end = System.currentTimeMillis();         // end time
            long timeDif = end - start;                    // calculate time difference

            System.out.println("n = " + i + ", Tetranacci number = " + tetNumber + ", time in ms = " + timeDif);
        }
    }
}
