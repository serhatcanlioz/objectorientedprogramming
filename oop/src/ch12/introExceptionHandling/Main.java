package ch12.introExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sayilar=1;
//		
//		sayilar="sdasa";
		
		int[] sayilar = new int[] {1,2,3};
		

		try {
			System.out.println(sayilar[4]);
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception);
			for(int sayi:sayilar) {
				sayi=0;
			}
		}
		catch(Exception exception) {
			System.out.println(exception);
			sayilar=null;
		}finally {
			System.out.println("Ben her zaman çalışırım");
		}
		
		
		System.out.println("metot bitti.");
	}

}
