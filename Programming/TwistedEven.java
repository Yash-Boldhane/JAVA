class TwistedEven {
	public static void main(String[]args) {
		int num=223456;
		int reverse=0;

		if(num%2==0) {
			while(num>0) {
				int last=num%10;
				reverse=reverse * 10+last;
				num=num/10;
			}

			if(reverse%2==0) {
				System.out.println("It is a even twisted number");
			}

			else {
				System.out.println("It is not a even twisted number");
			}




		}

		else {
			System.out.println("It is not a even twisted number");
		}





	}


}