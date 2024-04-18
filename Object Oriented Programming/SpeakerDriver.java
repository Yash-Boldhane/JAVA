class SpeakerDriver
{
	public static void main(String[]args)
	{
		Speaker s1=new Speaker();
		s1.VolumeButton="Up or Down";
		s1.Power="On or Off";
		s1.Battery="Low or Full";
		s1.Bluetooth="Connected or Disconnected";
		s1.Audiojack="Pluged in or Pluged out";
		s1.ChargingPort="Plug in or plug out";

		System.out.println("Reference :"+s1);
		System.out.println("VolumeButton :"+s1.VolumeButton);
		System.out.println("Power :"+s1.Power);
		System.out.println("Battery :" + s1.Battery);
		System.out.println("Bluetooth :" + s1.Bluetooth );
		System.out.println("Audiojack :" +s1.Audiojack );
		System.out.println("ChargingPort :" + s1.ChargingPort);
		
	}
}