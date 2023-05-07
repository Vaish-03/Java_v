package cdpsession1;
import java.util.Scanner;
public class Bank_main {
	
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice:");
		choice=sc.nextInt();
		Bank1 m1=new Bank1();
	
		
		switch(choice) {
		case 1:
			m1.Roi();
			break;
		case 2:
			m1.Accbal();
			break;
		case 3:
			m1.AccNo();
			break;
		case 4:
			m1.IFSCcode();
			break;
		default:
			System.out.println("Wrong choice");
			
		}
		
		
	}

}
