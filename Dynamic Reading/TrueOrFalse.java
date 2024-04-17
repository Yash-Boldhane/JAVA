import java.util.Scanner;

class TrueOrFalse
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you 18 years or older? (true/false): ");

        boolean  If = scanner.nextBoolean();

        String ans =  If ? "You are eligible to vote" : "You are not eligible to vote";

        System.out.println(ans);
    }
}
