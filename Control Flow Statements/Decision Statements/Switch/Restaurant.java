import java.util.Scanner;

class Restaurant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*******Welcome to Bhojnalaye*******");
		System.out.println("Enter the choice of your food");
		System.out.println("a.veg");
		System.out.println("b.Non-veg");

		char veg = sc.next().charAt(0);
		switch (veg) {
			case 'a': {

				System.out.println("Menu:");
				System.out.println("1.Vegetable Spring Rolls:--------Rs.120  ");
				System.out.println("2.Paneer Tikka:--------Rs.170");
				System.out.println("3.Stuffed Mushrooms:--------Rs.100");
				System.out.println("4.Aloo Tikki:--------Rs.150");
				System.out.println("5.Spinach and Feta Phyllo Triangles:--------Rs.200");
				System.out.println("Please enter the choice:");

				int veg1 = sc.nextInt();
				switch (veg1) {
					case 1: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 120));
						break;
					}

					case 2: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 170));
						break;
					}

					case 3: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 100));
						break;
					}

					case 4: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 150));
						break;
					}

					case 5: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 200));
						break;
					}

				}

			}

			case 'b':

				System.out.println("Menu:");
				System.out.println("1.Chicken Biryani:--------Rs.130  ");
				System.out.println("2.Chicken curry:--------Rs.150");
				System.out.println("3.Butter chicken:--------Rs.230");
				System.out.println("4.Chicken Chettinad:--------Rs.150");
				System.out.println("5.Chicken Vindaloo:--------Rs.200");
				System.out.println("Please enter the choice:");

				int Non_veg1 = sc.nextInt();
				switch (Non_veg1) {
					case 1: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 130));
						break;
					}

					case 2: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 150));
						break;
					}

					case 3: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 230));
						break;
					}

					case 4: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 150));
						break;
					}

					case 5: {
						System.out.println("Enter the quantity of the food in plates");
						int num = sc.nextInt();

						System.out.println("Your total bill is :" + (num * 200));
						break;
					}

				}

		}
	}

}