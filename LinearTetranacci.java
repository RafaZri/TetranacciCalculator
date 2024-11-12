/**
 * LinearTetranacci calculates the Tetranacci numbers iteratively.
 * This implementation is efficient with linear time complexity.
 */
public class LinearTetranacci {

    /**
     * Calculates the nth Tetranacci number using an iterative approach.
     * @param n The position of the Tetranacci number to calculate.
     * @return The nth Tetranacci number.
     */
    public static long linearTet(long n) {
        // Base cases: first three terms are 0, fourth term is 1
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }
        if (n == 3) {
            return 1;
        }

        // Initialize the first four terms of the sequence
        long a = 0, b = 0, c = 0, d = 1;
        long result = 0;

        // Iteratively calculate Tetranacci up to n
        for (long i = 4; i <= n; i++) {
            result = a + b + c + d;  // calculate next Tetranacci number
            a = b;                   // shift values
            b = c;
            c = d;
            d = result;
        }
        return result;
    }

    public static void main(String[] args) {
        // Calculate Tetranacci numbers at increments of 5 and print the result and time taken
        for (int i = 5; i <= 50; i += 5) {
            long start = System.currentTimeMillis();       // start time
            long tetNumber = linearTet(i);                 // calculate Tetranacci number
            long end = System.currentTimeMillis();         // end time
            long timeDif = end - start;                    // calculate time difference

            System.out.println("n = " + i + ", Tetranacci number = " + tetNumber + ", time in ms = " + timeDif);
        }
    }
}
