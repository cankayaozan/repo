
public class Cat extends HMammal implements Carnivore {
	
	String furColor;
	String catPsy;

	String eyeColor;
	int age;
	
	public Cat(String name,String catPsy, 	String eyeColor,int age){
		
		super(name);
		this.furColor= furColor;
	}

	public void meow(){
		System.out.println(name+"says meow");
	}
	@Override
	public void hunt(){
		System.out.println("fare avlar"+name);
	}
	

	
}
