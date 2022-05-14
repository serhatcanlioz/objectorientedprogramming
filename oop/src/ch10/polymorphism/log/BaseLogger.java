package ch10.polymorphism.log;

public class BaseLogger {
	public void log(String message) {
		System.out.println("Default logger"+ message);
	}
	
	public final void finish() {
		System.out.println("Finish metot");
	}
}
