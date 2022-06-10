package exam.mazeret.ch17;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			aMethod();
		}catch(Exception e) {
			System.out.print("exception2 ");
		}finally {
			System.out.print("exception3 ");
		}
	}
	private static void aMethod() throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.print("exception1 ");
			throw new Exception();
		}finally {
			System.out.print("exception4 ");
		}
	}

}

//exception1 exception4 exception2 exception3
//exception1 exception2 exception3
//exception1 exception2
//compile error