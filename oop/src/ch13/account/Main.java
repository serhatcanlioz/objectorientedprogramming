package ch13.account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountService accountService=new AccountService();
		
		System.out.println("Bakiye bilgisi :"+accountService.getBakiye());
		
		accountService.paraYatir(500);
		
		System.out.println("Bakiye bilgisi :"+accountService.getBakiye());
		
		try {
			accountService.paraCekme(100);
		} catch (BakiyeYetersizException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bakiye bilgisi :"+accountService.getBakiye());
		
		
		try {
			accountService.paraCekme(1000);
		} catch (BakiyeYetersizException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bakiye bilgisi :"+accountService.getBakiye());
	}

}
