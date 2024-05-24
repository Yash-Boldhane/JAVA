class Projector
{
	
	String Processor;
	String Holder;
	String Buttons;
	String Speakers;
	String Cable;
	String Lens;

	Projector(String Processor,String Holder,String Buttons,String Speakers,String Cable,String Lens)
	{
		System.out.println("Fron Parametarized Constructor");
		this.Processor=Processor;
		this.Holder=Holder;
		this.Buttons=Buttons;
		this.Speakers=Speakers;
		this.Cable=Cable;
		this.Lens=Lens;
	}
	
	public void displayProjector()
	{
		System.out.println(Processor);
		System.out.println(Holder);
		System.out.println(Buttons);
		System.out.println(Speakers);
		System.out.println(Cable);
		System.out.println(Lens);
	

	}

}