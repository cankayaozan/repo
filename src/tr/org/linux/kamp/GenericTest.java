package tr.org.linux.kamp;

public class GenericTest {

	public static void main(String args[]){
		GenericMethod newGenericMethod= new GenericMethod();
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray={1.5,2.5,3.5,4.0};
		String[] stringArray={"h","o","r","s","e"};
		
		System.out.println("int array elemans");
		
		newGenericMethod.printArray(intArray);
		newGenericMethod.printArray(doubleArray);
		newGenericMethod.printArray(doubleArray);

	}
}
