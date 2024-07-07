// Write a program to insert one array into another array at index.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr28 {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
		int arr2[]= {7,10,11,12};
		int index=4;

		
		int[] ans=new int[arr.length+arr2.length];
		
		for (int i = 0; i < index; i++) {
			ans[i]=arr[i];
			
		}
		for (int i =0; i < arr2.length; i++) {
			ans[index]=arr2[i];
			index++;
			
		}
		for (int i = index-arr2.length; i < arr.length; i++) {
				ans[i+arr2.length]=arr[i];
		}
		
			System.out.println(Arrays.toString(ans));
	}
}
