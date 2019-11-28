package oop;



public class InterfaceExample {

}

/* Intefaces: 	Is a reference type, its similar to class, its a collection of abstract methods. 
 * 				A class can implement an interface, thereby inheriting the abstract methods of the interface.
 * 				Its contains behaviors as an class, but an class contains attributes and behaviors
 * 				All the methods defined in the interface need to be defined in the class.
 * */

interface Color {
	public String getName();
	public String getCode();
}

class Red implements Color {

	
	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getCode() {
		return null;
	}
	
}
