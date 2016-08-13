package tr.org.linux.kamp;

import java.util.HashMap;
import java.util.Scanner;

public class MeanOfNotes {
	
public static void main(String args[]){
	
	
	Scanner input = new Scanner(System.in);
	int note=0;
	
	while(true){
		
		System.out.println("enter a student number");
      int stdn= input.nextInt(); 
     
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		for(int i=0;i<stdn;i++){
			if(table.containsValue(stdn)){
			put(stdn,  note+1);
		 note= generateRandomValues();

			table.put(stdn, note+1);
			}
			else{
				table.put(stdn, 1);
			}
	
		//Scanner input = new Scanner(System.in);


public static int generateRandomValues(){
	
	int temp= (int)(Math.random()*100);
	return temp;
}

public static double mean(HashMap<Integer,Integer>map){
}
	double asnwer;
}
			
		
				

}