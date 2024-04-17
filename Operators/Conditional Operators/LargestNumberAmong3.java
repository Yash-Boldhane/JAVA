class LargestNumberAmong3
{
	public static void main(String[]args)
	{
	      int n1=100;
              int n2=198;
              int n3=10;

              int ans1= n1>n2 ? n1 : n2 ;
              int ans2=ans1>n3 ? ans1 : n3;
              
              System.out.println(ans2);


	}
}