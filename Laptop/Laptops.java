package Laptop;

import java.lang.Boolean;

public class Laptops {
	String customerName;
	String mobileNo;
	String brandName;
	String model;
	int prize=0;
	int ram=0;
	int warrantyPeriod=0;
	double cgst = 0;
	int cgst1 = 0;
	double sgst = 0;
	int sgst1 = 0;
	int asusVivobookPrize8gb = 47000;
	int asusVivobookPrize16gb = 52000;
	int asusTufGamingPrize8gb = 67000;
	int asusTufGamingPrize16gb = 80000;
	int hpPavilionPrize8gb = 49000;
	int hpPavilionPrize16gb = 76000;
	int hp15sPrize8gb = 48000;
	int hp15sPrize16gb = 50000;
	int accesoriesPrize = 2500;
	int warranty2Prize = 699;
	int warranty3Prize = 999;
	int laptopPrize  = 0;
	int warrantyGiven = 0;
	int flag = 0;
	
	Laptops(String customerName, String mobileNo, String brandName, String model, int ram, int warrantyPeriod)
	{
		this.brandName = brandName;
		this.model = model;
		this.ram = ram;
		this.warrantyPeriod = warrantyPeriod;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
	}
	
	
    public int isStockAvailable()
	{
		if(this.brandName.equals("ASUS"))
		{
			if(this.model.equals("TUF") || this.model.equals("VIVOBOOK"))
			{
				System.out.println("Selected brand and model available");
				this.flag = 1;
			}
			
			else	
			{
				System.out.println("Selected brand/Model not available. Please select another brand/model");
				this.flag = 0;
			}
		}
		
		else if(this.brandName.equals("HP"))
		{
			if(this.model.equals("15S") || this.model.equals("PAVILION"))
			{
				System.out.println("Selected brand and model available");
				this.flag = 1;
			}
			
			else	
			{
				System.out.println("Selected brand/Model not available. Please select another brand/model");
				this.flag = 0;
			}
		}
		
		else {
			System.out.println("Selected brand/Model not available. Please select another brand/model");
			this.flag = 0;
		}
		return this.flag;
	}
    
    public void originalPrize()
    {
    	if(brandName.equals("ASUS") && model.equals("VIVOBOOK"))
    	{
    		if(ram==8)
    		{
    			this.laptopPrize = asusVivobookPrize8gb;
    			this.prize += laptopPrize; 
    		}
    		else if(ram==16)
    		{
    			this.laptopPrize = asusVivobookPrize16gb;
    			this.prize += laptopPrize;
    		}
    	}
    	
    	if(brandName.equals("ASUS") && model.equals("TUF"))
    	{
    		if(ram==8)
    		{
    			this.laptopPrize = asusTufGamingPrize8gb;
    			this.prize += laptopPrize; 
    		}
    		else if(ram==16)
    		{
    			this.laptopPrize = asusTufGamingPrize16gb;
    			this.prize += laptopPrize;
    		}
    	}
    	
    	if(brandName.equals("HP") && model.equals("PAVILION"))
    	{
    		if(ram==8)
    		{
    			this.laptopPrize = hpPavilionPrize8gb;
    			this.prize += laptopPrize; 
    		}
    		else if(ram==16)
    		{
    			this.laptopPrize = hpPavilionPrize16gb;
    			this.prize += laptopPrize;
    		}
    	}
    	
    	if(brandName.equals("HP") && model.equals("15S"))
    	{
    		if(ram==8)
    		{
    			this.laptopPrize = hp15sPrize8gb;
    			this.prize += laptopPrize; 
    		}
    		else if(ram==16)
    		{
    			this.laptopPrize = hp15sPrize16gb;
    			this.prize += laptopPrize;
    		}
    	}
    }
    
    public void addAccesories()
    {
    	this.prize += accesoriesPrize;
    }
    
    public void addWarranty()
    {
    	if(this.warrantyPeriod == 2)
    	{
    		this.prize += warranty2Prize;
    		this.warrantyGiven = warranty2Prize;
    	}
    	else if(this.warrantyPeriod == 3)
    	{
    		this.prize += warranty3Prize;
    		this.warrantyGiven = warranty3Prize;
    	}
    }
    
    public void addGST()
    {
    	cgst = (this.prize)*(0.18);
    	cgst1 = (int)cgst;
    	sgst = (this.prize)*(0.18);
    	sgst1 = (int)sgst;
    	this.prize = (this.prize+sgst1+cgst1);
    }
    
    public void generateBill()
    {
    	System.out.println("Customer Name : " + this.customerName + "\t\tMobile No. : " + this.mobileNo + "\n\n");
    	System.out.println("Brand Name : " + this.brandName + "\t\tModel Name : " + this.model);
    	System.out.printf("Laptop Prize = %d\n", this.laptopPrize);
    	System.out.printf("Accesories = %d\n", this.accesoriesPrize);
    	System.out.printf("Warranty = %d\n", this.warrantyGiven);
    	System.out.printf("CGST = %d\n", this.cgst1);
    	System.out.printf("SGST = %d\n", this.sgst1);
    	System.out.printf("Total = %d\n", this.prize);
    	
    	
    }
    
    
    
    
}
