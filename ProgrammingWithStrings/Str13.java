package ProgrammingWithStrings;

public class Str13 {
    public static void main(String[] args) {
        String s = "I love my country india and i love it";
        String ans = newArray(s);
        System.out.println(ans);
    }

    public static String newArray(String ip) {
        String[] ans = ip.split("\\s+"); 
        String result = ""; 

        for (int i = 0; i < ans.length; i++) {
          
            int j;
            for (j = 0; j < i; j++) {
                if (ans[i].equals(ans[j])) {
                    break; 
                }
            }

            if (j == i) { 
                result += ans[i] + " "; 
            }
        }

        return result.trim();
    }
}
