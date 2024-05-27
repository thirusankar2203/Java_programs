package Laptop;

public class Lap {

	public static void main(String[] args) {
		Laptops lap = new Laptops("Thiru","9629701158","ASUS","VIVOBOOK",8,3);
		lap.isStockAvailable();
		lap.originalPrize();
		lap.addAccesories();
		lap.addWarranty();
		lap.addGST();
		lap.generateBill();

	}

}
