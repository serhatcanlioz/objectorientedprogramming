package ch7.karakterKontrol;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="programmer";
		
		char search='a';
		
		int count=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==search) {
				count++;
			}
		}
		
		System.out.println("Tekrar eden karakter sayısı:"+count);
	}

}
