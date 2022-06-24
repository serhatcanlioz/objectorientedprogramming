package exam.finalExam.ch9;

class Person 
{ 
    private int age; 
    private Person() 
    { 
        age = 24; 
    } 
} 
public class Test 
{ 
    public static void main(String[] args) 
    { 
        Person p = new Person(); 
        System.out.println(p.age); 
    } 
}


