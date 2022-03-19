package ch4;

public class StaticDemo {
	static int i=10;
	int j=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(StaticDemo.i);
		System.out.println(i);
		
		StaticDemo.increment();
		
		System.out.println(i);
		
		StaticDemo demo1=new StaticDemo();
		
		demo1.increment();
		System.out.println(i);
		
		aMethod();
		
		setI(22);
		
		System.out.println(StaticDemo.i);
	}
	
	static void increment() {
		i++;
	}

	static void aMethod() {
		increment();
		int i=7;
		System.out.println("Local i:"+i);
		System.out.println("Static i:"+StaticDemo.i);
	}
	
	static void setI(int i) {
		StaticDemo.i=i;
	}
	
	void setJ(int j) {
		this.j=j;
	}
}
