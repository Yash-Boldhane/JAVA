class Convert
{
	public static void main(String[]args)
	{
	 convertToChar(50+50);
	 convertToChar(200/2);
	 convertToChar('A');


	}

	public static void convertToChar(int num)
	{
	 if(num>=0 && num<=127)
	 {
	 

	 System.out.println((char)num);

	 }
	 else
	 {
	 System.out.println("Cannot be Converted");

	 }



	}


}