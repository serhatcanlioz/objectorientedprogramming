package exam.finalExam.ch2;

public class Test {
	public static void main(String[] args) {
		Integer[] someInts = new Integer[100]; 
		int sum = 0;
		for ( Integer i : someInts )
		{
			sum += i; 
		}
		System.out.println( sum / someInts.length );
	}
}

