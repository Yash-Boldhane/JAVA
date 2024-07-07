// Write  a program to rotate an array clockwise i.e right side.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr16 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,11};
		int temp=a[a.length-1];
		
		for (int i = a.length-1; i >0; i--) {
						a[i]=a[i-1];
		}
		
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	
	}
}
