class OctalToDecimal
{
    public static void main(String[]args)
    {
        System.out.println(octToDecimal(11011));
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
    
    public static int power(int base, int raise)
    {
        int pow=1;
        for(int i=0; i<raise; i++)
        {
            pow*=base;
        }
        return pow;
    }
}