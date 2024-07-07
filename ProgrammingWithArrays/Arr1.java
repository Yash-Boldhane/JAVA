// Write a program to find all the even numbers from an array.
package ProgrammingWithArrays;

public class Arr1 {
	public static void main(String[] args) {
		int []ar= {10,2,3,4,5,6,7,8,9};
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
