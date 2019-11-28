package oop;


public class PolymorphismExample {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
	// Polymorphism
	Deer deer = new Deer();
	Animals animal = deer;
	Vegetarian vegetarian = deer;
	Object object = deer;
	
	animal.jump();
	animal.move();
	}
}


/*Polymorphism: is the ability of an object to take on many forms*/
// Deer class is considered to be polymorphic since this has multiple inheritance
/* Deer is an animal, vegetarian, deer and object
 * */

class Animals extends PrintInConsole{
	public void move() {
		print("Animal move");
	}
	
	public void jump() {
		print("Animal jump");
	}
}

interface Vegetarian{}
class Deer extends Animals  implements Vegetarian{
	public void run() {
		print("Deer run");
	} 
}
