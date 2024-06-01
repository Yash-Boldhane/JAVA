package Encapsulation;

public class ecommerce {
	private String productId;
	private String productName;
	private double price=5000;
	private int stock=10;
	
	
	ecommerce()
	{
		
	}
	
	ecommerce(String productId,String productName)
	{
		this.productId=productId;
		this.productName=productName;
		
	}
	
	public String getProductId()
	{
		return productId;
	}
	public String getProductName()
	{
		return productName;
	}
	public double getPrice()
	{
		return price;
	}
	public double getStock()
	{
		return stock;
	}
	
	public void setPrice(String productId,String productName,int item)
	{
		if(this.productId==productId && this.productName==productName)
		{
			
			if(stock>item)
			{
				System.out.println(price);
			}
			else
			{
				this.price=this.price+1000;
				System.out.println(this.price);
			}
			
		}
		else
		{
			System.err.println("Invalid Credentials!!!!");
		}
	}

}
