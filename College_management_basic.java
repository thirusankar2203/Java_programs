import java.util.Scanner;

class College{
    String university_name = "Puducherry Technological University";
    int code = 101;
    String address = "Pillaichavady, East Coast Road, Puducherry, 605014";
}

class Teacher extends College{
    String name;
    int id;
    String qual;
    String gender;
    
    void addNew(String name, int id, String qual, String gender)
    {
        this.name = name;
        this.id = id;
        this.qual = qual;
        this.gender = gender;
        System.out.println("New Teacher added");
    }
    
    void update(String ch, String x)
    {
        if(ch=="name")
        {
            this.name = x;
        }
        else if(ch=="qual")
        {
            this.qual = x;
        }
        else if(ch=="gender")
        {
            this.gender = x;
        }
        else{
            System.out.println("Wrong choice");
        }
    }
    void display()
    {
        System.out.println("Professor name : "+name+"\nGender : "+gender+"\nQualification : "+qual+"\nID : "+String.valueOf(id)+"\nUniversity name : "+university_name);
    }
}



public class Main
{
	public static void main(String[] args) {
	    Teacher t1 = new Teacher();
	    t1.addNew("Saminadhan",101,"B.Tech, M.Tech","Male");
	    t1.display();
	    Teacher t2 = new Teacher();
	    t2.addNew("Gnanou Floerence Sudha",102,"B.Tech, M.Tech, PhD","Female");
	    t2.display();
	}
}
