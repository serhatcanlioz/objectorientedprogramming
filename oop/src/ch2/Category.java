package ch2;

public class Category {
	int id;
	String name;
	Product urun;
	
	String getInfo() {
		String info="Kategori Id:"+id+" "+"Kategori Adı:"+name;
		
		if(urun!=null) {
			info+=" Urun Adı: "+urun.isim+" Urun Fiyat:"+urun.fiyat;
		}
		
		return info;
	}
}
