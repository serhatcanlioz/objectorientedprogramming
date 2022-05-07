package ch9.uml;

public class Manager extends Employee {
	
	protected String departmentManaged;

	public Manager(int no,String name,int year,String department,String departmentManaged) {
		super(no,name,year,department);
		this.departmentManaged=departmentManaged;
		System.out.println("in Manager()");
	}
	
}
