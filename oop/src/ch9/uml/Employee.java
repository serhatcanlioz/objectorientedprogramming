package ch9.uml;

public class Employee {
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	public String deneme;
	public static final int BASE_SALARY=500;
	
	public Employee(int no,String name,int year,String department) {
		this.no=no;
		this.name=name;
		this.year=year;
		this.department=department;
		System.out.println("in Employee()");
	}
	
	public void work() {
		System.out.println("Employee is working");
	}
	
	public void printInfo() {
		System.out.println("no:"+no);
		System.out.println("name:"+name);
		System.out.println("year:"+year);
		System.out.println("department:"+department);
	}
	
	public double calculateSalary() {
		return BASE_SALARY*year;
	}
	
	public static int getBaseSalary() {
		return BASE_SALARY;
	}
}
