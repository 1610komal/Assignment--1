package komjava;
 import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int fact=1 , i=1;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = s1.nextInt();
		while(i<=num) {
			fact=fact*i;
			i++;
		}
		
   System.out.println("The factorial of a number is:"+ fact);

}
}
