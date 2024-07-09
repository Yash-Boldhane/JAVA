// Write a program to find the length of array without using length variable..
package ProgrammingWithArrays;

public class Arr35 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,55,66,45,33,44,55,47};
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==a[i])
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
}
