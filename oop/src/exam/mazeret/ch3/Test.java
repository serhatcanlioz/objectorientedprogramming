package exam.mazeret.ch3;

class Person{}
class Student extends Person{}
class Undergraduate extends Student{}
public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student(); 
		Undergraduate ug = new Undergraduate();
		
		p=ug;
		p = new Undergraduate();
		
		ug = new Student();
		
		ug=p;
		
		s = new Person();
	}
		
}
