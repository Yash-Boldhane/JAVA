package Has_a_Relationship_Lazy_Binding;

public class Computer {
		String brand;
		String os;
		int ram;
		int hd;
		String processor;
		
		Pendrive p;
		
		
		Computer()
		{
			
		}
		Computer(String brand,String os, int ram, int hd, String processor)
		{
			this.brand=brand;
			this.os=os;
			this.ram=ram;
			this.hd=hd;
			this.processor=processor;
		}
		
		public void insertPendrive(String brand, double price, int storage, double speed)
		{
			p=new Pendrive(brand, price, storage, speed);
			System.out.println("Pendrive inserted");
		}
		
		public void displayComputer()
		{
			System.out.println(brand);
			System.out.println(os);
			System.out.println(ram);
			System.out.println(hd);
			System.out.println(processor);
		}
}
