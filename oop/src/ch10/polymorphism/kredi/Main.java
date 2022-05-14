package ch10.polymorphism.kredi;

public class Main {
	
	public static void main(String[] args) {
		BaseKrediService[] krediServices=new BaseKrediService[] {
				new OgretmenKrediService(),new TarimKrediService(),new OgrenciKrediService(),new TasitKrediService()
		};
		
		for(BaseKrediService service:krediServices) {
			System.out.println(service.hesapla(10000));
		}
	}
	

}
