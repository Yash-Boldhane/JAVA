package Inheritance;

public class GPAY1 extends UPI1{
		String rewards;
		String Offers;
		
		public GPAY1() {
			// TODO Auto-generated constructor stub
		}
		GPAY1(String name, String Virtualid, String password,String rewards, String Offers)
		{
			super(name,Virtualid,password);

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
