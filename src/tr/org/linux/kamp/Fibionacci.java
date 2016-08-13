package tr.org.linux.kamp;

import java.util.Scanner;

public class Fibionacci {
	
	private int dizinum;
	
	public Fibionacci(int dizinum){
		this.dizinum=dizinum;
	
	}
	
	public int fibo(int dizinum){
		int dizi=0;
		for(int i=1; i<dizinum;i++){
			
			dizi +=i;
			
		}
		return dizi;
		
	}
}
