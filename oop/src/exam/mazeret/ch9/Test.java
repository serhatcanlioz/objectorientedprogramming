package exam.mazeret.ch9;

class One{
	
	public One(){}
	
	public One(long l){
		System.out.print("long constructor");
	}
}

class Two extends One{
	public One(int i){
		System.out.print("int constructor");
	}
}

public class Test{
	
	public static void main(String[] args){
		long l = 20l;
		One one = new Two(l);		
	}		
}


