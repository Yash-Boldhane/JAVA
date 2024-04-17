class AccountCreditDebit
{
    static long accno=987654321;
    static int pin=1234;
    static double balance;
    public static void main(String[]args)
    {
        withDraw(987654321,1234, 5000);x

    }
    
    public static void withDraw(long accno, int pin, double amt)
    {
        if(AccountCreditDebit.accno==accno && AccountCreditDebit.pin==pin && amt>0)
        {
            System.out.println("Login Successfull !");
            
            balance=balance-amt;
            System.out.println("Amount debited !");
             System.out.println("Available balance is :"+balance);
            
        }
        else
        {
            System.out.println("Incorrect username or password !");
        }
    }
    
      public static void Deposit(long accno, int pin, double amt)
      {
             if(AccountCreditDebit.accno==accno && AccountCreditDebit.pin==pin && amt>0)
             {
                  System.out.println("Login Successfull !");
                 
                 balance=balance+amt;
                 
                 System.out.println("Amount credited !");
                 System.out.println("Available balance is :"+balance);
            
             }
             else
             {
              System.out.println("Incorrect username or password !");
             }
      }
     
}