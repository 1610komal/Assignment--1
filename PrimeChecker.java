package komjava;

import java.util.Scanner;

public class PrimeChecker {
	    public static void main(String[] args) {
	        Scanner s1 = new Scanner(System.in);
	        
	        System.out.print("Enter a positive integer: ");
	        int num = s1.nextInt();

	        // Check if the number is prime
	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false; // Numbers less than or equal to 1 are not prime
	        } else {
	            // Check for factors from 2 to the number - 1
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    isPrime = false; // Number is divisible by i, so it is not prime
	                    break; // Exit the loop early
	                }
	            }
	        }
	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }

	    }
	}