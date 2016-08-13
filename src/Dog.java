
public class Dog extends HMammal implements Carnivore{

	
	public Dog(String name){
		
		super(name);
	}
	
	@Override
	
	public void hunt(){
		
		System.out.println(name+"kedi avlar");
	}
	
	
	public void eat(){
		
		System.out.println(name+"kedi yer mi yav mal mýsýn");
	}
	
}
