package cdpsession1;

public class Day4 {
     //conditional statement (if...else)
	public static void main(String[] args) {
		int marks=95;
		if((marks >=90)&&(marks<=80)) {
			System.out.println("student get 0+ grade");
		}else if(marks >=80&& marks<=60) {
			System.out.println("student get A grade");
			
		}else if(marks>=60&&marks<=40) {
			System.out.println("student get B grade");
			
		}else if(marks>=40 && marks <=30) {
			System.out.println("student get C grade");
		}
		else  {
			System.out.println("student fail");
		}
	}
}
