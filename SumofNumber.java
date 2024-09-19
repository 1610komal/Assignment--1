package komjava;
import java.util.Scanner;
public class SumofNumber {

	public static void main(String[] args) {
		
		 Scanner s1 = new Scanner(System.in);

	        System.out.print("Enter a positive integer : ");
	        int n = s1.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			 sum+=i;
		}
		 System.out.println("The sum of natural numbers:" +sum);
	}

}
