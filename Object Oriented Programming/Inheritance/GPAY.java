package Inheritance;

public class GPAY extends UPI {
		String rewards;
		String Offers;
		
		public GPAY() {
			// TODO Auto-generated constructor stub
		}
		GPAY(String name, String Virtualid, String password,String rewards, String Offers)
		{
			this.name=name;
			this.Virtualid=Virtualid;
			this.password=password;
			
			this.rewards=rewards;
			this.Offers=Offers;
		}
		public void displayGpay()
		{
			displayUpi();
			System.out.println(rewards);
			System.out.println(Offers);
		}
		
}
