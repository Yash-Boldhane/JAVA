class StatBlock1
{
	static
	{
		System.out.println("From static block 1");
	}
	
	public static void main(String[]args)
	{
		System.out.println("Form main()");
	}
	
	static
	{
		System.out.println("From static block 2");
	}
}