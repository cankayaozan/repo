package tr.org.linux.kamp;

import java.util.Scanner;

public class MaxFinder {

	
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("l�tfen aralar�na bosluk koyarak 3 say� tan�mlay�n");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		double result = maximum(number1,number2,number3);
		
		System.out.println("max say�:"+result);
	}
	public static double maximum(double x, double y, double z){
		double maxValue=x;
		if(y> maxValue)
			maxValue=y;
		if(z>maxValue)
			maxValue=z;
		return maxValue;
	}
}
