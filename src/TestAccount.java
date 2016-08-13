import java.util.Scanner;

public class TestAccount {

	
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		double balance= 200.00;
				System.out.println("idyi giin");
		int id= input.nextInt();
		
		Account account1= new Account(balance, id);
		account1.getBalance();
		System.out.println("cekilecek miktarý girin");
		int cek= input.nextInt();
		account1.withDraw(cek);
		
		System.out.println(account1.getBalance());
	}
}
