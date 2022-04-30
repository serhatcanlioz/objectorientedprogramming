package ch8.intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		//customer.person=new Person();
		
		
		customer.id=1;
		customer.ad="İnci";
		
	//	customer.person.id=1;
		
		Employee employee=new Employee();
		//employee.person=new Person();
		
		
		employee.ad="Serhat";
		employee.id=1;
		
		//employee.person.id=1;
		
		
		
		
		CustomerService customerService=new CustomerService();
		customerService.listele();
		
		EmployeeService employeeService=new EmployeeService();
		employeeService.enIyiEleman();
	}

}
