package ch11.db;

public class CustomerService {
	
	private BaseDatabaseService service;

	public CustomerService(BaseDatabaseService service) {
		this.service=service;
	}
	
	public void getCustomers() {
		service.getData();
	}
}
