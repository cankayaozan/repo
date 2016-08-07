package tr.org.linux.kamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	public static void main(String args[]){
		
//		int[] erey= new int[3];
//		erey[0]=3;
//		erey[1]=5;
//		erey[2]=0;
//		//int total= erey[0]+erey[1]+erey[2];
//		
//		int[] erey2= new int[]{3,5,6};
//		int total2=erey2[0]+erey[2]+erey[1];
//		for(int i=0;i<erey.length;i++){
//			int total=erey[i]+erey2[i]; 
//		}
//		
//		System.out.println(total);
//	
		
		
		Scanner input = new Scanner(System.in);
		int inputNumber= input.nextInt();
		ArrayList erreyList5=new ArrayList();
		
		int counter =0;
		while(inputNumber!=-1){
			System.out.println("bir deger girin");
			if(inputNumber!=-1){
				erreyList5.add(inputNumber);
			}
			inputNumber = input.nextInt();
			
			
			
			counter++;
			
		}
		for(int i=0;i<errey5.length;i++){
			System.out.println("arrayin eleman nosu"+i);
			System.out.println("arrayin elemanıu"+errey5[i]);
			
			
			
		}
	}
	
}
