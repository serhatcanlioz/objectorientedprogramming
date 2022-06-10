package exam.mazeret.ch16;

interface I1{}
interface I2{}
class C1 implements I1 {}
class C2 implements I2 {}
class C3 extends C1 implements I2 {}

public class Test {
	public static void main(String[] args) {
		C1 obj1;
		C2 obj2;
		C3 obj3;
		
		obj2 = obj1;

		obj3 = obj2;

		I1 a = obj2;

		I1 b = obj3;
	}
}






