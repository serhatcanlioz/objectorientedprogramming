package ch6.memberAccess;

import ch6.memberAccess.secondPackege.ClassP;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassP p=new ClassP();
		
		System.out.println(p.x);
//		System.out.println(p.y); // farklı paket
//		System.out.println(p.z); // farklı paket
//		System.out.println(p.t); //private
		
		
		p.publicMethod();
//		p.defaultMethod();
//		p.protectedMethod();
//		p.privateMethod();
	}

}
