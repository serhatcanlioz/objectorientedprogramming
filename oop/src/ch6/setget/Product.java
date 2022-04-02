package ch6.setget;

public class Product {
	
	private int id;
	private String name;
	private String description;
	private double price;
	private String color;
	private String code;
	
	public Product() {
		
	}
	
	public Product(int id, String name, String description, double price, String renk) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.color = renk;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;	
		}	
	}
	public String getRenk() {
		return color;
	}
	public void setRenk(String renk) {
		this.color = renk;
	}
	public String getCode() {
		return id+name.substring(0,1);
	}
	

}
