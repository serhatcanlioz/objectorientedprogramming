package ch7.oylama;

public class Aday {
	private int adayNo;
	private int oySayisi;
	
	public Aday() {
		oySayisi=0;
	}
	
	public int getAdayNo() {
		return adayNo;
	}
	
	public void setAdayNo(int adayNo) {
		this.adayNo = adayNo;
	}
	
	public int getOySayisi() {
		return oySayisi;
	}
	
	public void oySayisiniArttir() {
		oySayisi++;
	}
	
}
