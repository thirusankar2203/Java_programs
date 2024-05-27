package Laptop;

import java.util.Scanner;

public class Laptop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter your name : ");
			String name = sc.nextLine();
			System.out.print("Enter your mobile number : ");
			String mobile = sc.nextLine();
			System.out.print("Enter the Laptop Brand you wish to buy : ");
			String brand = sc.nextLine();
			System.out.print("Enter the Model of the selected brand you wish to buy : ");
			String model = sc.nextLine();
			System.out.print("Which RAM variant of laptops do you need (8/16 GB) : ");
			int ram = sc.nextInt();
			System.out.print("Do any warranty for your laptop needs to be added. Type true or false to select : ");
			boolean warranty = sc.nextBoolean();
			
			int period;
			
			if(warranty == true)
			{
				System.out.print("Select your suitable warranty period (2years or 3 years) : ");
				period = sc.nextInt();
				sc.nextLine();
			}
			
			else
			{
				period = 0;
			}
			
			Laptops lap = new Laptops(name, mobile, brand, model, ram, period);
			int x = lap.isStockAvailable();
			if(x==1)
			{
				lap.originalPrize();
				lap.addAccesories();
				lap.addWarranty();
				lap.addGST();
				lap.generateBill();
			}
			
			else
			{
				continue;
			}
		}
		

		

	}

}
