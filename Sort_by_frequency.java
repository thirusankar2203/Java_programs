/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,j,k,x=0,flag=1,temp;
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		int[] count1 = new int[n];
		for(i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    int count=0;
		    for(j=0;j<arr1.length;j++)
		    {
		        if(arr[i]==arr1[j])
		        {
		            flag=0;
		            break;
		        }
		    }
		    
		    if(flag==1)
		    {
		        flag = 0;
		        for(k=0;k<n;k++)
	            {
	                if(arr[i]==arr[k])
	                {
	                    count++;
	                }
	            }
    		    arr1[x] = arr[i];
    		    count1[x] = count;
    		    x++;
		    }
		    if(flag==0)
		    {
		        flag=1;
		    }
		    
		}
		for(i=0;i<x;i++)
		{
		    for(j=i+1;j<x;j++)
		    {
		        if(count1[i]>count1[j])
		        {
		            temp = count1[j];
		            count1[j] = count1[i];
		            count1[i] = temp;
		            temp = arr1[j];
		            arr1[j] = arr1[i];
		            arr1[i] = temp;
		        }
		    }
		}
		for(i=0;i<x;i++)
		{
		    System.out.printf("%d_____%d\n",count1[i],arr1[i]);
		}
		
	}
}
