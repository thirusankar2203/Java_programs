/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
		    int x = sc.nextInt();
		    arr[i] = x;
		    int count=0;
		    for(int j=2;j<x;j++)
		    {
		        if(x%j==0)
		        {
		            count++;
		        }
		    }
		    if(count==0)
		    {
		        System.out.println(x);
		    }
		}
		
	}
}
