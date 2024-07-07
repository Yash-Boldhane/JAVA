// Write a program in which user will give the start and end index and you have to skip those index and print before and after that range.
package ProgrammingWithArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ar[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Entert the start value");
		int start=sc.nextInt();
		
		System.out.println("Enter the end value");
		
		int end=sc.nextInt();
		
		int diff=end-start;
		
		int ans[]=new int[ar.length-diff];
		
		for (int i = 0; i < ar.length; i++) {
			if(i<start)
			{
				ans[i]=ar[i];
			}
			else if(i>=end)
			{
				ans[i-diff]=ar[i];
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
		
		
	}
}
