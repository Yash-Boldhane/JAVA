// Write a program to remove all the even elements of an array
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr25 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,88,57,65,99,39,47};
		int count=0;
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		int ans[]=new int[a.length-count];
		
		for (int i = 0,j=0; i < a.length; i++) {
			if(a[i]%2!=0)
			{
				ans[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}
}
