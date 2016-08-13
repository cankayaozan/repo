package tr.org.linux.kamp2016inheritance;

public abstract class Animal  {
	protected String name;
	
	public Animal(String name){
		this.name=name;
	}
	
	
	
	
public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




public abstract  void breath();
	
	public  abstract  void eat();
	
	public abstract  void sleep();
	
	}
	
	
	


