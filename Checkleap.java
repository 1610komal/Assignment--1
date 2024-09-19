package komjava;
 import java.util.Scanner;
 
public class Checkleap{
	 public void display() {
		 //take an input 
		 Scanner s1 = new Scanner(System.in);
		 System.out.println("Enter a year:" );
		 int  year = s1.nextInt();
	// check the condition whether a year is leap year or not
		 if((year%4==0) && ((year%100!=0)  || (year%400==0)) ){
	    	 System.out.print("This year is leap year");
	     }
	     else {
	    	 System.out.println("This year is  not a leap year");
	     }
	     
		}
	 

	public static void main(String[] args) {
		//create an object of class Checkleap 
		Checkleap obj = new Checkleap();
		//call the function
        obj.display();
     
	}
}
