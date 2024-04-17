class RangeOfUniqueNumber
{
	public static void main(String[]args)
	{
		int start=1;
		int end=100;
	
		while(start<=end)
		{
			if(isUnique(start))
			{
			System.out.println(start);
			}
			start++;
		}
	
	}

        public static boolean isUnique(int ans)
        {
	int n1=ans;
	int n2=ans;
	int r1=0;
	int r2=0;
	int ct=0;
	
	while(n1>0)
	{
		r1=n1%10;
		
			while(n2>0)
			{
				r2=n2%10;
				if(r1==r2)
				{
					ct++;
				}
				n2/=10;
			}
		n1/=10;
	}
	
	if(ct==1)
	{
		return true;
	}
	else
	{
		return false;
	}
	


	}

    }

    