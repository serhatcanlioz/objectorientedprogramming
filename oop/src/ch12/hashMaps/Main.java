package ch12.hashMaps;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> sozluk = new HashMap<String,String>();
		
		sozluk.put("table", "masa");
		sozluk.put("book", "kitap");
		sozluk.put("computer", "bilgisayar");
		
		System.out.println(sozluk);
		
		System.out.println(sozluk.size());
		
		System.out.println(sozluk.get("book"));
		
		sozluk.remove("book");
		
		System.out.println(sozluk.get("book"));
		
		for(String item:sozluk.keySet()) {
			System.out.println("Elemen - "+ item + " Değer - "+ sozluk.get(item));
		}
		
		sozluk.clear();
	}

}
