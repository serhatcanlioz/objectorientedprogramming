package ch10.overriding;

public class Manager extends Employee {
	
	protected String departmentManaged;
	
	public static final int MANAGEMENT_PAYMENT=6000;
	
	public Manager(int no,String name,int year,String department,String departmentManaged) {
		super(no,name,year,department);
		this.departmentManaged=departmentManaged;
		System.out.println("in Manager()");
	}
	
	@Override
	public void work() {
		System.out.println("Manager is working");
	}
	
	@Override
	public double calculateSalary(){
		return super.calculateSalary() +MANAGEMENT_PAYMENT;
		//return year*BASE_SALARY + MANAGEMENT_PAYMENT;
	}
	
	@Override
	public void printInfo() {
		System.out.println("no:"+no);
		System.out.println("name:"+name);
		System.out.println("year:"+year);
		System.out.println("department:"+department);
		System.out.println("departmentManaged:"+departmentManaged);
	}
	
	public void manage() {
		System.out.println("Manager manages department"+departmentManaged);
	}
}
