package ch4;

public class CreditCart {
	String no;
	double limit;

		
	public CreditCart(String no, double limit) {
		this.no = no;
		this.limit = limit;
	}

	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public double getLimit() {
		return limit;
	}
	
	public void setLimit(double limit) {
		this.limit = limit;
	}
	
}
