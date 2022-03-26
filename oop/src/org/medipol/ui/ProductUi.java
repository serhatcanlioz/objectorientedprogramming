package org.medipol.ui;


import static java.lang.Math.PI; // ıt reads static import

//import org.medipol.services.ProductService;
//import org.medipol.services.ProductService2;
//import org.medipol.services.ProductService3;

import org.medipol.services.*;

public class ProductUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService productService=new ProductService();
		//org.medipol.services.ProductService productService=new org.medipol.services.ProductService();
		productService.add();
		
		
		ProductService2 productService2=new ProductService2();
		
		ProductService3 productService3=new ProductService3();
		
		
		org.medipol.model.Category category=new org.medipol.model.Category();
		
		org.medipol.entity.Category categoryEntity=new org.medipol.entity.Category();
		
		
		

		//double area = Math.PI * 1 * 2; // old way
		double area = PI * 1 * 2; // new way after static import

	}

}
