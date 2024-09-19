package komjava;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int limit = s1.nextInt();

        // Initialize the first two numbers of the Fibonacci series
        int a = 0, b = 1;
        
        System.out.print("Fibonacci sequence up to " + limit + ": ");

        // Loop to generate Fibonacci series
            System.out.print(a + " ");
            // Generate the next number in the sequence
            int next = a + b;
            a = b;
            b = next;
        }
    }

