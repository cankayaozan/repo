package tr.org.linux.kamp;

public class Animall {

	
	private String name;
	private int age;
	private String type;
	
	public Animall(String name, int age, String type) {
		// constructer
		this.name = name;
		this.type= type;
		if(age>0 && age<100)
			this.age=age;
	}
		
	public int getAge() {
		// method
		return age;
}
	public String getType() {
		// method
		return type;
	}
	public String getName() {
		// method
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setName(int age) {
		this.age = age;
	}
}