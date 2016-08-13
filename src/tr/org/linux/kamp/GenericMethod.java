package tr.org.linux.kamp;

public class GenericMethod {

	
	public static <A> void printArray(A[] inputArray){
		
		for(A element : inputArray){
			
			System.out.println(element);
			
		}
		
		
	}
}
