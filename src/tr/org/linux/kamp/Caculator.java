package tr.org.linux.kamp;

import java.util.Scanner;

public class Caculator {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		boolean ctn = true;
		while (ctn) {

			System.out.println("bir sayý giriniz");
			double input1 = input.nextDouble();

			System.out.println("bir islem giriniz");

			String islem = input.next();
			double result = 0;
			switch (islem) {
			case "+":
				System.out.println("bir sayý  daha giriniz");
				double input2 = input.nextDouble();
				result = input1 + input2;
				System.out.println(result);
				break;
			default:
				System.out.println("olmaaz");
				break;
			}

			System.out.println("devammý tamam mý");
			String ctnString = input.next();
			if (ctnString == "H") {

				ctn = false;
				System.out.println("bitti");
			}
			

		}
	}

}
