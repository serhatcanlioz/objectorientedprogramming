package ch4;

public class Customer {
	int id;
	String isim;
	CreditCart kart;
	
	public Customer(int id, String isim) {
		this.id=id;
		this.isim=isim;
	}
	
	public Customer(int id,String isim,CreditCart kart) {
		//this.id=id;
		//this.isim=isim;
		this(id,isim);
		this.kart=kart;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public CreditCart getKart() {
		return kart;
	}
	
	public void setKart(CreditCart kart) {
		this.kart = kart;
	}
	
	
}
