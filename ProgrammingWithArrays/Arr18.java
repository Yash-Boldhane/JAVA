//Write a program in which half of the array will be same and half will be rotated,
package ProgrammingWithArrays;

import java.util.Arrays;


public class Arr18 {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int[]b= {1,2,3,4,5};
		int[]c=new int[a.length+b.length];
		int temp=a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			a[i]=a[i+1];
			
		}
		a[a.length-1]=temp;

		for (int i = 0; i < c.length; i++) {
			if(i<b.length)
			{
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

