/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class UserDefinedException extends Exception{
    String msg;
    UserDefinedException(String msg)
    {
        this.msg = "Error : "+msg;
    }
    String getMsg(){
        return this.msg;
    }
}
public class Main
{
    static void divide(int a, int b) throws UserDefinedException,ArithmeticException
    {
        if(b==0)
        {
            throw new UserDefinedException("divisor can't be zero");
        }
        else if(a==0)
        {
            throw new ArithmeticException("dividend can't be zero");
        }
        else
        {
            System.out.println(a/b);
        }
    }
	public static void main(String[] args) {
		int a=7;
		int b;
		Scanner sc = new Scanner(System.in);
		while(true){
    		try{
    		    System.out.println("Enter the dividend and divisor : ");
    		    a = sc.nextInt();
    		    b = sc.nextInt();
                divide(a, b);
    		    break;
    		}
    		catch(UserDefinedException E)
    		{
    		    System.out.println(E.getMsg());
    		}
    		catch(ArithmeticException X)
    		{
    		    System.out.println(X.getMessage());
    		}
		}
	}
}
