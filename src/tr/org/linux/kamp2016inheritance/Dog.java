package tr.org.linux.kamp2016inheritance;

public class Dog extends Mammal{
	
	public Dog(String name){
		super(name);
	}
	
	 public void eat(){
		System.out.println("it can eat");
	}
	
	 public void breath(){
			System.out.println("it can breath");
		}
	 public void sleep(){
			System.out.println("it can sleep");
		}
}

