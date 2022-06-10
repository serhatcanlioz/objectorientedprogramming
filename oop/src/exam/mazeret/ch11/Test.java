package exam.mazeret.ch11;

class A 
{
  int data = 5;
  
  A() {
    data = 10;
  }
}
public class Test 
{
   public static void main(String args[]) 
   {
      A obj = new A();
      System.out.println(obj.data);
   }
}
