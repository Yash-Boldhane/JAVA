package Inheritance;

public class Paytm extends UPI{
		String  favoritecontacts;
		String chat;
		
		public Paytm() {
			// TODO Auto-generated constructor stub
		
		}
		
		Paytm(String name, String Virtualid, String password, String favoritecontacts,String chat)
		{
			this.name=name;
			this.Virtualid=Virtualid;
			this.password=password;
			
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
