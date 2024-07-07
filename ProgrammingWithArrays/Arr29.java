//Write a program to count the total number of elements that how many times each element gets repeated(Frequency of an array)
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr29 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,3,2};
		int count[]=new int[ar.length];
		
		for (int i = 0; i < count.length; i++) {
			
				int ct=0;
				for (int j = i+1; j < count.length; j++) {
				if(ar[j]==ar[i])
				{
						ct++;
						count[j]=-1;
						System.out.println(ct);
				}
				
		}
				
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		
		
		System.out.println(Arrays.toString(count));
	}
}
