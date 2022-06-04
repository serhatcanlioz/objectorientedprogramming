package ch13.account;

public class AccountService {
	private double bakiye;

	public void paraYatir(double tutar) {
		this.bakiye=this.bakiye+tutar;
	}
	
	public void paraCekme(double tutar) throws BakiyeYetersizException {
		if(bakiye>=tutar) {
			this.bakiye=this.bakiye-tutar;
		}else {
			throw new BakiyeYetersizException("Bakiyeniz yetersizdir.");
//			Result result=new Result();
//			result.hataKodu=1;
//			result.hataAciklamasi="bakiyeniz yetersizdir.";
		}
	}
	
	public double getBakiye() {
		return this.bakiye;
	}
	
//	public class Result{
//		int hataKodu;
//		String hataAciklamasi;
//	}
}
