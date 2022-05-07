package ch9.yerineGecme;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KrediUI krediUI=new KrediUI();
		
		krediUI.krediHesapla(new OgretmenKrediService());
		krediUI.krediHesapla(new TarimKrediService());
	//	krediUI.krediHesapla(new TasitKrediService());
	//	krediUI.krediHesapla(new BayramKrediService());
	}

}
