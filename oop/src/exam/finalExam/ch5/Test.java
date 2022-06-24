package exam.finalExam.ch5;

public class Test {
	public static void main(String[] args) {
		System.out.println(f(3));
	}

	private static int f(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return 3 * f(num - 1);
		}
	}
}
