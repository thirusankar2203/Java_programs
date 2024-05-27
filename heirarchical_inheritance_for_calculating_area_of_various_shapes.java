import java.util.Scanner;

class Product{
    int product;
    int a, b;
    void insert(int x, int y){
        a = x;
        b = y;
    }
    void prod(){
        product = a*b;
    }
}

class Rectangle extends Product{
    void display_rect(){
        System.out.println("Area of the Rectangle is "+product);
    }
}

class Square extends Product{
    void display_sq(){
        System.out.println("Area of the Square is "+product);
    }
}

class Circle extends Product{
    void display_circle(){
        System.out.println("Area of the Circle is "+(3.14*product));
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Choose the shape for which you have to calculate the Area :\n1 . Rectangle\n2 . Square\n3 . Circle");
    	int flag = 1;
    	while(true)    
    	{
    	    if(flag==0)
    	    {
    	        break;
    	    }
    	    System.out.println("\nEnter your choice : ");
    	    int choice = sc.nextInt();
    	    switch(choice)
    	    {
    	        case 0:
    	            System.out.println("Exitting.....");
    	            flag=0;
    	            break;
    	        case 1:
    	            System.out.println("Enter the length and breadth of the Rectangle .....");
    	            int len = sc.nextInt();
    	            int bre = sc.nextInt();
    	            System.out.println("Length is "+len+"\nBreadth is "+bre);
    	            Rectangle rec = new Rectangle();
    	            rec.insert(len,bre);
    	            rec.prod();
    	            rec.display_rect();
    	            break;
    	            
    	        case 2:
    	            System.out.println("Enter the side of the Square .....");
    	            int side = sc.nextInt();
    	            System.out.println("Side length is "+side);
    	            Square sq = new Square();
    	            sq.insert(side,side);
    	            sq.prod();
    	            sq.display_sq();
    	            break;
    	            
    	        case 3:
    	            System.out.println("Enter the radius of the Circle .....");
    	            int rad = sc.nextInt();
    	            System.out.println("Radius is "+rad);
    	            Circle cir = new Circle();
    	            cir.insert(rad,rad);
    	            cir.prod();
    	            cir.display_circle();
    	            break;
    	            
    	        default:
    	            System.out.println("Wrong choice !! PLease enter the correct choice");
    	    }
    	}
	}
}
