class BookDriver
{
	public static void main(String[]args)
	{
		Book b1=new Book();
		b1.typeOfBook="Story Book";
		b1.pagesInTheBook="200 pages";
		b1.author="HARBAJAN SINGH";
		b1.blankOrFilled="FILLED";
		b1.Price="RS.280.00";
		

		System.out.println("Reference :"+b1);
		System.out.println("Type of Book :"+b1.typeOfBook);
		System.out.println("Number of Pages :"+b1.pagesInTheBook);
		System.out.println("Author Name :"+b1.author);
		System.out.println("Blanked or Filled :"+b1.blankOrFilled);
		System.out.println("Price :"+b1.Price);
	}
}