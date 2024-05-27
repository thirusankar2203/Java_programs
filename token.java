import java.util.Scanner;

public class Main
{
    static int[] timestamp = new int[20];
    static String[] names = new String[20];
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<t;i++)
	    {
	        String name = sc.nextLine();
	        String time = sc.nextLine();
	        String time1 = "";
	        char[] times = time.toCharArray();
	        for(int j=0;j<times.length;j++)
	        {
	            if(times[j]!=':')
	            {
	                time1 = time1 + times[j];
	            }
	            else{
	                continue;
	            }
	        }
	        int ts = Integer.parseInt(time1);
	        timestamp[i] = ts;
	        names[i] = name;
	    }
	    for(int i=0;i<t;i++)
	    {
    	    for(int j=i+1;j<t;j++)
    	    {
    	        if(timestamp[i]>timestamp[j])
    	        {
    	            int temp = timestamp[i];
    	            timestamp[i] = timestamp[j];
    	            timestamp[j] = temp;
    	            
    	            String temp1 = names[i];
    	            names[i] = names[j];
    	            names[j] = temp1;
    	        }
    	    }
	    }
	    
	    for(int i=0;i<t;i++)
	    {
	        System.out.println(names[i] + " " + String.valueOf(i+1));
	    }
	}
}
