package ch2;

public class Product {
	int id;
	String isim;
	double fiyat;
	Category kategori;
	
	String getInfo() {
		String info="Urun Id:"+id+" "+"Urun Adı:"+isim+" Urun Fiyatı:"+fiyat;
		
		if(kategori!=null) {
			info+=" Kategori Adı: "+kategori.name;
		}
		
		return info;
	}
}
