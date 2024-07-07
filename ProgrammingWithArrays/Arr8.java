// Write a program to copy all the elements of one array into another array..
package ProgrammingWithArrays;

public class Arr8 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,77,1,2,3};
		int []temp=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			temp[i]=a[i];
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
