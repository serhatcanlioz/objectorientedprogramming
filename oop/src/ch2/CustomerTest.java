package ch2;

import java.time.LocalDate;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer1=new Customer();
		customer1.ad="Serhat";
		customer1.soyad="Çanlıöz";
		customer1.medeniHal=true;
		customer1.dogumTarihi=LocalDate.of(1990, 2, 25);
		customer1.yas=32;
		
		Customer customer2=new Customer();
		customer2.ad="İnci";
		customer2.soyad="Çanlıöz";
		customer2.medeniHal=true;
		customer2.dogumTarihi=LocalDate.of(2019, 7, 29);
		customer2.yas=2;
		
		
		String temp="Ad Soyad:"+customer1.ad+" "+customer1.soyad + 
				"Medeni Hal:"+customer1.medeniHal+"Yas:"+customer1.yas;
		
		System.out.println(temp);
		
		System.out.println("Ad Soyad:"+customer2.ad+" "+customer2.soyad + 
				"Medeni Hal:"+customer2.medeniHal+"Yas:"+customer2.yas);
	}

}
