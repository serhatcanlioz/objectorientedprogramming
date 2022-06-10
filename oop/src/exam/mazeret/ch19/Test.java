package exam.mazeret.ch19;
abstract class A{
	String a="A ";
	void s() {
		System.out.print(a);
	}
}

class B extends A{
	String s="B ";
	B(){
		super.s();
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

//
//a)	C B A		
//b)	C B C	     
//c)	A B C
//d)	B C C
