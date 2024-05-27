/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a=7;
		int b;
		Scanner sc = new Scanner(System.in);
		while(true){
    		try{
    		    System.out.println("Enter the divisor : ");
    		    b = sc.nextInt();
    		    System.out.println(a/b);
    		    break;
    		}
    		catch(Exception E)
    		{
    		    System.out.println("Enter the correct data type input.....");
    		}
    		
    		finally{
    		    System.out.println("Finnaly block executed");
    		}
		}
	}
}
