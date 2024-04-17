class Utility 
{
    public static void main(String[] args)
    {
        System.out.println(isXylem(1234));
    }
    
    public static int count(int num)
    {
        int ct=0;
        while(num!=0)
        {
            num/=10;
            ct++;
        }
        return ct;
    }
    
    public static int power(int base, int raise)
    {
        int pow=1;
        for(int i=0; i<raise; i++)
        {
            pow*=base;
        }
        return pow;
    }
    
    public static boolean isPrime(int num)
    {
        int den;
        for(den=2; den<num; den++)
        {
            if(num%den==0)
            {
                break;
            }
            
        }
        
        return num==den;
    }
    
    public static boolean isArmstrong(int num)
    {
        int ct=count(num);
        int temp=num;
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum+=power(rem,ct);
            num/=10;
        }
        
        return sum==temp;
    }

    public static int sumOfDigits(int num)
    {
	int sum=0;
	while(num!=0)
	{
		int last=num%10;
		sum+=last;
		num/=10;
	}
	return sum;
    }

    public static int reverse(int num)
    {
	int rev=0;
	while(num>0)
	{
		int last=num%10;
		rev=rev*10+last;
		num/=10;
	}
	return rev;
    }
	
    public static boolean isDisarium(int num)
	{
	int ct=count(num);
	int sum=0;
	
	for(int i=num; i!=0; i/=10)
	{
		int rem=i%10;
		sum=sum+power(rem,ct);
		ct--;

	}
	return num==sum;


	}

    public static boolean isUnique(int num)
    {
		int n1=num;
		int n2=num;
		int r1,r2,ct=0;
	
		while(n1!=0)
		{
			r1=n1%10;
			
			while(n2!=0)
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
		
		return ct==1;
	
	
    }

    public static boolean isFascinating(int num)
    {
	int ans1=num*2;
	int total1=num*power(10,count(ans1))+ans1;

	int ans2=num*3;
	int total2=total1*power(10,count(ans2))+ans2;
	
		if(isUnique(total2))
		{	
		return true;
		}
		else
		{
		return false;
		}

    }

    
    public static int sqOfDigits(int num)
    {
        int sum = 0;
        while (num != 0) 
	{
            int rem = num % 10;
            sum += rem * rem;
            num /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int num)
    {
        int result = num;

        while (result != 1 && result != 4)	
	 {
            result = sqOfDigits(result);
            if (result == 1)
	    {
                break; // Break out of the loop if result becomes 1
            }
        }

        return result == 1;
     }

	public static String decToBin(int num)
	{
		String bin="";
	
	
		while(num!=0)
		{
		 int rem=num%2;
		 bin=rem+bin;
		 num/=2;
		}
		
	
		return bin;
	
	
	}
	
	public static  String decToHex(int num)
   	 {
       	 String ans="";
        
        
       	 while(num!=0)
       	 {
            int rem=num%16;
            if(rem>=0 && rem<=9)
            {
                ans=rem+ans;
            }
            
            else if(rem>9 && rem<16)
            {
                ans =((char)(rem + 55))+ans;
            }
    
            num/=16;
      	  }
        
        return ans;
    }
    

    public static String decToOct(int num)
    {
        String bin="";
        
        while(num!=0)
        {
            int rem=num%8;
            bin=rem+bin;
            num/=8;
        }
        return bin;
    }

	public static int octToDecimal(int bin)
  	  {
     
        int sum=0;
        int i=0;
        
       	 while(bin!=0)
       	 {
            int last=bin%10;
            
                sum+=(last*power(8,i));
                i++;
                bin/=10;
            
        
       	 }
            
        return sum;
    
    }

  public static int binToDecimal(int bin)
    {
     
        int sum=0;
        int i=0;
        
        while(bin!=0)
        {
            int last=bin%10;
            
                sum+=(last*power(2,i));
                i++;
                bin/=10;
            
        
        }
            
        return sum;
    
    }
    
	public static int rotate(int num)
	{
		int ct=count(num)-1;
		
		int ans=(num%10)*power(10,ct)+num/10;
		return ans;
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