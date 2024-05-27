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
		char x = sc.next().charAt(0);
		int ascii = x;
		if(ascii>=65 && ascii<=90)
		{
		    System.out.println("The character is a alphabet");
		}
		else if(ascii>=97 && ascii<=122)
		{
		    System.out.println("The character is a alphabet");
		}
		else{
		    System.out.println("The given character is not a alphabet");
		}
	}
}
