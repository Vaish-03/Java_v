package cdpsession1;

public class Method3 {
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		Method3 m2 =new Method3();
		m2.add();
		System.out.println("Sub");
	}
	public void mul() {
		Method3 m3 =new Method3();
		m3.sub();
		System.out.println("Mul");
	}
	public void main(String[] args) {
		Method3 m4 =new Method3();
		m4.mul();
		
		
	}


}
