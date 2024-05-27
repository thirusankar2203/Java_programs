import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
		    String num = sc.nextLine();
		    char[] num1 = num.toCharArray();
		    char[] num3 = new char[num.length()+1];
		    int flag=1;
		    for(int j=0;j<num.length();j++)
		    {
		        if(num1[j]=='9')
		        {
		            continue;
		        }
		        else
		        {
		            flag=0;
		            break;
		        }
		    }
		    if(flag==1)
		    {
		        num3[0]='1';
		        for(int k=1;k<num.length()+1;k++)
		        {
		            num3[k]='0';
		        }
		        t--;
		        String num4 = new String(num3);
		        System.out.println(num4);
		        continue;
		    }
		    else{
    		    for(int j=num.length()-1;j>=0;j--)
    		    {
    		        int n1 = num1[j] - '0';
    		        if(n1<9)
    		        {
    		            int n = n1 + 1;
    		            num1[j] = (char)(n+'0');
    		            break;
    		        }
    		        else if(n1==9)
    		        {
    		            num1[j]='0';
    		            int x = num1[j-1]-'0'+1;
    		            if((j-1)==0)
    		            {
    		                continue;
    		            }
    		            num1[j-1]=(char)(x+'0'-1);
    		            
    		        }
    		    }
    		    String num2 = new String(num1);
    		    System.out.println(num2);
		    }
		    t--;
		}

	}
}
