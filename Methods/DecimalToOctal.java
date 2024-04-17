class DecimalToOctal
{
    public static void main(String[]args)
    {
        System.out.println(decToOct(1234));
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
}