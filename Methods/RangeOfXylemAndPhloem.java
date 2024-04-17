class RangeOfXylemAndPhloem 
{
	public static void main(String[] args)
	{
		int start=1;
		int end=1000;
		
		while(start<=end)
		{
			if(isXylem(start))
			{
				System.out.println(start);
			}
			start++;
		}
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

		ext += m % 10;
		mid -= m % 10;

		return ext == mid;
	}
}
