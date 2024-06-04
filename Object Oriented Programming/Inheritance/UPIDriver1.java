package Inheritance;

public class UPIDriver1 {
	public static void main(String[] args) {
		Paytm1 p1=new Paytm1("Yash", "456aa1235ss", "ABC@123", "Harman SIngh", "Yes");
		p1.displayPaytm();
		System.out.println("-----------------------------------------------------------");
		p1.displayUpi();
		
		
		System.out.println("-----------------------------------------------------------");
		GPAY1 g1=new GPAY1("Sahil", "dasdasd12as1d3sa13", "SBV@456", "Yes", "Yes");
		g1.displayGpay();
		
		System.out.println("---------------------------------------------------------------");
		g1.displayUpi();
	}
}
