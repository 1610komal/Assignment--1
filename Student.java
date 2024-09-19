package komjava;


class Studentc {
	 // Attributes of the Student class
	 private String name;
	 private int age;
	 private char grade;

	 // Constructor to initialize the attributes
	 public Studentc(String name, int age, char grade) {
	     this.name = name;
	     this.age = age;
	     this.grade = grade;
	 }

	 // Method to display student details
	 public void displayDetails() {
	     System.out.println("Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Grade: " + grade);
	     System.out.println(); // Print a blank line for readability
	 }
	}

	//Main class to test the Student class
	public class Student {
	 public static void main(String[] args) {
	     // Create multiple Student objects
	     Studentc student1 = new Studentc("Pawan", 20, 'A');
	     Studentc student2 = new Studentc("Sohit", 21, 'B');
	     Studentc student3 = new Studentc("Chicku", 22, 'C');

	     // Display the details of each student
	     System.out.println("Student 1 Details:");
	     student1.displayDetails();

	     System.out.println("Student 2 Details:");
	     student2.displayDetails();

	     System.out.println("Student 3 Details:");
	     student3.displayDetails();
	 }
	}