package tr.org.linux.garbagecollector;

public class MyClassTest {

	
	public static void main(String[] args){
		
		MyClass2 obj1= new MyClass2(10);
		MyClass2 obj2= new MyClass2(20);
		
		try{
			obj1.finalize();
			//obj1 i bellekten sildik
		}
		catch(Throwable e){
			e.printStackTrace();
			
		}
obj1= obj2;
System.out.println("bitti");
	}
}
