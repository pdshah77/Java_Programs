// Java Program to swap two numbers without using the third variable.
package easy;

public class SwapTwoNumber {
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
