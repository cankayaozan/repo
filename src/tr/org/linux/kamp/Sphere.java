package tr.org.linux.kamp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {

	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		System.out.println("yaricapi girin");
			try{
				double radius= input.nextDouble();
				System.out.println("volume"+volume(radius));
			}
			catch(InputMismatchException e){
				System.out.println("sayý gir");
			}
		
		

	}
	public static double volume(double radius){
		
		double volume= (4.0/3.0)*Math.PI*Math.pow(radius, 3);
return volume;
	}
}
