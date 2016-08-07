package tr.org.linux.kamp;

public class Interest {

	public static void main(String[] args){
		
		double amount;
		double principal=1000;
		double rate= 0.05;
		
		System.out.printf("%s %20s %n", "yýl:", "faizli para");
		for(int year=1; year <=10; ++year){
			amount= principal*Math.pow(1.0+rate, year);
			System.out.printf("%-4d%, 2.2f%n",year,amount);
		}
		
	}
}
