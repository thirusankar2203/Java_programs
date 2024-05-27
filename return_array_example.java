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
		int[] arr = {1,2,3,4,8,6,7,5,9,0};
		int[] arr1 = new int[10];
		arr1 = printArray(arr);
		for(int x:arr1)
		{
		    System.out.println(x);
		}
	}
}
