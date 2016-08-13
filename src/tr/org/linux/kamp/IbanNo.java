package tr.org.linux.kamp;

import java.util.Scanner;

public class IbanNo {

	
	public static void main(String args[]){
		
		System.out.println("ibaný gir ");
		Scanner input = new Scanner(System.in);
		String iban= input.nextLine();
		System.out.println(isValid(iban));
		if(isValid(iban))
			System.out.println("country code"+iban.substring(0,2) + " digits:"+iban.substring(2, iban.length()));
		
	}
	
	public static boolean isValid(String iban){
		
		String sub= iban.substring(2, iban.length()-1);
		char [] karakter = new char[sub.length()];
		if(iban.length()!=26)
			return false;
		if(iban.charAt(0)!='T' && iban.charAt(1)!='R')
			return false;
		
		
		for(int i=0;i<sub.length();i++){
			karakter[i]= sub.charAt(i);
			if(!(Character.isDigit(karakter[i])))
				return false;
			
				
					
			
			
		
		}
		
		if(karakter[0]!='3'&& karakter[1]!='4')
			return false;
		return true;
	}
	
	}


