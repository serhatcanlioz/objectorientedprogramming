package ch6.memberAccess.secondPackege;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassP p=new ClassP();
		
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
		//System.out.println(p.t);
		
		
		p.publicMethod();
		p.defaultMethod();
		p.protectedMethod();
	//	p.privateMethod();

	}

}
