// Write a program to check which values are in ame position after reversing
package ProgrammingWithArrays;
import java.util.Arrays;
public class Arr14 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,4,2,3,5};
		for (int i = 0,j=a.length-1; i <j; i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
			
			
		}
		
		System.out.println(Arrays.toString(a));
		
		
	}
}
