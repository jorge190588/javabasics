package oop;
 
public class AbstractionExample {

public static void main(String args[]) {
	
		//Abstraction
		
		// * FIRST EXAMPLE
		Car car = new Car("Car class",4);
		Vehicle vehicle = new Car("Vehicle",1);
		
		// Two methods called to getCurrentName method in Car class
		car.getCurrentName();
		vehicle.getCurrentName();

		// SECOND EXAMPLE
		Blueplayer bluePlayer = new Blueplayer("Jorge",10);
		bluePlayer.print("BluePlayer number",bluePlayer.getNumber());
		
	}
}




/* Abstraction: Is the quality of dealing with ideas rather than events. 
 * 				Also, abstraction is a process of hiding the implementation details from the user too.
 *  			Is achieved using Abstract classes and interfaces.
 *  			Cann't be instance (Vehicle), but whether can be inherited of other class (Car)
 *   *  */

abstract class Vehicle extends PrintInConsole {
	 private String name;
	 
	 public Vehicle(String name) {
		 this.name=name;
	 }
	 
	 public String getName() {
		 return this.name;
	 }
	 
	 public String getCurrentName() {
		 print("Get name called in Vehicle class");
		 return this.name;
	 }
}  

class Car extends Vehicle {
	private int wheel;
	public Car(String name, int wheel) {
		super(name);
		setWheel(wheel);
	}
	
	public void setWheel(int newWheel) { // setWheel method define an ideas rather than events.
		if (newWheel>=0) {
			this.wheel=newWheel;	
		}
		
	}
	public int getWheel() {
		return this.wheel;
	}
	
	public String getCurrentName() { // it method determine the behavior of the child class (Vehicle)
		print("Get name called in Car class");
		return getName();
	}
}

// Second example with an abstract method.
abstract class Player extends PrintInConsole {
	private String name;
	public Player(String name) {
		this.name=name;
	}
	public abstract int getNumber();
	public String getName() {
		return this.name;
	};
}

class Blueplayer extends Player{
	private int number;
	private String team;
	
	public Blueplayer(String name, int number) {
		super(name);
		setNumber(number);
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() { // is mandatory implement the method in the class.
		return this.number*10;
	}

	public String getTeam() {
		return this.team;
	}

	public String getName() {
		return super.getName();
	}
}