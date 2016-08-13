package tr.org.linux.kamp;

import java.util.Scanner;

public class hocaBoolean {
	
	
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		String mail= "mail";
		
		while(mail.isEmpty()){
			System.out.println("enter email");
			mail= input.nextLine();
			if(!mail.isEmpty()){
				if(isValid(mail)){
					System.out.println("valid");
				}
				else 
					System.out.println("not valid");
			}
		}
	}

	public static boolean isValid(String email){
		
		if(email.contains("")){
			return false;
		}
		
		if(!email.contains("@")){
			return false;
		}
		if(!email.contains(".")){
			return false;
	}
		
		if(email.startsWith("@")|| email.startsWith(".")){
			return false;
		}
		
		//mail@
		
		if(!(email.indexOf('@')+1<email.lastIndexOf('.'))){
			return false;
		}

		if(!(email.indexOf('@')+2<email.length())){
			return false;
			
		}
		return true;
}
	
}