// Write a program to tell the frequency of repeatation of the words
package ProgrammingWithStrings;

import java.util.Arrays;

public class Str12 {
	public static void main(String[] args) {
		
		
		 String s = "I love my country love my country";
	        
	        String[] ans = Str10.StringToArray(s);
		 
        int[] count = new int[ans.length];
        
        for (int i = 0; i < ans.length; i++) {
            int ct = 1; 
            
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i].equals(ans[j])) {
                    ct++;
                    count[j] = -1;
                }
            }
            
            if (count[i] != -1) {
                count[i] = ct;
            }
        }
        
        for (int i = 0; i < ans.length; i++) {
            if (count[i] != -1) {
                System.out.println("'" + ans[i] + "' occurs " + count[i] + " times");
            }
        }
        
	}
	
}
    
				
		

	

/*	public static String[] StringToArray(String ip)
	{
		String[]words=new String[count(ip)];
		int wordIndex=0;
		String temp=" ";
		
		for (int i = 0; i < ip.length(); i++) {
			if(ip.charAt(i)==' ')
			{
				words[wordIndex]=temp;
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
			char ch[]=ip.toCharArray();
			
			if(ch[i]==' ')
			{
				count++;
			}
		}
		return count+1;
	}
}*/
