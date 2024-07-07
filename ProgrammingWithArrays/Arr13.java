// Write a program to check if the given array is a pallindrome or not.
package ProgrammingWithArrays;
import java.util.Arrays;


public class Arr13 {

	public static void main(String[] args) {
		int []a= {1,2,2,1};
		int []b=new int[a.length];
	
		for (int i = 0, j=0; i < b.length; i++,j++) {
			b[j]=a[i];
		}
		
		for (int i = 0, j=a.length-1;i<j; i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
			{
				System.out.println("It is not a pallindrome");
				break;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		

		
	}
}
