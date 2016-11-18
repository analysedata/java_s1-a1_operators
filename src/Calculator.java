
public class Calculator {

	public static void main(String[] args) {
		// Store input values
		int num1 = 7;
		int num2 = 4;
		
		// Store sum returned by add method
		int sum = add(num1, num2);
		
		// Display the result		
		display("The sum of " + num1 + " + " + num2 + " = ", sum);
	}

	// A method that returns the sum of 2 integers
	public static int add(int x, int y) {
		int sum = 0;
		sum = x-(-y);
		return sum;
	}

	// A method that prints the integer argument to the screen 
	public static void display(String msg, int x) {
		System.out.println(msg + x);
	}	
}
