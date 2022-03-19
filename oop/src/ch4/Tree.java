package ch4;

public class Tree {
	String tip;
	float yukseklik;
	
	public Tree() {
		tip="Meşe";
		yukseklik=12.5f;
		//System.out.println("Kurucu İçerisinde:");
		//printInfo();
	}
	
	void printInfo() {
		System.out.println("Ağaç özellikleri:");
		System.out.println("Tip:"+tip);
		System.out.println("Yükseklik"+yukseklik);
	}
	
	public static void main(String[] args) {
		Tree agac=new Tree();
		agac.printInfo(); // nesne durumu anlamsız
		
		agac.tip="Çam";
		agac.yukseklik=5.2f;
		agac.printInfo();//nesne durumu anlamlı
		
		
		Tree agac2=new Tree();
		agac2.printInfo();
	}
}
