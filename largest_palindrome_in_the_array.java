import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n,i,pali,rem=0,temp,large = 0;
		System.out.println("Enter the size of the array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
		    pali = 0;
		    temp = arr[i];
		    while(arr[i]>0)
		    {
		        rem = arr[i]%10;
		        pali= (pali*10)+rem;
		        arr[i] = arr[i]/10;
		    }
		    if(pali>large)
		    {
		        large = pali;
		    }
		}
		System.out.printf("The largest palindrome in the array is %d",large);
	}
}
