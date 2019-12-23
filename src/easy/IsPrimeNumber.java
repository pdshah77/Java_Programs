//Java Program to find whether a number is prime or not.

package easy;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber = 123;
		int temp;
		boolean isPrime = true;
		
		for (int i=2;i<= givenNumber/2;i++) {
			temp = givenNumber%i;
			if (temp==0) {
				isPrime = false;
				break;
			}
		}
			if (isPrime) {
				System.out.println("Given Number is Prime");
			}
			else {
				System.out.println("Given Number is Non Prime");
		}
		
		
		

	}

}
