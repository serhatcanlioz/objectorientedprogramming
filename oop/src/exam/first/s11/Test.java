package exam.first.s11;

public class Test {

	Test(){
		System.out.print("a ");
		this.yaz();
	}
	public static void main(String[] args) {
		new Test().yaz();
	}
	
	void yaz() {
		System.out.print("b ");
	}

}
