/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void printArray(int arr[])
    {
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
	public static void main(String[] args) {
		printArray(new int[]{1,2,3,4,5,6,7,8,9,0});
	}
}
