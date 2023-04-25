package cdpsession1;

import java.util.Scanner;

public class Switch {
	public static void main(String[] vaishnavi) {
		int choice=2;
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter choice");
		//we can use only unique values duplicate values are not allowed
		switch(choice) { 
		case 1:
			System.out.println("Case 1");
			break;
		case 1+1: //arithmatic operators we can use
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		default:
			System.out.println("wrong input");
			break;
		}
	}

}
