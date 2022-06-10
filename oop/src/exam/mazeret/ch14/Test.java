package exam.mazeret.ch14;

public class Test {

	public static int foo(int a, String s) {
		s = "Yellow";
		a = a + 2;
		return a;
	}

	public static void bar() {
		int a = 3;
		String s = "Blue";
		a = foo(a, s);
		System.out.println("a=" + a + " s=" + s);
	}

	public static void main(String args[]) {
		bar();
	}

}
//
//a)	 a=3 s=Blue 		
//b)	a=5 s=Yellow	     
//c) 	a=3 s=Yellow	    
//d)	a=5 s=Blue