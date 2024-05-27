/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    static int[] printArray(int[] unsortedArray)
    {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        
        // Sort the copied array
        Arrays.sort(sortedArray);
        
        // Return the sorted array
        return sortedArray;
    }
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[1][0] = 1;
		arr[1][1] = 1;
		arr[1][2] = 2;
		arr[2][0] = 3;
		arr[2][1] = 4;
		arr[2][2] = 5;
		for(int[] x:arr)
		{
		    for(int y:x)
		    {
		        System.out.println(y);
		    }
		    
		}
	}
}
