/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;
class PersonalDetails{
    private int age;
    private String name;
    
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
public class Main
{
	public static void main(String[] args) {
	    ArrayList<PersonalDetails> details = new ArrayList<PersonalDetails>();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<n;i++)
	    {
	        details.add(new PersonalDetails());
	    }
	    
	    for(PersonalDetails pers:details)
	    {
	        System.out.printf("Enter the name of the person%d : ",(details.indexOf(pers))+1);
	        String name1 = sc.nextLine();
	        System.out.printf("Enter the age of the person%d : ",(details.indexOf(pers))+1);
	        int age1 = sc.nextInt();
	        sc.nextLine();
	        pers.setName(name1);
	        pers.setAge(age1);
	    }
	    
	    for(PersonalDetails pers:details)
	    {
	        System.out.printf("Name of person%d is %s\nAge of person%d is %d\n\n\n",(details.indexOf(pers))+1,pers.getName(),(details.indexOf(pers))+1,pers.getAge());
	    }
	}
}
