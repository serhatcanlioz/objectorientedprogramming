package ch12.typed2ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customers=new ArrayList<Customer>();
		
		Customer customer1=new Customer(1,"serhat","çanlıöz");
		
		customers.add(customer1);
		customers.add(new Customer(2,"inci","çanlıöz"));
		customers.add(new Customer(3,"ali","veli"));
		
		
//		customers.remove(customer1);
		
		
		for(Customer customer:customers) {
			System.out.println(customer.ad);
		}
		
		Customer result = customers.stream()
				.filter(x->x.ad.equals("serhat"))
				.findAny()
				.orElse(null);
		
		System.out.println(result.ad);
		
		Customer result2 = customers.stream()
				.filter(x->x.soyad.contains("çan")&&x.id==2)
				.findAny()
				.orElse(null);
		
		System.out.println(result2.ad);
	}

}
