package exam.finalExam.ch6;

public class Test {
	public static void main(String[] args) {
		One one = new Two();
		one.print();
	}
}

class One{	
	public void print(){
		System.out.println("1");
	}
}

class Two extends One{
	@Override
	public void print(){
		System.out.println("2");
	}
}


