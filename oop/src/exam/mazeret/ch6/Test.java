package exam.mazeret.ch6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(8, 9));
	}

	private static int f(int x, int y) {
		if (x == 0) {
			return y;
		} else {
			return f(x - 1, y + 1);
		}
	}
}

