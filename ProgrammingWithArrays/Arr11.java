// Write a program to do zigzag and store both the arrays in one array.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr11 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int ans[]=new int[a.length+b.length];
		
		for (int i = 0,j=0; j < a.length; i+=2,j++) {
			 ans[i]=a[j];
			 ans[i+1]=b[j];
			}
		
		System.out.println(Arrays.toString(ans));
		}
	}

