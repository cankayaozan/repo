package tr.org.linux.kamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayListSum {

	
	
	public static void main(String args[]) {
		
		
		while(true){
		ArrayList <Integer> list=new ArrayList<Integer>();
		Scanner input= new Scanner(System.in);

		System.out.println("bir sayi gir");
        int sayi1= input.nextInt();
        
	
	
	System.out.println("bir sayi  daha gir");
    int sayi2= input.nextInt();
    
     list.add(sayi1);
     list.add(sayi2);
     int sum = list.get(0)+list.get(1);
System.out.println(sum);

		}

		}
	
	}
