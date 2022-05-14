package ch10.polymorphism.log;

public class CustomerService {
	
	private BaseLogger logger;
	
	public CustomerService(BaseLogger logger) {
		this.logger=logger;
	}

	public void add() {
		System.out.println("Database ekleme işlemi yapıldı.");
		logger.log("müşteri eklendi");
	}
}
