package Inheritance;

public class Paytm1 extends UPI1{
		String  favoritecontacts;
		String chat;
		
		public Paytm1() {
			// TODO Auto-generated constructor stub
		
		}
		
		Paytm1(String name, String Virtualid, String password, String favoritecontacts,String chat)
		{
			super(name,Virtualid,password);
			this.favoritecontacts=favoritecontacts;
			this.chat=chat;
		}
		
		public void displayPaytm()
		{
			displayUpi();
			System.out.println(favoritecontacts);
			System.out.println(chat);
		}
		
}
