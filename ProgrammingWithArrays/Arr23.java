// Write a program to remove an element from an array.
package ProgrammingWithArrays;

import java.util.Arrays;

import java.util.Scanner;

public class Arr23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index from which ypu have to remove the element");
		int a[]= {1,2,3,4,5,6,7};
		int ans[]=new int[a.length-1];
		int index=sc.nextInt();
		
		
		if(index>=0 && index<a.length)
		{
			for (int i = 0; i < a.length; i++) {
				if (i<index) {
					ans[i]=a[i];
				}
				else if(i>index){
					ans[i-1]=a[i];
				}
					
				
			}
		}
	
	else
	{
		System.out.println("Index not found");
	}
		
		System.out.println(Arrays.toString(ans));
		
	}	
}
