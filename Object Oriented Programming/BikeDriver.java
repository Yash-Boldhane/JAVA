class BikeDriver
{
	public static void main(String[]args)
	{
		Bike b1=new Bike();
		b1.Ignition="On/off";
		b1.Tyres="MRF";
		b1.Battery="EXCIDE";
		b1.Speed="180 kmph";
		b1.Tank="10 litres";
		b1.Light="LED LIGHT";


		System.out.println("Reference :"+b1);
		System.out.println("Ignition :"+b1.Ignition);
		System.out.println("Company Of Tyres :"+b1.Tyres);
		System.out.println("Type Of Battery :"+b1.Battery);
		System.out.println("Maximum Speed :"+b1.Speed);
		System.out.println("Capacity of Tank :"+b1.Tank);
		System.out.println("Type Of Light :"+b1.Light);


	}
}