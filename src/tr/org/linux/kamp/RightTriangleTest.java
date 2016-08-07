package tr.org.linux.kamp;

public class RightTriangleTest {
	public static void main(String args[]) {

		// Scanner input= new Scanner(System.in);
		// String soru= "random mu degilmi r/d";
		// String cevap = input.next();
		//
		//
		// if(cevap == "d"){
		// System.out.println("bir kenarý girin");
		// double a = input.nextDouble();
		// System.out.println("diger kenarý girin");
		// double b = input.nextDouble();
		// System.out.println("a: "+(int)a+"b: "+(int) b+" hiptenus: "+(int)
		// tri1.hypo(a, b)+"area: "+ (int) tri1.area(a, b)+"perimter:
		// "+(int)tri1.peri(a, b));
		//
		//
		// }
		//

		// else if(cevap != "d"){
		for (int i = 1; i < 10; i++) {

			double a = Math.random() * 50;

			double b = Math.random() * 50;
			RightTriangle tri1 = new RightTriangle(a, b);

			// System.out.println("a: "+(int)a+"b: "+(int) b+" hiptenus: "+(int)
			// tri1.hypo(a, b)+"area: "+ (int) tri1.area(a, b)+"perimter:
			// "+(int)tri1.peri(a, b));
			System.out.println(tri1);

		}

	}

}
