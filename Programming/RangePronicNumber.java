class RangePronicNumber
{
	public static void main(String[]args)
	{
	 int start=1;
	 int end=1000;

	for(int i=start; i<=end; i++)
	{
	
		
	for (int j = 1; j * (j + 1) <= i; j++)
            {
                if (j * (j + 1) == i)
                {
                    System.out.print(i + " ");
                    break;	
		
		}
	}


	}

		
	}


}