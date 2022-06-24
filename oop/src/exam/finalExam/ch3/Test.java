package exam.finalExam.ch3;

public class Test {
	public static void main(String[] args) {
		int x, y, z;
		y = 1;
		z = 5;
		x = 0 - (++y) + z++;
		
		System.out.println("x="+x+",y="+y+",z="+z);
	}
}
