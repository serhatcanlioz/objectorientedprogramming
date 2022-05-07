package ch9.access;

import ch9.access.pckageA.Parent2;

public class Chidl2 extends Parent2{
	
	public void printInfo() {
		System.out.println("Child Info");
		System.out.println("x:"+x);
		//System.out.println("y:"+y);
		System.out.println("t:"+t);
		//System.out.println("z:"+z);
	}
	
	
	public void printInfoObject() {
		Parent2 parent=new Parent2();
		
		System.out.println("Parent Object Info");
		System.out.println("x:"+parent.x);
		//System.out.println("y:"+parent.y);
		//System.out.println("t:"+parent.t);
		//System.out.println("z:"+parent.z);
	}
}
