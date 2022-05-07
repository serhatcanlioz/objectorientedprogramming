package ch9.uml;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(1,"Serhat",14,"İşci");
		employee.printInfo();
		System.out.println("Maaşı:"+employee.calculateSalary());
		employee.work();
		
		System.out.println();

		
		
		Manager manager=new Manager(2,"İnci",3,"Müdür","İşçi Müdürü");
		manager.printInfo();
		System.out.println("Maaşı:"+manager.calculateSalary());
		manager.work();
		
		System.out.println();
		
		Director director=new Director(3,"Ali",3,"Direcör","İşçi Müdürü Direktörü", 10000);
		director.printInfo();
		System.out.println("Maaşı:"+director.calculateSalary());
		director.work();
		
		
		System.out.println(Employee.BASE_SALARY);
		System.out.println(Employee.getBaseSalary());
		
		System.out.println(Manager.BASE_SALARY);
		System.out.println(Manager.getBaseSalary());
		
		System.out.println(Director.BASE_SALARY);
		System.out.println(Director.getBaseSalary());
	}

}
