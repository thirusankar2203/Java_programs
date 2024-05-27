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
		if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
		{
		    System.out.println("THe given character is a vowel");
		}
		else{
		    System.out.println("The given character is a consonant");
		}
	}
}
