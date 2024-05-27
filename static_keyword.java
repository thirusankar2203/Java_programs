/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Calculate{  
    static int x = 25;
    int y;
  
    void insert(int len){
        y = len;
    }
  
    void calculate()
    {
        System.out.println(x*y);
    }
}
public class Main
{
	public static void main(String[] args) {
		Calculate res = new Calculate();
		Calculate.x = 20;
		res.insert(4);
		res.calculate();
	}
}
