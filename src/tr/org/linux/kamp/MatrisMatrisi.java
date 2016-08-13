package tr.org.linux.kamp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MatrisMatrisi {
	
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
	int a= input.nextInt();
	int b= input.nextInt();
    int[][] array = new int[b][a];
//		
//	int counter =1;
//	int multi=1;
//		for(int j=0;j<a;j++){
//			for(int i=0;i<array[j].length;i++){
//				array[j][i]= multi*counter;
//				System.out.print(array[j][i]+"   ");
//				counter+=1;
//			
//			}
//			counter=1;
//			System.out.println();
//			multi+=1;
			yol2(a,b);
			

	}
		public static int[][] yol2(int a,int b ){
;

			 int [][] array = new int[b][a];
			
			int counter =1;
			int multi=1;
			
			for(int j=0;j<b;j++){
				for(int i=0;i<array[j].length;i++){
					array[j][i]= multi*counter;
					System.out.print(array[j][i]+"   ");
					counter+=1;
				
				}
				counter=1;
				System.out.println();
				multi+=1;
				
			
		}
			return array;
			
		}
	}


