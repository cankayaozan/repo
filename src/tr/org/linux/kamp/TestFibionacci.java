package tr.org.linux.kamp;

import java.util.Scanner;

public class TestFibionacci {
	public static void main(String args[]) {

		System.out.println("dizi sayýsýný girn");
		Scanner input = new Scanner(System.in);
		int number=  input.nextInt();
		for(int i=1;i<number;i++){
		System.out.println(fibo(i)+" ");
		}
}
	
	public static int fibo(int number){
		
		if(number==1 || number ==2)
			return 1;
	
		else
	return fibo(number-1)+fibo(number-2);
}
}