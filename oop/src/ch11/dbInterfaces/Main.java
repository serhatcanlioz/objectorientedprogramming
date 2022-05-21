package ch11.dbInterfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerService customerService=new CustomerService(new OracleCustomerDalImpl());
		customerService.add();
	}

}
