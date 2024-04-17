class LargestNumberAmong4
{
	public static void main(String[]args)
	{
		int n1=1550;
		int n2=500;
		int n3=4590;
		int n4=5478;

		int compare1=n1>n2 ? n1 : n2 ;
		int compare2=n3>n4 ? n3 : n4 ;

		int finalAnswer=compare1>compare2 ? compare1 : compare2 ;

		System.out.println(finalAnswer);
	}
}