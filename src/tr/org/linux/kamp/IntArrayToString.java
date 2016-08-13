package tr.org.linux.kamp;

import java.util.Arrays;

public class IntArrayToString {

	public static void main(String args[]) {

		int[] intNumbers = new int[] { 1, 2, 3, 4, 5 };
		StringBuffer sBuffer = new StringBuffer();
		
		String strSeperator="";
		
		if(intNumbers.length>0){
			
			sBuffer.append(intNumbers[0]);
			
			for(int i=1;i<intNumbers.length;i++){
				
				sBuffer.append(strSeperator).append(intNumbers[i]);
			}
		}
		
		System.out.println("int arrayi stringe dönütürüyor");
		
		System.out.println(sBuffer.toString());
		
		String strNumbers = Arrays.toString(intNumbers);
		System.out.println("string arrayç.tostring medtodulflhdfh");
		
		strNumbers= strNumbers.replaceAll(",",strSeperator).replace("[", "").replaceAll("]", "");
		
		System.out.println(strNumbers+"afadf");
	}
}
