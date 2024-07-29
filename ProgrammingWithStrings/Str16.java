// Write a program to check which word is largest in length in the given String
package ProgrammingWithStrings;

public class Str16 {
	public static void main(String[] args) {
		String s="Hello My name is yash";
		String[] word=s.split(" ");
		
		int max=0, index=0;
		
		for (int i = 0; i < word.length; i++) {
			if(word[i].length()>max)
			{
				max=word[i].length();
				index=i;
			}
		}
		System.out.println(max);
		System.out.println(word[index]);
		
	}
}
