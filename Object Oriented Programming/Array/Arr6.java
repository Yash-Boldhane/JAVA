package Array;
import java.util.Scanner;
public class Arr6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
	
		String []s=new String[n];
		for (int i = 0; i <n; i++) {
				s[i]=input.nextLine();
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
}
