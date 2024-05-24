class Speaker
{
	String VolumeButton;
	String Power;
	String Battery;
	String Bluetooth;
	String Audiojack;
	String ChargingPort;

	Speaker(String VolumeButton,String Power,String Battery,String Bluetooth,String Audiojack,String 		ChargingPort)
	{
		System.out.println("From Parametarized Constructor");
		this.VolumeButton=VolumeButton;
		this.Power=Power;
		this.Battery=Battery;
		this.Bluetooth=Bluetooth;
		this.Audiojack=Audiojack;
		this.ChargingPort=ChargingPort;
	}
	
	public void displaySpeaker()
	{
		System.out.println(VolumeButton);
		System.out.println(Power);
		System.out.println(Battery);
		System.out.println(Bluetooth);
		System.out.println(Audiojack);
		System.out.println(ChargingPort);
	

	}


}