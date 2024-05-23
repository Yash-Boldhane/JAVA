class EcommerceDriver
{
	public static void main(String[]args)
	{
		EcommercePage e1=new EcommercePage();
		e1.Login="ENTER YOUR LOGIN ID";
		e1.Sign="CREATE NEW ACCOUNT";
		e1.UserLogin="USER WILL ENTER THE LOGIN PAGE";
		e1.PaymentPage="PAYMENT WILL BE MADE USING ONLINE PAYMENT OR CASH";
		e1.Tracking="YOUR ORDER WILL BE TRACKED";
		e1.DeliveryDetails="THE ADDRESS AT WHICH THE ORDER WILL BE DELIVERED";

			
		System.out.println("Reference :"+e1);
		System.out.println("login :"+e1.Login);
		System.out.println("Signup :"+e1.Sign);
		System.out.println("User-Login :"+e1.UserLogin);
		System.out.println("Payment :"+e1.PaymentPage);	
		System.out.println("Tracking :"+e1.Tracking);
		System.out.println("Delivery Address  :"+e1.DeliveryDetails);
		
		
	}
}