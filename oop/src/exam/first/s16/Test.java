package exam.first.s16;

public class Test {
	public static void main(String[] args) {
		Test test=new Test();
		test.start();
	}
	void start() {
		int x=3;
		int y=4;
		
		System.out.print(" " + 7 + 2 + " ");
		System.out.print(x+y);
		System.out.print(" "+ x + y + " ");
		System.out.print(foo()+ x + y + " ");
		System.out.println(x+y+foo());
	}	
	String foo() {
		return "foo";
	}
}
