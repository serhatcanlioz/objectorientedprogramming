package ch5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Dizi boyutunu giriniz:");
		
		int n= Integer.parseInt(reader.readLine().trim());
		
		int[][] array=new int[n][n];
		
		System.out.println("Diziyi giriniz:");
		
		for(int i=0;i<n;i++) {
			String[] rowTemp=reader.readLine().split(" ");
			
			for(int j=0;j<n;j++) {
				array[i][j]=Integer.parseInt(rowTemp[j]);
			}
		}
		
		int result=diagonalToplam(array);
		
		System.out.println("Diagonal toplam:"+result);
		
		reader.close();
	}

	private static int diagonalToplam(int[][] array) {
		// TODO Auto-generated method stub
		
		int diagonalToplam=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i==j) {
					diagonalToplam+=array[i][j];
				}
			}
		}
		
		return diagonalToplam;
	}

}
