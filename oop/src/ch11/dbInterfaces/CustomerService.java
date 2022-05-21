package ch11.dbInterfaces;

public class CustomerService {
	
	private CustomerDal customerDal;
	
	public CustomerService(CustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}
