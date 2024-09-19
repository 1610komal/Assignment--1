package komjava;
 
// Create a superclass Animal
class Animal{
	 public void makeSound() {
		 System.out.println(" The Animals make a sound");
	 }
}

//Create a subclass Dog
 class Dog extends Animal{
	 public void makeSound() {
		 System.out.println(" The Dog barks");
	 }
 }
 //create another subclass Cat
 class Cat extends Dog{
	 public void makeSound() {
		 System.out.println(" The Cat meaws");
	 }
 }
 
 //Main class
public class Multilevel {

	public static void main(String[] args) {
		//create object of each class
		Animal obj = new Animal();
		Cat obj1 = new Cat();
		Dog obj2 = new Dog();
		obj.makeSound();
		obj1.makeSound();
		obj2.makeSound();

	}

}
