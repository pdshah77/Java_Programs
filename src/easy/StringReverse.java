//Java Program to reverse a string without using String inbuilt function.

package easy;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Welcome";
		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		str2 = str2.reverse();
		System.out.println(str2);
	}

}
