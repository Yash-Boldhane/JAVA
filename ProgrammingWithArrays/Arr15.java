// Write a program to print zig zag of an uneven size of an array
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr15 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,11,12,13};
		int[]b= {6,7,8,9,10,15,16,17};
		
		
		int c[]=new int[a.length+b.length];
		
		if(a.length<b.length)
		{
			int j=0;
		
			for (int i = 0; i < a.length; i++,j+=2) {
				c[j]=a[i];
				c[j+1]=b[i];
			}
			for (int i = a.length; i < b.length; i++,j++) {
				c[j]=b[i];
			}
		}
		else if(a.length>b.length)     
		{
			int j=0,i=0;
			
			for (; i < b.length; i++,j+=2) {
				c[j]=a[i];
				c[j+1]=b[i];
			}
			for (; i < a.length; i++,j++) {
				c[j]=a[i];
			}
		}
		
		else
		{
			for (int i = 0,j=0; i < c.length; i+=2,j++) {
				c[i]=a[j];
				c[i+1]=b[j];
			}
		}
		
		
		System.out.println(Arrays.toString(c));
		
	
	}
}
