package ch2;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product urun=new Product();
		System.out.println(urun.getInfo());
		
		urun.id=1;
		urun.isim="Urun 1";
		urun.fiyat=5;
		System.out.println("=================");
		System.out.println(urun.getInfo());
		
		Category kategori=new Category();
		System.out.println("=================");
		System.out.println(kategori.getInfo());
		kategori.id=1;
		kategori.name="Kategori 1";
		System.out.println("=================");
		System.out.println(kategori.getInfo());
		
		kategori.urun=urun;
		urun.kategori=kategori;
		
		System.out.println("=================");
		System.out.println(urun.getInfo());
		System.out.println("=================");
		System.out.println(kategori.getInfo());
	}

}
