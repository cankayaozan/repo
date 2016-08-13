package tr.org.linux.kamp;

public class SumArray {
	
	public static void main(String[] args){
		
		int[] erey= new int[10];
		for(int i=0;i<erey.length;i++){
			
			erey[i]=i;
		}
		int sum=0;
		for(int i=0;i<erey.length/2;i++){
			//sum += erey[i];
			erey[i]=erey[erey.length-i];
		System.out.println(sum);
			}
		//System.out.println(erey[i]);
	}
	
//	public static int sumArray(int [] array){
//		
//		int sum=0;
//		for(int i=0;i<array.length;i++){
//			sum += erey[i];
//	return sum;
//			
	
//			
//	}
//
//}
}
