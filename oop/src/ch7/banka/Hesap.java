package ch7.banka;

public class Hesap {
	private int hesapno;
	private float bakiye;
	private String hesapSahibi;
	private int tipi; // 0 vadeli, 1 vadesiz
	private HesapHareketi[] hesaphareketi;
	private int hhsayisi;
	
	public Hesap() {
		bakiye=0;
		hhsayisi=0;
		
		hesaphareketi=new HesapHareketi[100];
		for(int i=0;i<100;i++) {
			hesaphareketi[i]=new HesapHareketi();
		}
		
	}

	public int getHesapno() {
		return hesapno;
	}

	public void setHesapno(int hesapno) {
		this.hesapno = hesapno;
	}

	public float getBakiye() {
		return bakiye;
	}

	public void setBakiye(float bakiye) {
		hesaphareketi[hhsayisi].setHesapno(hesapno);
		hesaphareketi[hhsayisi].setMiktar(bakiye);
		hhsayisi++;
		this.bakiye = bakiye;
	}

	public String getHesapSahibi() {
		return hesapSahibi;
	}

	public void setHesapSahibi(String hesapSahibi) {
		this.hesapSahibi = hesapSahibi;
	}

	public int getTipi() {
		return tipi;
	}

	public void setTipi(int tipi) {
		this.tipi = tipi;
	}

	
	void pareCek(float miktar) {
		if(bakiye-miktar<0) {
			System.out.print("Yetersiz Bakiye");
			return;
		}
		hesaphareketi[hhsayisi].setHesapno(hesapno);
		hesaphareketi[hhsayisi].setMiktar(miktar*-1);
		hhsayisi++;
		bakiye-=miktar;
	}
	
	void paraYatir(float miktar) {
		hesaphareketi[hhsayisi].setHesapno(hesapno);
		hesaphareketi[hhsayisi].setMiktar(miktar);
		hhsayisi++;
		bakiye+=miktar;
	}
	
	void hesapDetay() {
		System.out.println("Hesap No:"+hesapno+" Bakiye"+bakiye+" HesapSahibi:" + hesapSahibi);
		
		if(tipi==0) {
			System.out.println("Vadeli");
		}else {
			System.out.println("Vadesiz");
		}
		
		System.out.println("=======Hesap Hareketleri========");
		
		for(int i=0;i<hhsayisi;i++) {
			System.out.println(hesaphareketi[i].getMiktar());
		}
	}
}
