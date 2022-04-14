package exam.first.s8;

public class Test {

	public static void main(String[] args) {
		int number=50;
		changeNumber(number);
		System.out.print(number*10);
	}

	private static void changeNumber(int number) {
		number+=100;
	}

}
