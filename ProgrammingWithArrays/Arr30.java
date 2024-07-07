// Write a program to find the repeated and not repeated elements of an array
package ProgrammingWithArrays;

public class Arr30 {
	public static void main(String[] args) {
		int ar[]= {1,2,3,3,2,4,5,55,55,7,8,9};
		int count[]=new int[ar.length];
		
		for (int i = 0; i < count.length; i++) {
			int ct=0;
			for (int j = i+1; j < count.length; j++) {
				if(ar[i]==ar[j])
				{
					ct++;
					count[j]=-1;
				}
				
			}
			if(count[i]!=-1)
			{
				count[i]=ct;
			}
		}
		System.out.println("The repeated elements are");
		for (int j = 0; j < count.length; j++) {
			if(count[j]==-1)
			{
				System.out.println(ar[j]+" ");
			}
		}
		System.out.println("The non repeated elements are");
		for (int i = 0; i < count.length; i++) {
			if(count[i]==0)
			{
				System.out.println(ar[i]+" ");
			}
		}
	
	}
	
}
