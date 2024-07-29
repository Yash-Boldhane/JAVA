// Write a program to check if the given string is pallindrome or not.
package ProgrammingWithStrings;

public class Str5 {

		public static void main(String[] args) {
			String s="aabbaa";
			
			System.out.println(pallindrome(s));
		}
		
		public static boolean pallindrome(String s)
		{
			char []ch=Str2.charArray(s);
			int i=0, j=s.length()-1;
			for (; i<j; i++,j--) {
				if(ch[i]!=ch[j])
				{
					return false;
				}
			}
			return true;
		}
	
}
