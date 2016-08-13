package tr.org.linux.kamp;

public class StringLength {

public static void main(String args[]){
		
		String[] strArray = new String[] {"edip","turgut","cemal",""};
		
		int length= strArray.length;
		System.out.println("string array"+length);
		
		for(int i=0;i<length-1;i++){
			System.out.println(strArray[i]);
		}
}
}