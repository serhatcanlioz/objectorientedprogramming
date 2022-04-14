package exam.first.s9;

public class Test {
	
	int number;

	public static void main(String[] args) {
		Test test= new Test();
		test.number=50;
		changeNumber(test);
		System.out.print(test.number*10);
	}

	private static void changeNumber(Test test) {
		test.number+=100;
	}

}
