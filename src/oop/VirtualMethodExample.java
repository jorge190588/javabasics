package oop;
 

public class VirtualMethodExample {
	public static void main(String args[]) {
		// Virtual Methods, employee execute mailCheck method defined in salary class.
		Salary salary = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
	    Employee employee = new Salary("John Adams", "Boston, MA", 2, 2400.00);
	    salary.mailCheck();
	    employee.mailCheck();
	}
}

/*Virtual Methods:  JVM invokes mailCheck() in the Salary class, the behavior is referred to as virtual method invocation, mailCheck method in salary class is overridden at run time
 * no matter what data type the reference is that was used in the source code at compile time */
class Employee {
	   private String name;
	   private String address;
	   private int number;

	   public Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }

	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getAddress() {
	      return address;
	   }

	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }

	   public int getNumber() {
	      return number;
	   }
	}

class Salary extends Employee {
	   private double salary; // Annual salary
	   
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	   
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary pay for " + getName());
	      return salary/52;
	   }
	}