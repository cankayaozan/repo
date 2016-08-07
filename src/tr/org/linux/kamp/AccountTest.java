package tr.org.linux.kamp;

import java.util.Scanner;

public class AccountTest {

	public static void main(String args[]) {

		Account account1 = new Account("Ali Veli", 50.00);
		System.out.println(account1.getName() + "nin bakiyesi" + account1.getBalance());
		Scanner input = new Scanner(System.in);
		// ctrl shift o
		System.out.println("yatýrmak istediðiniz parayý girin");
		double depositAmount = input.nextDouble();
		//nexDouble sonsuz input imkaný veriyor.
		System.out.println(depositAmount + "TL" + account1.getName() + "kiþinin hesabýna ekleniyor..");

		account1.deposit(depositAmount);
		System.out.println(account1.getName() + "nin bakiyesi" + account1.getBalance());
	}
}
