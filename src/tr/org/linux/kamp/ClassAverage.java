package tr.org.linux.kamp;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int gradeCounter = 1;
		System.out.println("10 notu girin");
		while (gradeCounter <= 10) {

			int grade= input.nextInt();
			total=total+grade;
			gradeCounter = gradeCounter+1;
			
					
		}
		
		int average=total/10;
		
		System.out.println("10 notun toplamý:"+total);
		System.out.println("ortalama:"+average);

	}
}
