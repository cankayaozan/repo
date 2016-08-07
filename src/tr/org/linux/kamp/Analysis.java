package tr.org.linux.kamp;

import java.util.Scanner;

public class Analysis {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
			
		int passes=0;
		int failures=0;
		int studentCounter=1;
		while(studentCounter<=10){
			System.out.println("sonucu girin(1=gecti  2=kaldý)");
			
			int result = input.nextInt();
			if(result==1){
				passes++;
				studentCounter= studentCounter+1;
			}
			else if(result==2){
				failures=failures+1;
				studentCounter= studentCounter+1;
			}
			else
				System.out.println("1 yada 2 girin");
			
		}
		System.out.println("geçen"+passes+"kalan"+failures);
		if(passes>8)
			System.out.println("egitmene bravo, helall olsun");
	}

}
