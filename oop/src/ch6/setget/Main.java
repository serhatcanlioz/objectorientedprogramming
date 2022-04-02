package ch6.setget;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product();
		
//		product.id=1;
//		product.name="Laptop";
//		product.description="Asus laptop";
//		product.price=250;
//		product.renk="Gri";
		
		
		product.setId(1);
		product.setPrice(250);
		product.setName("Laptop");
		product.setDescription("Asus");
		product.setRenk("Gri");
		
		Product product2=new Product(2,"Telefon","Samsung telefon",200,"siyah");
		
		ProductService productService=new ProductService();
		
		productService.add(product);
		productService.add(product2);
		System.out.println("Urun Kodu:" + product.getCode());
		
		
		/*
		 * productService.add2(1, "Lağtop", "Asus", 200,"renk"); productService.add2(1,
		 * "Lağtop", "Asus", 200); productService.add2(1, "Lağtop", "Asus", 200);
		 * productService.add2(1, "Lağtop", "Asus", 200); productService.add2(1,
		 * "Lağtop", "Asus", 200); productService.add2(1, "Lağtop", "Asus", 200);
		 * productService.add2(1, "Lağtop", "Asus", 200); productService.add2(1,
		 * "Lağtop", "Asus", 200); productService.add2(1, "Lağtop", "Asus", 200);
		 * productService.add2(1, "Lağtop", "Asus", 200); productService.add2(1,
		 * "Lağtop", "Asus", 200); productService.add2(1, "Lağtop", "Asus", 200);
		 * productService.add2(1, "Lağtop", "Asus", 200); productService.add2(1,
		 * "Lağtop", "Asus", 200);
		 */
	}

}
