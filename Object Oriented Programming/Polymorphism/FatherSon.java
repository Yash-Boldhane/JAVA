package Polymorphism;

public class FatherSon {
	public static void main(String[] args) {
	Father f1=new Son();//Upcasting
		
	f1.finance();
	f1.image();// Method overriding ... in the above we can see that we are calling the image method from parent class. But image method from child class is executing. 
				//It is executing because we are having method of same name in both the classes so at that time compiler tries to execute parent class method.
	}			//But at the runtime JVM executes the child method because overriding comes under runtime polymorphism.
}
