package ch5;

public class Silah {
	
	int etkinMenzil;
	Sarjor sarjor;
	
	public Silah(int etkinMenzil,Sarjor sarjor) {
		this.etkinMenzil=etkinMenzil;
		this.sarjor=sarjor;
	}
	
	void setSarjor(Sarjor sarjor) {
		this.sarjor=sarjor;
	}
	
	void doldur() {
		//if(sarjor!=null) {
			sarjor.doldur();
		//}	
	}
	
	
	void atesEt2(int hedefMenzil) {
//		if(sarjor==null) {
//			System.out.println("sarjor nesnesi oluşmamıştır");
//			return;
//		}
		if(hedefMenzil<=etkinMenzil) {
			System.out.println("etkin menzil içinde ateş edildi.");
		}else {
			System.out.println("etkin menzil dışında ıska geçti");
		}
	}
	
	
	boolean atesEt(int hedefMenzil) {
//		if(sarjor==null) {
//			return false;
//		}
		if(hedefMenzil<=etkinMenzil) {
			return sarjor.atesEt();
		}else {
			return false;
		}
	}
}
