package ch6.memberAccess.secondPackege;

public class ClassP {
	
	public int x=10;
	int y=20;
	protected int z=30;
	private int t=40;
	
	public void publicMethod() {
		System.out.print(z);
		privateMethod();
	}
	
	void defaultMethod() {
		privateMethod();
	}
	
	protected void protectedMethod() {
		privateMethod();
	}
	
	private void privateMethod() {
		
	}
}
