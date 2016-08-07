package tr.org.linux.kamp;

public class RightTriangle {

	
	private double a;
	private double b;
	
	public RightTriangle(double a, double b){
		
		if(a>0)
			this.a=a;
		if(b>0)
			this.b=b;
		
		
	}
	@Override
	public String toString(){
       return 	"a:  "+(int)a+	"b:  "+(int) b+"  hiptenus:  "+(int) hypo(a, b)+"area:  "+ (int) area(a, b)+"perimter:  "+(int)peri(a, b);

	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double hypo(double x, double y){
		double hypotenus= Math.sqrt(x*x+y*y);
		return hypotenus;
	}
	
	public double peri(double x, double y){
		double perimeter= Math.sqrt(x*x+y*y)+x+y;
		return perimeter;
	}
	
	public double area(double x, double y){
		double area= x*y/2;
		return area;
	}
}
