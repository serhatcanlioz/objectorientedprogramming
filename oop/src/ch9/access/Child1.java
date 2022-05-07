package ch9.access;

public class Child1 extends Parent1 {
	
		public void printInfo() {
			System.out.println("Child Info");
			System.out.println("x:"+x);
			System.out.println("y:"+y);
			System.out.println("t:"+t);
			//System.out.println("z:"+z);
		}
		
		public void printInfoObject() {
			Parent1 parent=new Parent1();
			
			System.out.println("Parent Object Info");
			System.out.println("x:"+parent.x);
			System.out.println("y:"+parent.y);
			System.out.println("t:"+parent.t);
			//System.out.println("z:"+parent.z);
		}
}
