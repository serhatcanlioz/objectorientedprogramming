package ch3;

public class StackHeapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1=10;
		int sayi2=20;
		
		sayi2=sayi1;
		sayi1=30;
		
		System.out.println("valueType"+sayi2);
		
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		
		sayilar2=sayilar1;
		
		sayilar1[0]=10;
		
		System.out.println("referanceType"+sayilar2[0]);
		
		
		Product product=new Product();
		
		product.id=1;
		product.name="Urun 1";
		
		Product product2=new Product();
		
		product2.id=2;
		product2.name="Urun 2";
		
		product2=product;
		
		product.id=3;
		
		System.out.println(product.id+" "+ product.name);
	}

	

}


