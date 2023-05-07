package cdpsession1;
//Parameterized non-static
import java.util.Scanner;
public class Para_main {
	public static void main(String[] args) {
		int choice;
		int a,b;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter choice");
	    choice=sc.nextInt();
		Parameterized m1=new Parameterized();
		
		 switch(choice) {
		 case 1:
			 System.out.println("Enter value of a");
			 a=sc.nextInt();
			 System.out.println("Enter value of b");
			 b=sc.nextInt();
			 m1.add(a, b);
			 break;
			 
		 case 2:
			 System.out.println("Enter value of a");
			 a=sc.nextInt();
			 System.out.println("Enter value of b");
			 b=sc.nextInt();
			 m1.sub(a, b);
			 break;
		 case 3:
			 System.out.println("Enter value of a");
			 a=sc.nextInt();
			 System.out.println("Enter value of b");
			 b=sc.nextInt();
			 m1.mul(a, b);
			 break;
		 case 4:
			 System.out.println("Enter value of a");
			 a=sc.nextInt();
			 System.out.println("Enter value of b");
			 b=sc.nextInt();
			 m1.div(a, b);
			 break;
		 default:
			 System.out.println("Wrong choice");
		 }
			 
	
		
	}

}
