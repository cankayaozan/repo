import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class YasýnKac {

	public static void main(String args[]){
		long aliveDays;
		
		Scanner input = new Scanner(System.in);
		System.out.println("yaþ kaç...... enter your birth day month and year");
		int bornDay= input.nextInt(); 
		int bornMonth= input.nextInt();

		int bornYear= input.nextInt();
		
		
		LocalDate dateExample2 = LocalDate.of(bornYear, bornMonth, bornDay);

		
		 LocalDate dateExample = LocalDate.of(2016, 8, 10);
		
      aliveDays= ChronoUnit.DAYS.between(dateExample2, dateExample);
		System.out.println(aliveDays);

	}
}
