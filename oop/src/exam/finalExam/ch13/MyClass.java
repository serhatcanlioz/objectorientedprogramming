package exam.finalExam.ch13;

public class MyClass {
	private int myVlaue = 5;
	public void printMyVlaue() {
		System.out.print(myVlaue);
	}
	public void setMyVlaue(int myVlaue) {
		System.out.print(myVlaue);
		this.myVlaue = myVlaue;
	}
	public static void main(String[] args) {
		MyClass myClass1 = new MyClass();
		myClass1.setMyVlaue(10);
		System.out.print(" ");
		myClass1.printMyVlaue();
	}
}
