package Sorting;

import java.util.Arrays;

import java.util.Scanner;

public class BinarySearch {
	
		public static void main(String[] args)
		{	Scanner sc=new Scanner(System.in);
			int ar[]= {10,40,60,70,11,21,48,101,51,27,82,45,17};
			
			Arrays.sort(ar);
			
			System.out.println("Enter the element you want to search");
			int search=sc.nextInt();
			int start=0;
			int end=ar.length-1;
			
			int mid=(start+end)/2;
			
			while (start<=end) {
				if(search==ar[mid])
				{
					System.out.println("The element found at index "+mid);
					break;
				}
				else if(search>ar[mid])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
				
				mid=(start+end)/2;
				
				if(start>end)
				{
					System.out.println("The element is not found in the array");
				}
			}
			
			System.out.println(Arrays.toString(ar));
			
			
			
		}
}	
