package ch4;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer musteri1=new Customer(1,"İnci");
		
		//CreditCart kart=new CreditCart("1231413123",2000);
		//Customer musteri2=new Customer(2,"Serhat",kart);
		
		Customer musteri2=new Customer(2,"Serhat",new CreditCart("123456789",1000));
		
		System.out.println("Musteri1:"+musteri1.id+" "+musteri1.isim);
		System.out.println("Musteri2:"+musteri2.id+" "+musteri2.isim+" "+musteri2.kart.no);
	}

}
