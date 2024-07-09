// Write a program to find largest element in the array in the array without sorting.
package ProgrammingWithArrays;

public class Arr36 {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,10,25,100,55,75,44};
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}
}
