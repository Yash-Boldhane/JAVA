// Write a program to find the sum of elements of an given array.
package ProgrammingWithArrays;

public class Arr2 {

	public static void main(String[] args) {
		int []a= {10,2,5,4,20,46,123,45};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		
	}
}
