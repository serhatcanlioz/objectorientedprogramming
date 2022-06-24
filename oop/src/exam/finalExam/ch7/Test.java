package exam.finalExam.ch7;

class One{
	public One(int x){
		System.out.print("int constructor");
	}
	public One(long l){
		System.out.print("long constructor");
	}
}

public class Test{
	public static void main(String[] args){
		long l = 20l;
		One one = new One(l);		
	}		
}
