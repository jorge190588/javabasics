package oop;

public class OverrideExample {

	public static void main(String args[]) {
		// Override
		Animal animal  = new Animal();
		Dog dog = new Dog();
		animal.move();
		dog.move();
		dog.bark();
		dog.jump();
		
	}
}


/*Example of override*/
class Animal extends PrintInConsole{
	public void move() {
		print("Animal move");
	}
	
	public void jump() {
		print("Animal jump");
	}
}

class Dog extends Animal{
	public void move() {
		print("Dog move");
		super.move();
	}
	
	public void bark() {
		print("Dog bark");
	}
}