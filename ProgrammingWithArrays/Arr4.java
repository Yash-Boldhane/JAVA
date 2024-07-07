// Write a program to print the elements of an array in reverse order.
package ProgrammingWithArrays;

public class Arr4 {
	public static void main(String[] args) {
		int []ar= {10,20,30,40,50,60};
		
		for (int i = ar.length-1; i >=0; i--) {
			System.out.println(ar[i]);
		}
	}
}
