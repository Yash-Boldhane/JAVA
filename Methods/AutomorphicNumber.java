class AutomorphicNumber
{
   	 public static void main(String[] args)
 	{
        	int num=25;
			System.out.println(isAutomorphic(num));
		
    	}
    
    	public static boolean isAutomorphic(int num)
 	{
        int sq = num * num;
        int ct = countDigits(num);
        int rem = sq % power(10, ct);
        
        return rem == num;
    	}

    	public static int countDigits(int num)
 	{
        int ct = 0;
        while (num != 0)
	 {
            num /= 10;
            ct++;
         }
        return ct;
    }

    public static int power(int base, int exponent)
	 {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
