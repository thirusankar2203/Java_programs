/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int large=0,x=0,k=0;
	    
		int[] arr = {22,12,33,42,200,100};
		int[] arr1 = new int[arr.length];
		for(int i=arr.length;i>0;i--)
		{
		    arr1[k]=arr[i-1];
		    k++;
		}
		for(int i=0;i<arr1.length;i++)
		{
		    System.out.println(arr1[i]);
		}
	}
}
