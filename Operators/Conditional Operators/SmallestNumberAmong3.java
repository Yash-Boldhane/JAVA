class SmallestNumberAmong3
{
	public static void main(String[]args)
	{
		int a=100;
		int b=500;
		int c=225;

		int ans= a<b? (a<c ? a : c) : (b<c ? b : c) ;

		System.out.println(ans);
	}
}