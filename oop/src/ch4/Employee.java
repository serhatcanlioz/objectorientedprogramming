package ch4;

public class Employee {
	int id;
	String ad;
	String soyad;
	float maas;
	String bolum;
	
//	public Employee(int yeniId,String yeniAd,String yeniSoyad,float yeniMaas) {
//		id=yeniId;	
//		ad=yeniAd;
//		soyad=yeniSoyad;
//		maas=yeniMaas;
//	}
	
	public Employee(int id,String ad,String soyad,float maas) {
		this.id=id;	
		this.ad=ad;
		this.soyad=soyad;
		this.maas=maas;
	}
	
	public Employee(int yeniId,String yeniAd,String yeniSoyad,float yeniMaas,String yeniBolum) {
		this(yeniId,yeniAd,yeniSoyad,yeniMaas);
		//id=yeniId;
		//ad=yeniAd;
		//soyad=yeniSoyad;
		//maas=yeniMaas;
		bolum=yeniBolum;
	}
	
//	void print() {
//		this(1,"","",1f);
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee isci=new Employee(1,"Serhat","Çanlıöz",100f);
				
		Employee isci2=new Employee(2,"İnci","Çanlıöz",150f,"Bolüm1");
		
	}
}
