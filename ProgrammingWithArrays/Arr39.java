// Write a program to find second minimum element of an array without sorting..
package ProgrammingWithArrays;

public class Arr39 {
	public static void main(String[] args) {
		int a[]= {2,4,6,7,10,25,100,55,75,44};
		int min=Integer.MAX_VALUE;
		int secmin=Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin && a[i]!=min)
			{
				secmin=a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(secmin);
	}
}
