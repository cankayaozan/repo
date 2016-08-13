package tr.org.linux.kamp;

import java.util.Arrays;

public class StringArrayContains {

	public static void main(String args[]){
		
		String[] strMonths = new String[]{"january","february","march"};
		
		String strFind1 = "March";
		String strFind2 = "December";

		boolean contains = false;
		
		for(int i=0; i < strMonths.length;i++){
			
			if(strMonths[i].equals(strFind1)){
				
				contains=true;
				break;
			}
		}
		if(contains){
			System.out.println("string array içeriyor"+strFind1);
			
		}
		else
			System.out.println("içermiyor"+strFind1);
		
			contains= Arrays.asList(strMonths).contains(strFind1);
			System.out.println("içeriyormu"+strFind1);
			
			contains= Arrays.asList(strMonths).contains(strFind1);
			System.out.println("içeriyormu"+strFind2);


	}
}
