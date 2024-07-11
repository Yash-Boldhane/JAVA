// Anagram Array(Find if the elements of first array are present in the second array or not.
package ProgrammingWithArrays;


public class Arr40 {
	public static void main(String[] args) {
		// The length of both the arrays should be same.
		
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {1,2,3,4,10,11,12};
		
		
		if(a.length==b.length)
		{
			int i;
			for (i= 0; i < a.length; i++) {
				int j;
				
				for (j = 0; j < b.length; j++) {
					if(a[i]==b[j])
					{
						break;
					}
				}
			}
			
			if (i==a.length) {
				System.out.println("It is an anagram Array");
			}
			else
			{
				System.out.println("It is not an anagram Array");
			}
		}
		else
		{
			System.out.println("The length of both the arrays is not same");
		}
	}
}
// Answer is not coming correct. There is an issue in some statement. Yet to be resolved.

