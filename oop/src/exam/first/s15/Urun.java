package exam.first.s15;

public class Urun {
	
	int id;
	String ad;
	double fiyat;
	Kategori kategori;

	public static void main(String[] args) {
		Kategori kategori=new Kategori();
		kategori.id=1;
		kategori.ad="Elektronik";
		Urun urun=new Urun();
		urun.id=1;
		urun.ad="Cep Telefonu";
		urun.fiyat=100;
		urun.detayYaz(urun);
	}
	
	void detayYaz(Urun urun) {
		System.out.println(urun.ad+ " ürünü " + kategori.ad + " kategorisi altında bulunmaktadır.");
	}

}
