class ProjectorDriver
{
	public static void main(String[]args)
	{
		Projector p1=new Projector();
		p1.Processor="DLP";
		p1.Buttons="To control the Functions";
		p1.Holder="To hold the projector";
		p1.Speakers="Portable Speakers";
		p1.Cable="To connect it to devices";
		p1.Lens="To display the contents in bigger size on screen";


		System.out.println("Reference :"+p1);	
		System.out.println("Processor :"+p1.Processor);	
		System.out.println("Buttons :"+p1.Buttons);	
		System.out.println("Holder :"+p1.Holder);	
		System.out.println("Speakers :"+p1.Speakers);	
		System.out.println("Cable :"+p1.Cable);	
		System.out.println("Lens :"+p1.Lens);		

	}
}