class XylemAndPhloem 
{
	public static void main(String[] args)
	{
		System.out.println(isXylem(12348));
	}

	public static boolean isXylem(int num) 
	{
		int m = num;
		int mid = 0;
		int ext = 0;

		while (num > 0)
		{
			int rem = num % 10;
			num /= 10;

			if (num == 0)
			{
				ext += rem;
			} 
			else
			{
				mid += rem;
			}
		}

		ext += m % 10;//This will add the digits
		mid -= m % 10;// This will remove the last digit

		return ext == mid;
	}
}
