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
		String str = sc.nextLine();
		int count1=0, count2=0;
		for(int i=0;i<str.length();i++)
		{
		    if(str.charAt(i)=='(')
		    {
		        count1++;
		    }
		    else if(str.charAt(i)==')')
		    {
		        count2++;
		    }
		    else
		    {
		        continue;
		    }
		}
		
		if(count1==count2)
		{
		    System.out.println(0);
		}
		else
		{
		    System.out.println(1);
		}
	}
}
