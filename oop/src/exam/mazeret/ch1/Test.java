package exam.mazeret.ch1;

public class Test {
	public static int doStuff(double x, double y) {
		return (int) (x / y);
	}

	public static void main() {
		float x = 6.0;

		int y = 11;
		x = Test.doStuff(y, x);
		System.out.print("x=" + x + ", y=" + y);
	}
}

