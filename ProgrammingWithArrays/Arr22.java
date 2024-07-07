// write a program to insert an element of an index in the middle

package ProgrammingWithArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teh index at which the element should be added:-");
		int a[]= {1,2,3,4,5};
		int index=sc.nextInt();
		if(index>0 && index<a.length)
			System.out.println("Enter the element to be added");
			int element=sc.nextInt();
			
			int b[]=new int[a.length+1];
			
			
			for (int i = 0; i < b.length; i++) {
				if(i<index)
				{
					b[i]=a[i];
				}
				else if(i==index)
				{
					b[i]=element;
				}
				else
				{
					b[i]=a[i-1];
				}
			}
			
			System.out.println(Arrays.toString(b));
			
	}
}
