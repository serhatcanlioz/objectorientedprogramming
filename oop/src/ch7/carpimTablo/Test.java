package ch7.carpimTablo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen sayıyı giriniz:");
		
		int num=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}

	}

}
