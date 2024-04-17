class Switch3
{
	public static void main(String[]args)
	{
		char ch='e';

		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			switch(ch)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
				System.out.println("It is a vowel");
				break;
				}
		
				default :
				{
				System.out.println("It is a Consonent");
				}
			
			}
		}
		
		else
		{
		System.out.println("Wrong Input");
		}

	}
}