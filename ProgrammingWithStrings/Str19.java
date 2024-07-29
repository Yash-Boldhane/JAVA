// Important: Write a program to check if the given string is anagram or not without using nested loops.
package ProgrammingWithStrings;

import java.util.Arrays;

public class Str19 {
	public static void main(String[] args) {
		String s1="bat";
		String s2="tab";
		if(s1.length()==s2.length())
		{
		char ch1[]=new char[127];
		char ch2[]=new char[127];
		
		for (int i = 0; i < s1.length(); i++) {
			ch1[s1.charAt(i)]++;
			ch2[s2.charAt(i)]++;
		}
		

		
		int i=0;
		for (; i < ch2.length; i++) {
			if(ch1[i]!=ch2[i])
			{
				break;
			}
		}
		
		if(i==ch2.length)
		{
			System.out.println("It is a anagram string");
		}
		else
		{
			System.out.println("It is not an anagram string");
		}
				
	}
		else
		{
			System.out.println("The length of both the string is not same");
		}
}
}