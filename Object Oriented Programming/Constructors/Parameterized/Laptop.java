class Laptop
{
	String screen;
	String HDD;
	String SSD;
	String Processor;

	Laptop(String screen,String HDD,String SSD,String Processor)
	{
		System.out.println("From Parametarized Constructor");
		this.screen=screen;
		this.HDD=HDD;
		this.SSD=SSD;
		this.Processor=Processor;

	}
	
	public void displayLaptop()
	{
		System.out.println(screen);
		System.out.println(HDD);
		System.out.println(SSD);
		System.out.println(Processor);
	}
}
