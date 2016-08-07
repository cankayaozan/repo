package tr.org.linux.kamp;

public class MutableTest {
	
	public static void main(String args[]){
		Mutable mut= new Mutable(30);
		Immutable immut = new Immutable(55);
		
		mut.setValue(20);
		//mut ta deger deðiþebilir.
		System.out.println(mut.getValue());
		System.out.println(immut.getValue());
		
		
	}

}
