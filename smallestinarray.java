/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
		int[] arr = {22,12,33,42,200,100};
		int small=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]<small)
		    {
		        small=arr[i];
		    }
		}
		System.out.println(small);
	}
}
