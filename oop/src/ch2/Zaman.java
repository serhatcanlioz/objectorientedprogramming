package ch2;

public class Zaman {
	public int saat;
	public int dakika;
	public int saniye;
	
	//her çağrıldığında 1 saniye ilerleteceğiz.
	public void saatIlerlet() {
		saniye++;
		
		if(saniye==60) {
			saniye=0;
			dakika++;
			
			if(dakika==60) {
				dakika=0;
				saat++;
				
				if(saat==24) {
					saat=0;
				}
			}
		}
	}

}
