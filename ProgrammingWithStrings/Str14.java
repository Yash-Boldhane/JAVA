// Write a program to replace the words from a given sentence.
package ProgrammingWithStrings;

public class Str14 {
	public static void main(String[] args) {
		
		String s="Is insaan ne apne jiwan me bohot chamatkar pe chamatkar kiye hai";
		
		System.out.println(Change(s, "chamatkar", "Balatkar"));
		
	}
	
	public static String Change(String ip, String oldword, String newword)
	{
		 String[] ans = ip.split("\\s+"); 
	        String result = " "; 

	        for (int i = 0; i < ans.length; i++) {
	          
	                if (ans[i].equals(oldword)) {
	                    result+=newword+" ";
	                }
	                else
	                {
	                	result+=ans[i]+" ";
	                }
	            }

	        

	        return result.trim();
		
	}
}
