/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int a=0, b=1, c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<20;i++)
		{
		    c=a+b;
		    System.out.println(c);
		    a=b;
		    b=c;
		}
	}
}
