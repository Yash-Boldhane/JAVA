class SmallestNumberAmong4
{
	public static void main(String[]args)
	{
		int a=10;
		int b=120;
		int c=0;
		int d=52;

		int compare1=a<b ? a : b ;
		int compare2=c<d ? c : d ;

		int smallestNumber=compare1<compare2 ? compare1 : compare2 ;

		System.out.println(smallestNumber);
	}
}