package ch3;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		
		user.setAd("Serhat");
		user.setNumara(1);
		user.setSıyad("Çanlıöz");
		user.setYas(32);
		user.setAktiflik(true);
		
		System.out.println("Ad Soyad:" + user.getAd()+ " "+ user.getSıyad());
	}

}
