package ch10.polymorphism.kredi;

public class OgrenciKrediService extends BaseKrediService {
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
