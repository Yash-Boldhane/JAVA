class BagDriver
{
	public static void main(String[]args)
	{
		Bag b1=new Bag();
		b1.material="Leather";
		b1.usb="3.0";
		b1.brand="American Tourister";
		b1.MainPocket="YES";
		b1.Lock="YES";
		b1.SidePocket="YES";


		System.out.println("Reference :"+b1);
		System.out.println("Material :"+b1.material);
		System.out.println("USB :"+b1.usb);
		System.out.println("Brand :"+b1.brand);
		System.out.println("MainPockets :"+b1.MainPocket);
		System.out.println("Lock :"+b1.Lock);
		System.out.println("SiddePocket :"+b1.SidePocket);
		

	}
}
