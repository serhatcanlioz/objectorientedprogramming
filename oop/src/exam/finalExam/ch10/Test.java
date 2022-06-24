package exam.finalExam.ch10;

class SuperClass {
	private int x;
	private int y;
	public SuperClass() {
		x = 2;
		y = 3;
	}
	public SuperClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Numbers are: " + x + " and " + y;
	}
	public int returnSum() {
		return (x + y);
	}
}

class SubClass extends SuperClass {
	private int z;
	public SubClass() {
		super();
	}
	public SubClass(int x, int y) {
		super(x, y);
		z = 4;
	}
	public int returnSum() {
		return (super.returnSum() + z);
	}
}


public class Test 
{
   public static void main(String args[]) 
   {
	   SuperClass obj1 = new SuperClass();
	   System.out.println (obj1);
   }
}




