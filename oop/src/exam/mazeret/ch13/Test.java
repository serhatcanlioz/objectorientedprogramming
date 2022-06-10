package exam.mazeret.ch13;

	public class Test {
		static int i = 1;
		public static void main(String[] args) {
			 System.out.print(i+ " , ");
	         m(i);
	         System.out.print(i);
	
		}
		
		public static void m(int i)
	    {
	       i += 2;    
	    }
	
	}


//(a)  1 , 3                  
//(b)  3 , 1                  
//(c)  1 , 1                  
//(d)  1 , 0
