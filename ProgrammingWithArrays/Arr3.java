// Find the sum of even and odd elements of an given array.
package ProgrammingWithArrays;

public class Arr3 {
	public static void main(String[] args) {
		int[]ar= {10,2,5,40,60,12,35,41,98};
		int even=0;
		int odd=0;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i]%2==0) {
				even+=ar[i];
			}
			else {
				odd+=ar[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
