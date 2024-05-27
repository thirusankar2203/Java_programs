/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] arr = {203,21,200,2,20,25,101};
		int temp=0;
		for(int i=0;i<arr.length/2;i++)
		{
		    for(int j=i+1;j<arr.length/2;j++)
		    {
		        if(arr[i]>arr[j])
		        {
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		for(int i=arr.length/2;i<arr.length;i++)
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		        if(arr[i]<arr[j])
		        {
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);
		}
	}
}
