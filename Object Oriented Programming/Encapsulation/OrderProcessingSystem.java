package Encapsulation;

public class OrderProcessingSystem {
	private String orderId;
	private String orderDate;
	private String customerName;
	private double orderAmount=10000.0;


	OrderProcessingSystem()
	{
	
	}
		
	OrderProcessingSystem(String orderId,String orderDate,String customerName)
	{
		this.orderId=orderId;
		this.orderDate=orderDate;
		this.customerName=customerName;
		
	}
	
	public String getOrderId() {
		return orderId;
		
	}
	public String getOrderDate() {
		return orderDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(String orderId, String customerName ,String Date,double Amount) {
		if(this.orderId==orderId && this.customerName==customerName)
		{
			System.out.println("Congratulations You have login Successfully");
			if(orderDate==Date)
			{
				orderAmount=orderAmount-1000;
				System.out.println("Congratulations you have ordered the item before the mentioned date so you have received a discount of rs 1000 on your product!!!");
				System.out.println("New amount to be paid is : "+orderAmount);
			}
		}
			else
			{
				System.out.println(orderAmount);
			}
		}
	}




