package ch12.typedArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sehirler =new ArrayList<String>();
		
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Erzurum");
		sehirler.add("İzmir");
		sehirler.add("Aydın");
		
		
		sehirler.remove("İzmir");
		
		Collections.sort(sehirler);
		for(String sehir:sehirler) {
			System.out.println(sehir);
		}
	}

}
