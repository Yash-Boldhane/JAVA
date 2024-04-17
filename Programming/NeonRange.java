class NeonRange
{
	public static void main(String[]args)
	{
	 int start=0;
	 int end=10;
	 
	 for(int i=start; i<=end; i++)
	 {
	 
	 int square=i*i;
	 int sum=0;
	
	 while(square!=0)
	 {
	 
	  	 int last=square%10;
		 sum=sum+last;
	  	 square=square/10;


	 }
	
	 	if(sum==i)
		{
		System.out.println(i);
		}


	
	 }


	}


}