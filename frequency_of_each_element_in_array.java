/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,j,k,x=0,flag=1;
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
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
		            flag = 0;
		            break;
		        }
		        else{
		            
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
	            System.out.printf("The frequency of %d is %d",arr[i],count);
    		    arr1[x] = arr[i];
    		    x++;
		    }
		    if(flag==0)
		    {
		        flag=1;
		    }
		    
		}
		
	}
}
