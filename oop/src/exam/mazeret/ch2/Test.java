package exam.mazeret.ch2;

import java.util.Date;

public class Test {

	private static Date tarih;

	public static void someMethod( String isim, String renk) {
		System.out.println( isim + " 'in favori rengi " + tarih.toString() + " " + renk + " dir.");
	}
	
	public static void main(String[] args) {
		String isim="Serhat";
		String renk="Mavi";
		someMethod(isim, renk);
	}

}

