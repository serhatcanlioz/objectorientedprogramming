package ch7.faktoriel;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz:");
		
		int n=scanner.nextInt();
		
		System.out.println("Girilen sayının faktoriyeli:"+faktoriel(n));

	}

	private static int faktoriel(int n) {
		if(n==1) {
			return 1;
		}
		
		return n*faktoriel(n-1);
	}

}
