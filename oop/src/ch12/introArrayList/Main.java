package ch12.introArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] sayilar = new int[5];
//		sayilar[0]=1;
//		sayilar[1]=4;
//		
//		int[] sayilar=new int[] {1,2,3};
//		System.out.println(sayilar[4]);
		
		ArrayList sayilar=new ArrayList();
		
		sayilar.add(1);
		sayilar.add(true);
		sayilar.add("İstanbul");
		
	
		
		
		sayilar.add("Ankara");
		
		
		sayilar.add(2,15);
		
		sayilar.set(4, "Erzurum");
		System.out.println("Boyut:"+sayilar.size());
		sayilar.remove(0);
		
		
		sayilar.clear();
		for(Object sayi:sayilar) {
			System.out.println(sayi);
		}
		
		System.out.println("Boyut:"+sayilar.size());
	}

}
