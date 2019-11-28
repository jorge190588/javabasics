package oop;
 
public class InheritanceExample extends Calculation {


	public void multiplication(int a, int b) {
		int result=a*b;
		print("multiplication",result);
	}

	
	public static void main(String args[]) {
		//Inheritance
		InheritanceExample calculation = new InheritanceExample();
		int a=10,b=2;
		calculation.sum(a, b);
		calculation.subtraction(a, b);
		calculation.multiplication(a,b);
	}
}

/*Example of inheritance, a class support inheritance one class*/
class Calculation extends PrintInConsole {
	private int result=0;
	public void sum(int a, int b) {
		result=a+b;
		print("Sum", result);
	} 
	
	public void subtraction(int a, int b) {
		result=a-b;
		print("Subtraction", result);
	} 
}
