package tr.org.linux.garbagecollector;

public class MyClass2 {

	
	int i;
	public MyClass2(int i){
		
		this.i=i;
	}
	
	protected void finalize() throws Throwable{
		
		System.out.println("finalize methodudan gelen i ="+i);
		super.finalize();
		
	}
}
