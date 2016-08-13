package tr.org.linux.kamp;

public class deneme {

	public static void main(String args[]){
		
		String s1 = "hello world";
		if(s1.equals("hello world"))
        System.out.println("esit");
		else
	        System.out.println("esit degil");

		if(s1.contains("hello"))
	        System.out.println("var");
			else
		        System.out.println("yok içermiyor");	
		
		String s2 = new String("A");
		String s3 = new String("a");

		String s4 = new String("b");

		String s5 = new String("A");

        System.out.println(s2.compareTo(s3));	
        
        System.out.println(s3.compareTo(s2));
        System.out.println(s2.compareTo(s5));
        System.out.println(s2.compareTo(s4));
        




		}
}
