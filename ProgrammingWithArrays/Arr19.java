// Write a program in which half of the array will be left rotated and hald of the array will be right rotated.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr19 {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int[]b= {1,2,3,4,5};
		int []c=new int[a.length+b.length];
		
		int right=a[0];
		int left=b[b.length-1];
		
		for (int i = b.length-1; i>0; i--) {
			b[i]=b[i-1];
		}
		b[0]=left;
		
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=right;
		
		for (int i = 0; i < c.length; i++) {
			if(i<b.length) {
				c[i]=b[i];
			}
			else
			{
				c[i]=a[i-a.length];
			}
		}
		
		System.out.println(Arrays.toString(c));
		
	}
}
