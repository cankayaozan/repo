package tr.org.linux.kamp;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String args[]){
		int total = 0;
		int gradeCounter=0;
		int aCount=0;
		int bCount=0;
		int cCount=0;
		int dCount=0;
		int eCount=0;
		int fCount=0;

	Scanner input = new Scanner(System.in);
		
		System.out.println(" arasý notlarý giriniz "+"notlarý girdikten sonra harf notu dagýlýmýný hesaplamak için "+"ctrl z komutunu veriniz");
		
		while(input.hasNext()){
			int grade = input.nextInt();
			total+=grade;
			++gradeCounter;
			
			switch(grade/10){
			
			case 9:
			case 10:
				++aCount;
				break;
			case 8:
				++bCount;
				break;
			case 7:
				++cCount;
				break;
			case 6: 
				++dCount;
				default:
					//else gibi
					++fCount;
					break;
			}
		}
	System.out.println("notlarýn durumu:");
	if(gradeCounter!=0){
		double average = (double) total/gradeCounter;
		System.out.println(gradeCounter+"adet notun toplamý");
				
		System.out.println(Counter+"adet not ortalamasý"+average);
		
		System.out.println("harf notlarýna göre ögrenci sayýsý"
				+"A:"+aCount+"B"+bCount+"C"+cCount+"D"+dCount+"F"+fCount);
		
		
		
	}
	else 
		System.out.println("not girilmedi");
	}
	
	
}
