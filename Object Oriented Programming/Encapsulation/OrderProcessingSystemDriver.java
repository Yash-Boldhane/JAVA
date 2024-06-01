package Encapsulation;

public class OrderProcessingSystemDriver {
	public static void main(String[]args) {
		OrderProcessingSystem o1=new OrderProcessingSystem("ABCD", "22-5-2024","1234");
		o1.setOrderAmount("ABCD","1234","22-5-2024",500.0);
	}
}