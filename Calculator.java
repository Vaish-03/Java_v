package cdpsession1;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] vaishnavi) {
		int choice;
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("choice");
		choice =sc.nextInt();
		
//		Scanner sc =new Scanner(System.in);
		
		
		switch(choice) {
		case 1:
			System.out.println("enter num1");
			a=sc.nextInt();
			System.out.println("enter num2");
			b=sc.nextInt();
			c = a+b; // int c is not perfect bcz it gives an error(duplication)
			//if we decalre c in twi or more times then int is not mandatory to writeonly write c
			System.out.println("Addition of a and b is " + c);
			break;
		case 2:
			System.out.println("enter num1");
			a=sc.nextInt();
			System.out.println("enter num2");
			b=sc.nextInt();
			c = a-b;
			System.out.println("Subtraction of a and b is "+c);
			break;
		case 3:
			System.out.println("enter num1");
			a=sc.nextInt();
			System.out.println("enter num2");
			b=sc.nextInt();
			c = a*b;
			System.out.println("Multiplication of a and b is "+c);
			break;
		case 4:
			System.out.println("enter num1");
			a=sc.nextInt();
			System.out.println("enter num2");
			b=sc.nextInt();
			c = a/b;
			System.out.println("division of a and b is "+c);
			break;
		case 5:
			System.out.println("enter num1");
			a=sc.nextInt();
			System.out.println("enter num2");
			b=sc.nextInt();
			c= a%b;
			System.out.println("remainder of a and b is "+c);
			break;
		default:
			System.out.println("Wrong choice");
			
			
			
			
		}
	}

}
