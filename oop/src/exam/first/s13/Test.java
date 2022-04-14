package exam.first.s13;

public class Test {
	private static int x=1;
	public static void main(String[] args) {
		int x=5;
		System.out.print(x+" ");
		method1();
		method2();
		System.out.print(x);
	}
	private static void method2() {
		System.out.print(x+" ");
		Test.x *= 10;
		System.out.print(Test.x+" ");
		
	}
	private static void method1() {
		int x=25;
		System.out.print(x+" ");
		++x;
		System.out.print(Test.x+" ");
	}
}
