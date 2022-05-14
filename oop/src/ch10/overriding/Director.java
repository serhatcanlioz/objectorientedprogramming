package ch10.overriding;

public class Director extends Manager {
	
	protected double bonus;
	
	public Director(int no,String name,int year,String department,String departmentManaged,double bonus) {
		super(no,name,year,department,departmentManaged);
		this.bonus=bonus;
		System.out.println("in Direcotr()");
	}
	
	@Override
	public void work() {
		System.out.println("Director is working");
	}
	
	@Override
	public double calculateSalary(){
		return super.calculateSalary() +bonus;
		//return year*BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
	}
	
	@Override
	public void manage() {
		System.out.println("Director manages whole company");
	}
	
	public void managedStrategicPlan() {
		System.out.println("Director makes strategic plan.");
	}
}
