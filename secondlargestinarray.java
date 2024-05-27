/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int large=0,x=0;
		int[] arr = {22,12,33,42,200,100};
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>large)
		    {
		        large=arr[i];
		        x = i;
		    }
		}
		arr[x]=0;
		large=0;
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]>large)
		    {
		        large=arr[i];
		        x = i;
		    }
		}
		System.out.println(large);
	}
}
