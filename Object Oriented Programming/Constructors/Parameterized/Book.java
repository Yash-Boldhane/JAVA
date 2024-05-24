class Book
{
	String Author;
	Double Price;
	int Pages;

	Book(String Author,Double Price,int Pages)
	{
		System.out.println("From Parametarized Constructor");
		this.Author=Author;
		this.Price=Price;
		this.Pages=Pages;
	}
	
	public void displayBook()
	{
		System.out.println(Author);
		System.out.println(Price);
		System.out.println(Pages);
		
	}
}