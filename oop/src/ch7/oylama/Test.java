package ch7.oylama;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		OyPusulasi[] oylar=new OyPusulasi[10];
		
		for(int i=0;i<10;i++) {
			oylar[i]=new OyPusulasi();
		}

		
		Aday[] adaylar=new Aday[6];
		
		for(int i=0;i<6;i++) {
			adaylar[i]=new Aday();
		}

		
		for(int i=0;i<10;i++) {
			int oyBilgisi=oyuOku();
			
			oylar[i].setOy(oyBilgisi);
			
			adaylar[oylar[i].getOy()].oySayisiniArttir();
		}

		
		for(int i=0;i<6;i++) {
			System.out.println(i+ " adayının oy sayisi: "+ adaylar[i].getOySayisi());
		}
	}

	private static int oyuOku() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Oy bilgisini giriniz:");
		
		int oy=scanner.nextInt();
		
		if(oy<1 || oy>5) {
			System.out.println("Hatalı oy girildi.");
			return 0;
		}
		
		return oy;
	}

}
