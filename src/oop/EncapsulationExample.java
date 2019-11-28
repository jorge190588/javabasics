package oop;

public class EncapsulationExample {

}


/* Encapsulation (set/get methods): is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
/ is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class
 * */

class Producto {
	private String name;
	public Producto() {
		
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
}