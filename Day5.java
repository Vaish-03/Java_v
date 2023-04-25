package cdpsession;

public class Day5 {
	public static void main(String[] args) {
		int sum=0;
		for( int i =0;i<=10;i++){
			if(i%2==0) {
				System.out.print("-"+i*2);
			
			}else if(i%2==1){
				System.out.print("+"+i*2);
			}
		}
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum =sum+i;
			
			}
     	}
		System.out.println("\n"+sum);
	}

}
