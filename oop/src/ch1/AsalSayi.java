package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsalSayi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String devamFlag = "E";
		while (devamFlag.equals("E")) {

			System.out.println("Lütfen sayı giriniz.");
			String sayiString = reader.readLine();

			int sayi = Integer.parseInt(sayiString);
			System.out.println("Girilen değer:" + sayi);

			boolean asalSayimi = true;

			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asalSayimi = false;
					break;
				}
			}

			if (asalSayimi == true) {
				System.out.println("Sayı asal sayıdır.");
			} else {
				System.out.println("Sayı asal sayı değildir.");
			}

			System.out.println("Devam etmek istiyor musunuz? " 
			+ "Devam etmek için 'E' tuşuna basınız.");

			devamFlag = reader.readLine();
		}

	}

}
