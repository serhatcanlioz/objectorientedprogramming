package exam.first.s12;



public class Test {

	final static int x=20;
	static int y=10;
	
	public static void main(String[] args) {
		for(int i=1;i<=y;i++) {
			x+=i;
		}
		
		System.out.print(x);
	}
}
