// Write a program to check if the ggiven String is a panagram or not
package ProgrammingWithStrings;

public class Str21 {
	public static void main(String[] args) {
		String ip="The quick brown fox jumps over the lazy dop";
		
		String s=ip.toUpperCase();
			
		String ans=" ";

		for (int i=0; i < s.length(); i++) {
			char ch=(char) s.charAt(i);
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]==' ')
			{
				ans+=ch(i);
			}
		}
			
		if(ans==s)
		{
			System.out.println("It is a panagram");
		}
		else
		{
			System.out.println("It is not a panagram array");
		}
	}

	private static String ch(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}



