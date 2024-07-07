// Write a program to print all the +ve and -ve elements of an array.
package ProgrammingWithArrays;



public class Arr7 {
	public static void main(String[] args) {
		int[]ar= {10,-2,6,4,-9,-2,4,-2,2};
		
	for (int start = 0; start < ar.length; start++) {
			if(start>=0)
			{
				System.out.println(ar[start]);
			}
		}
	for (int j = 0; j < ar.length; j++) {
		if(j<0)
		{
			System.out.println(ar[j]);
		}
	}
	}
}
