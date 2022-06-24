package exam.finalExam.ch18;


public class Test {
	public static void main(String[] args)
    {
        try
        {
        	int total=0;
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <= 4; i++)
            {
                total+=a[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println ("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e)
        {
            System.out.println ("Exception");
        }
    }
} 
