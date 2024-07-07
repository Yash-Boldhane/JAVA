// Write a program to remove all the occurance of an element...
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr27 {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,5,6,7,8,9};
		int no=5;
		int count=0;
		
	
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==no) {
				count++;
			}
		}
		int ans[]=new int[arr.length-count];

		
		for (int i = 0, j=0; i <arr.length; i++) {
			if(arr[i]!=no)
			{
				ans[j]=arr[i];
				j++;
				
			}		
	}
		System.out.println(Arrays.toString(ans));
	}
}

