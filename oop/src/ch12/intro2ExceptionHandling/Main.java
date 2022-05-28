package ch12.intro2ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		int total=0;
		try {
			reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/src/ch12/intro2ExceptionHandling/sayilar.txt"));
			
			String line=null;
			
			while( (line=reader.readLine())!= null) {
				
				try {
					total+= Integer.valueOf(line);
				}catch(NumberFormatException ex) {
					total+=0;
				}
				
//				total+= Integer.valueOf(line);
			}
			
			System.out.println(total);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
