package exam.first.s14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Satır sayısı giriniz:");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		if(i==1||i==n||j==1||j==n||i==j) {
        			System.out.print("*");
        		}else {
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        }
	}

}
