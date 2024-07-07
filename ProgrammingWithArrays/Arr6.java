// Write a program to print first and last element of an array.
package ProgrammingWithArrays;
public class Arr6 {
	public static void main(String[] args) {
		int[]ar= {10,20,22,14,25,66,14,88};
		
		
			for (int i = 0,j=ar.length-1;i<j; i++,j--) {
				
				System.out.println(ar[i]+","+ar[j]);
				
			}
			
		}
		
	}

