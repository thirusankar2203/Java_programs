/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int n, flag=1;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i=2;i<n-1;i++)
		{
		    if(n%i==0)
		    {
		        flag=0;
		        break;
		    }
		}
		if(flag==1)
		{
		    System.out.println("The given number is a prime number.....");
		}
		else{
		    System.out.printf("The given number is not prime number.....");
		}
	}
}
