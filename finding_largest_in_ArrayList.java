import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        for(int j=0;j<4;j++)
	        {
    	        int x = sc.nextInt();
    	        array.add(x);
	        }
	        int maxValue = Collections.max(array);
	        int maxIndex = array.indexOf(maxValue);
	        int sum=0;
	        for(int j=0;j<4;j++)
	        {
	            if(j==maxIndex)
	            {
	                continue;
	            }
	            else
	            {
	                sum = sum+array.get(j);
	            }
	        }
	        if(maxValue>sum)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	        }
	    }
	}
}
