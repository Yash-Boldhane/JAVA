// Write a program to merge two arrays.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr10 {
	public static void main(String[] args) {
		int[]ar1= {1,2,3,4,5};
		int[]ar2= {6,7,8,9,10};
		
		int ans[]=new int[ar1.length+ar2.length];
		
		for (int i = 0; i < ar1.length; i++) {
				ans[i]=ar1[i];
			}
		
		for (int i = ar1.length,j=0; i < ans.length; i++,j++) {
			ans[i]=ar2[j];
		}
		
		System.out.println(Arrays.toString(ans));
		}
	
	}

