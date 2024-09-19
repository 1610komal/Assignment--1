package komjava;

public class ReversePrint {
	public static void main(String[] args) {
        int rows = 3; // Number of rows for the pattern

        // Outer loop for the number of rows
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }

            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line after printing all characters in a row
            System.out.println();
        }
    }
}
