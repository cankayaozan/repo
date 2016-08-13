package tr.org.linux.kamp;

import java.util.Scanner;

public class Factoriel {

	public static void main(String args[]) {
	System.out.println("bir sayi girin");
	Scanner input = new Scanner (System.in);
	
	int sayi = input.nextInt();
	int temp=1;
	int fak=1;
	for(int i=1;i<sayi;i++){
		
//		 fak=  temp*(i+1);
//		temp=fak;
		fak*=(i+1);
		
		System.out.println();
	}
	System.out.println(fak);
	}
}
