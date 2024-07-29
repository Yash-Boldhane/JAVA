// Write a proggram to check if two arrays are anagram or not
package ProgrammingWithStrings;

import java.util.Arrays;

public class Str11 {
	public static void main(String[] args) {
		String s1="bat";
		String s2="tab";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		int i = 0;
		
		if(ch1.length==ch2.length)
		{
			for (; i < ch2.length; i++) {
				if(ch1[i]!=ch2[i])
				{
					System.out.println("It is not an anagram String");
					break;
				}
			}
			
			if(i==ch2.length)
			{
				System.out.println("It is an anagram String");
			}
		}
		else
		{
			System.out.println("The length of both the string is not same, So it cannot be an anagram String");
		}
			
			
		
		
		
	}
}
