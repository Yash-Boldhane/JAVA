// Write a program to calculate next Prime in an array.
package ProgrammingWithArrays;

import java.util.Arrays;

public class Arr20 {
	public static void main(String[] args) {
	
	int[]ar= {1,10,20,33,17,21,27};
		int[]arr2=new int[ar.length];
		
		for (int i = 0; i < arr2.length; i++) {
			if(isPrime(ar[i]))
			{
				arr2[i]=ar[i];
			}
			else
			{
			
				arr2[i]=nextPrime(ar[i]);
				
			}
		}
		
		System.out.println(Arrays.toString(arr2));
		

		
	
	}
	
			public static boolean isPrime(int a)
			{
				int den;
				for(den=2; den<a;den++)
				{
					if (a%den==0) {
						break;
					}
				}
				return a==den;
			
			}
			
			public static int nextPrime(int a)
			{
				int num1=a+1;
				
				while(!isPrime(num1))
				{
					num1++;
				}
				return num1;
			}
	}
	

