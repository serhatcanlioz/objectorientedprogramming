package ch6.setget;

public class ProductService {

	public void add(Product product) {
		//JDBC bağlantısı
		System.out.println("Ürün eklendi"+product.getName());
	}
	
	
	public void add2(int id,String name,String description,double price,String renk) {
		//JDBC bağlantısı
		System.out.println("Ürün eklendi"+name);
	}
}
