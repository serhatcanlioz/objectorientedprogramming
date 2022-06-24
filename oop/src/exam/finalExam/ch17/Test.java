package exam.finalExam.ch17;

class A{
	String s="A ";
}
class B extends A{
	String s="B ";
	B(){
		System.out.print(super.s);
	}
}
class C extends B{
	String s="C ";
	C(){
		System.out.print(super.s);
	}
}
public class Test {
	public static void main(String[] args) {
		C c=new C();
		System.out.print(c.s);
	}
}



