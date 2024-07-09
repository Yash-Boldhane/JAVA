// Write a program to find the second largest element in the array without sorting.
package ProgrammingWithArrays;

public class Arr38 {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,10,25,100,55,75,44};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax && a[i]!=max)
			{
				secmax=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(secmax);
	}
}
