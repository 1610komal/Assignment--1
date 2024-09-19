package komjava;

public class StarPattern {
    public static void main(String[] args) {
        int num = 4; 

        // Outer loop for the number of rows
        for (int i = 1; i <= num; i++) {
            // Inner loop to print stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing all stars in a row
            System.out.println();
        }
    }
}
