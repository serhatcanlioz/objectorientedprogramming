package ch11.game;

public abstract class BaseGameCalculator {
	
	public String deneme;
	public String deneme2;
//	
//	public void hesapla() {
//		System.out.println("Puanınız 100.");
//	}
	
	public abstract void hesapla();

	
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
	public final void gameOver2() {
		System.out.println("oyun bitti");
	}
	public void gameOvere() {
		System.out.println("oyun bitti");
	}
}
