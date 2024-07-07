// Write a program to print the alternate values of an array.
package ProgrammingWithArrays;

public class Arr5 {
	public static void main(String[] args) {
		int []ar= {10,20,30,40,50,60,70,80,90,100};
		
		for (int i = 0; i < ar.length; i+=2) {
			System.out.println(ar[i]);
		}
	}
}
