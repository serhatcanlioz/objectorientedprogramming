package ch6;

public class SayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayiBul(1);
		sayiBul(100);
	}
	
	public static void sayiBul(int aranacakSayi) {
		int[] sayilar=new int[] {1,2,4,5,7,8,33,88,456,23};
		
		boolean varMi=false;
		
		
		for(int i=0;i<sayilar.length;i++) {
			if(sayilar[i]==aranacakSayi) {
				varMi=true;
				break;
			}
		}
		
//		for(int sayi:sayilar) {
//			if(sayi==aranacakSayi) {
//				varMi=true;
//				break;
//			}
//		}
		
		
		if(varMi) {
			System.out.println("Aradığınız "+aranacakSayi+" Sayi mevcuttur.");
		}else {
			System.out.println("Aradığınız "+aranacakSayi+" Sayi mevcut değildir.");
		}
	}

}
