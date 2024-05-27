/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("CNS", "S");
		result.put("ESL", "S");
		result.put("NT", "A");
		result.put("MP", "S");
		result.put("WCL", "S");
		result.put("ITC", "A");
		result.put("IOE", "B");
		result.put("WC", "B");
		result.forEach((subject, grade) -> {
		    System.out.println("The grade corrsponding to the subject " + subject + " is " + grade);
		});
		
	}
}
