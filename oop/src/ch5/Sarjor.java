package ch5;

public class Sarjor {
	int mermiKapasitesi;
	int mevcutMermi;
	
	public Sarjor(int mermiKapasitesi,int mevcutMermi) {
		this.mermiKapasitesi=mermiKapasitesi;
		this.mevcutMermi=mevcutMermi;
	}
	
	void doldur() {
		//this.mevcutMermi=this.mermiKapasitesi;
		mevcutMermi=mermiKapasitesi;
	}
	
	boolean atesEt() {	
		if(mevcutMermi>0) {
			this.mevcutMermi--;
			return true;
		}
		return false;
	}
	
	public int getMermiKapasitesi() { //optional
		return this.mermiKapasitesi;
	}

}
