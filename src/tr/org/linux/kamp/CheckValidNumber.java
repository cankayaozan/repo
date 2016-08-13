package tr.org.linux.kamp;

public class CheckValidNumber {
	public static void main(String args[]){

		String[] str = new String[]{"10.20","1234","12.at"};

		
				for(int i=0;i<str.length;i++){
					if(str[i].indexOf(".")>0){
					try{
						Double.parseDouble(str[i]);
						System.out.println(str[i]+"geçerlidir");
					}.
					catch(NumberFormatException nme){
						System.out.println("geçerli degil");
					}
				}
		else
		{
			try{
				Integer.parseInt(str[i]);
				System.out.println(str[i]+"geçerli");
				
			}
			catch(NumberFormatException nme){
				System.out.println("geçerli degil");
			}
		}
			
			
		}
		}		

}
