package exam.finalExam.ch14;

public class Test {
	public static void main(String[] args) {
		try {
			aMethod();
		}catch(Exception e) {
			System.out.print("exception2 ");
		}	
		System.out.print("exception3 ");
	}

	private static void aMethod() throws Exception {
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.print("exception1 ");
			throw new Exception();
		}
	}
}

