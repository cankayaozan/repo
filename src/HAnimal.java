
public abstract class HAnimal {

	String name;
	public HAnimal(){
		name= "hayvan";
	}
	public HAnimal(String name){
		this.name=name;
	}
	
	public abstract void breath();
	public abstract void eat();

	public abstract void sleep();

}
