package tr.org.linux.kamp;

import java.util.Scanner;

public class EmailValidity {

	
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		String mail= "giris";
		
		while(!mail.equals("")){
			
			System.out.println("bir mail giriniz");
			mail= input.nextLine();
			
			isValid(mail);
			
			
			
		}
		
		
	}
	
	public static void isValid(String mail){
		char [] checker=new char[mail.length()];
		int noktayeri=-1;
		int atyeri=-1;
		String hata=" ";
		String hata2=" ";
		String hata3=" ";
		int hata4=0;
		int hata5=0;
int fark=5;

		
		for(int i=0;i<mail.length();i++){
			checker[i]= mail.charAt(i);
			if(checker[i]==' ')
			 hata="bosluk var hatasý";
			if(checker[i]!='@'){
				//hata4;
			}
			if(checker[i]!='.')
                hata5+=1;
			
			if(checker[i]=='.')
				 noktayeri= i;
			if(checker[i]=='@'){
				atyeri=i;
				hata4+=1;
			}
			fark=atyeri-noktayeri;
			if(Math.abs(fark)<=1){
				hata2=". ile @ arasý gereken bosluk yok hatasý";
				
			}
			if(mail.length()<noktayeri+2)
				hata3="noktadan sonra 2 karakter yok hatasý";
			
			


			


			

				
				
				
				
				
			
			
		}
			System.out.println("hata var hata kodu:"+hata+"  ve  "+hata2+" ve "+hata3);
			if(hata4<1)
			System.out.println("@yok hatasý");
		
			if(hata5<1)
				System.out.println("@yok hatasý");
			

		
		
	}
}
