package ch11.db;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService=
				new CustomerService(new MySqlDatabaseService());
//		customerService.service=new SqlServerDatabaseService();
		customerService.getCustomers();
	}

}
