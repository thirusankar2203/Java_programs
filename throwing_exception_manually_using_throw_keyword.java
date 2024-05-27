/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    static void divide(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("divisor can't be zero");
        }
        else
        {
            System.out.println(a/b);
        }
    }
	public static void main(String[] args) {
		int a=7;
		int b;
		Scanner sc = new Scanner(System.in);
		while(true){
    		try{
    		    System.out.println("Enter the dividend and divisor : ");
    		    a = sc.nextInt();
    		    b = sc.nextInt();
                divide(a, b);
    		    break;
    		}
    		catch(ArithmeticException E)
    		{
    		    System.out.println(E);
    		}
		}
	}
}
