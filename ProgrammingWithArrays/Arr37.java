//Write a program to find the minimum element of an array without sorting.
package ProgrammingWithArrays;

public class Arr37 {
	public static void main(String[] args) {
		int a[]={2,4,6,7,10,25,100,55,75,44};
		
		int min=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
	}
}
