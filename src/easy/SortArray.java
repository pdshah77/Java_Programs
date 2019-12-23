package easy;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[]{1,5,7,2,7,9};
		int temp = 0;
		for (int i=0; i<a.length; i++) {
			for (int j=i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
 				}
				
			}
		}
		System.out.println("Sorted Array is ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		

	}

}
