import java.util.Scanner;

class Bank{
    int interest_rate;
    void interest()
    {
        interest_rate = 1;
    }
}

class Sbi extends Bank{
    void interest()
    {
        interest_rate = 5;
        System.out.printf("SBI interest rate is %d\n",interest_rate);
    }
}

class Iob extends Bank{
    void interest()
    {
        interest_rate = 7;
        System.out.printf("IOB interest rate is %d\n",interest_rate);
    }
}

class Kvb extends Bank{
    void interest()
    {
        interest_rate = 10;
        System.out.printf("KVB interest rate is %d\n",interest_rate);
    }
}

public class Main
{
	public static void main(String[] args) {
	    Sbi x = new Sbi();
	    x.interest();
	    Iob y = new Iob();
	    y.interest();
	    Kvb z = new Kvb();
	    z.interest();
	    
	}
}
