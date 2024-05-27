import java.util.Scanner;

class Overload{
    int x, y, z;
    String s1, s2;
    void add(int a, int b)
    {
        x = a;
        y = b;
        System.out.printf("Sum of adding two numbers is %d\n",x+y);
    }
    
    void add(int k, int l, int m)
    {
        x = k;
        y = l;
        z = m;
        System.out.printf("Sum of adding three numbers in %d\n", x+y+z);
    }
    
    void add(String x, String y)
    {
        s1 = x;
        s2 = y;
        System.out.println("After concatenating the two string : "+s1+s2+"\n");
    }
}

public class Main
{
	public static void main(String[] args) {
	    Overload ov = new Overload();
	    ov.add(12,13);
	    ov.add(25,50,25);
	    ov.add("Thiru","murugan");
	    
	}
}
