// Write a program to convert a String to a string array
package ProgrammingWithStrings;

import java.util.Arrays;

public class Str10 {
	public static void main(String[] args) {
		
		String s="I love my Country India";
		
		String ans[]=StringToArray(s);
		
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static String[] StringToArray(String ip)
	{
		String[] words=new String[count(ip)];
		int wordIndex=0;
		String temp=" ";
		
		for (int i = 0; i < ip.length(); i++) {
			if(ip.charAt(i)==' ')
			{	words[wordIndex]=temp;
			temp=" ";
			wordIndex++;
			}
			else
			{
				temp+=ip.charAt(i);
			}
		}
		
		words[wordIndex]=temp;
		
		return words;
		
		
	}
	public static int count(String ip)
	{
		int count=0;
		
		for (int i = 0; i < ip.length(); i++) {
			char ch=ip.charAt(i);
			if(ch==' ')
			{
				count++;
			}
		}
		return count+1;
	}
	
}
