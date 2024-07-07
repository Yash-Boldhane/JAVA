// Write a program to push all the +ve elements on right side and all the -ve elements on left side.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr34 {
	public static void main(String[] args) {
		int[]ar= {-1,2,-3,4,-5,6,-7,8,-9,10};
		for (int i = 0,j=ar.length-1; i<j; i++,j--) {
			int temp=0;
			if(ar[i]<0 && ar[j]>=0)
			{
				ar[i]=ar[i];
			}
			else
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
