// Write  a program to rotate an array Anticlockwise i.e left side.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr17 {
	public static void main(String[] args) {
			int a[]= {1,2,3,4,5,11};
			int temp=a[0];
			
			for (int i = 0; i <a.length-1; i++) {
							a[i]=a[i+1];
			}
			
			a[a.length-1]=temp;
			System.out.println(Arrays.toString(a));
	}
}
