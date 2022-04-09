package ch7.banka;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hesap hesap1=new Hesap();
		
		hesap1.setHesapno(1111);
		hesap1.setHesapSahibi("Serhat Çanlıöz");
		hesap1.setTipi(1);
		hesap1.paraYatir(50000);
		
		hesap1.pareCek(300);
		hesap1.pareCek(5000);
		hesap1.paraYatir(222);
		
		hesap1.hesapDetay();
	}

}
