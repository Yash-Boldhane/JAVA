class laptopDriver
{
	public static void main(String[]args)
	{
		Laptop l1=new Laptop();
		l1.Screen="HD DISPLAY";
		l1.HDD="Samsung";
		l1.SSD="SONY";
		l1.Processor="Intel Core i5";
		l1.GraphicCard="RTX 1050T";
		l1.Motherboard="Zebronics";
		l1.RAM="8GB";



		System.out.println("Reference :"+l1);
		System.out.println("Screen Display :"+l1.Screen);
		System.out.println("HDD :"+l1.HDD);
		System.out.println("SSD :"+l1.SSD);
		System.out.println("Processor :"+l1.Processor);
		System.out.println("Graphic Card :"+l1.GraphicCard);
		System.out.println("Motherboard :"+l1.Motherboard);
		System.out.println("RAM :"+l1.RAM);
		
		
	}
}