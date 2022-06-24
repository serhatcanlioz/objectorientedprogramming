package exam.finalExam.ch1;

class Cember {
	int pi;
	int yariCap;
	
	public Cember(int pi,int yariCap) {
		pi=pi;
		yariCap=yariCap;
	}
	
	public int alanHesapla() {
		return pi*yariCap*yariCap;
	}
}

public class CemberTest {
	public static void main(String[] args) {
		System.out.print(new Cember(10,20).alanHesapla());
	}
}
