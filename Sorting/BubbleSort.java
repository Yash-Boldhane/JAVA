package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int a[]= {10,9,8,7,6};
		bubbleSort(a);
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubbleSort(int a[])
	{
		for (int pass = 0; pass < a.length-1; pass++) {
			
			for (int compare = 0; compare < a.length-1-pass; compare++) {
				if(a[compare]>a[compare+1])
				{
					int temp=a[compare];
						a[compare]=a[compare+1];
						a[compare+1]=temp;
				}
			}
		}
	}
}
