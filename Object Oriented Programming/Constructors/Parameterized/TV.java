class TV
{
	String Brand;
	int Size;
	String Holder;
	String Type;
	String ModelNo;
	
	TV(String Brand,int Size,String Holder,String Type,String ModelNo)
	{
		System.out.println("From Parametarized Constructor");
		this.Brand=Brand;
		this.Size=Size;
		this.Holder=Holder;
		this.Type=Type;
		this.ModelNo=ModelNo;
	}
	
	public void displayTV()
	{
		System.out.println(Brand);
		System.out.println(Size);
		System.out.println(Holder);
		System.out.println(Type);
		System.out.println(ModelNo);
	

	}

	
	
}