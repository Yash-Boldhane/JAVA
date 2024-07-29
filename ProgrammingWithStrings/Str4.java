// Write a program to sort all the characters of a given String
package ProgrammingWithStrings;

public class Str4 {

		public static void main(String[] args) {
			String s="Qspiders";
			
			System.out.println(Sort(s));
					
		}
		public static String Sort(String s)
		{
			char ch[]=Str2.charArray(s);
			
			for (int i = 0; i < ch.length-1; i++) {
				
				
				for (int j = 0; j < ch.length-1; j++) {
					if(ch[j]>ch[j+1])
					{
						char temp=ch[j];
						ch[j]=ch[j+1];
						ch[j+1]=temp;
					}
				}
			}
			
			return new String(ch);
		}
}
