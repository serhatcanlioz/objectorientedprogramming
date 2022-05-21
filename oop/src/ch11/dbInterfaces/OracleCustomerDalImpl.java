package ch11.dbInterfaces;

public class OracleCustomerDalImpl implements CustomerDal,Repository {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("data eklendi");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("data silindi");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("data güncellendi");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("data getirildi");
	}

	@Override
	public void addBase() {
		// TODO Auto-generated method stub
		
	}

}
