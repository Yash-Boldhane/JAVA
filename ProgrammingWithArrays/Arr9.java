// Write a program to print first element of first array should be last element of second array(Duplicate array with reverse elements)
package ProgrammingWithArrays;



public class Arr9 {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60,77,1,2,3};
		int []temp=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			temp[a.length-1-i]=a[i];
			
		}
		for (int j = 0; j < temp.length; j++) {
			System.out.println(temp[j]);
		}
		

	}
}
